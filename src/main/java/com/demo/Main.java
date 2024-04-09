package com.demo;

import io.vertx.core.Vertx;
import io.vertx.core.logging.SLF4JLogDelegateFactory;
import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static Logger logger;

  public static void main(String[] args) {
    File logbackFile = new File("logback.xml");
    System.setProperty("logback.configurationFile", logbackFile.getAbsolutePath());
    System.setProperty(
        "vertx.logger-delegate-factory-class-name", SLF4JLogDelegateFactory.class.getName());

    logger = LoggerFactory.getLogger(Main.class);

    logger.info("logback.configurationFile {}", logbackFile.getAbsolutePath());

    Vertx.vertx()
        .deployVerticle(new MainVerticle())
        .onComplete(
            async -> {
              if (async.succeeded()) {
                logger.info("✅ Started");
              } else {
                logger.warn("🚨 Deployment failed", async.cause());
              }
            });
  }
}
