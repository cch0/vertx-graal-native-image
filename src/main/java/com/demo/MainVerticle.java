package com.demo;

import io.vertx.config.ConfigChange;
import io.vertx.config.ConfigRetriever;
import io.vertx.config.ConfigRetrieverOptions;
import io.vertx.config.ConfigStoreOptions;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainVerticle extends AbstractVerticle {
  private static Logger logger = LoggerFactory.getLogger(MainVerticle.class);
  private long configScanPeriodMilli = 1000;

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    String filename = "json/sample.json";

    this.loadFile(filename, startPromise);
  }

  private void loadFile(String filename, Promise<Void> promise) {

    ConfigStoreOptions file =
        new ConfigStoreOptions()
            .setType("file")
            .setFormat("json")
            .setOptional(false)
            .setConfig(new JsonObject().put("path", filename));

    ConfigRetriever retriever =
        ConfigRetriever.create(
            vertx,
            new ConfigRetrieverOptions().setScanPeriod(configScanPeriodMilli).addStore(file));

    retriever
        .getConfig()
        .onComplete(
            asyncResult -> {
              if (asyncResult.succeeded()) {
                logger.info("Successfully retrieved file: {}", filename);

                JsonObject content = asyncResult.result();

                logger.info("file content: {}", content);

                retriever.listen(this::handleConfigChange);

                promise.complete();
              } else {
                logger.info("Failed to retrieve file: {}", filename, asyncResult.cause());

                promise.fail(asyncResult.cause());
              }
            });
  }

  public void handleConfigChange(ConfigChange configChange) {
    JsonObject newConfiguration = configChange.getNewConfiguration();

    logger.info("Received ConfigChange, content: {}", newConfiguration);
  }
}
