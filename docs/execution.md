# Run The Application

## Running As Container

Assuming the image name is `demo-native`, from the command line,


```bash
docker run -it demo-native
```

Output:
```bash
01:10:36,978 |-INFO in ch.qos.logback.classic.LoggerContext[default] - This is logback-classic version 1.5.3
01:10:36,979 |-INFO in ch.qos.logback.classic.util.ContextInitializer@694e1548 - No custom configurators were discovered as a service.
01:10:36,979 |-INFO in ch.qos.logback.classic.util.ContextInitializer@694e1548 - Trying to configure with ch.qos.logback.classic.joran.SerializedModelConfigurator
01:10:36,980 |-INFO in ch.qos.logback.classic.util.ContextInitializer@694e1548 - Constructed configurator of type class ch.qos.logback.classic.joran.SerializedModelConfigurator
01:10:36,985 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.scmo]
01:10:36,985 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.scmo]
01:10:36,992 |-INFO in ch.qos.logback.classic.util.ContextInitializer@694e1548 - ch.qos.logback.classic.joran.SerializedModelConfigurator.configure() call lasted 6 milliseconds. ExecutionStatus=INVOKE_NEXT_IF_ANY
01:10:36,992 |-INFO in ch.qos.logback.classic.util.ContextInitializer@694e1548 - Trying to configure with ch.qos.logback.classic.util.DefaultJoranConfigurator
01:10:36,992 |-INFO in ch.qos.logback.classic.util.ContextInitializer@694e1548 - Constructed configurator of type class ch.qos.logback.classic.util.DefaultJoranConfigurator
01:10:36,993 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [/logback.xml]
01:10:36,993 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
01:10:36,995 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [file:/app/resources/logback.xml]
01:10:37,071 |-INFO in ch.qos.logback.core.model.processor.AppenderModelHandler - Processing appender named [STDOUT]
01:10:37,071 |-INFO in ch.qos.logback.core.model.processor.AppenderModelHandler - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
01:10:37,076 |-INFO in ch.qos.logback.core.model.processor.ImplicitModelHandler - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
01:10:37,086 |-INFO in ch.qos.logback.classic.model.processor.RootLoggerModelHandler - Setting level of ROOT logger to INFO
01:10:37,087 |-INFO in ch.qos.logback.core.model.processor.AppenderRefModelHandler - Attaching appender named [STDOUT] to Logger[ROOT]
01:10:37,087 |-INFO in ch.qos.logback.core.model.processor.DefaultProcessor@aecb35a - End of configuration.
01:10:37,087 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@382db087 - Registering current configuration as safe fallback point
01:10:37,087 |-INFO in ch.qos.logback.classic.util.ContextInitializer@694e1548 - ch.qos.logback.classic.util.DefaultJoranConfigurator.configure() call lasted 95 milliseconds. ExecutionStatus=DO_NOT_INVOKE_NEXT_IF_ANY
2024-04-09 01:10:37.088 [main] INFO  com.demo.Main.main:20 - logback.configurationFile /logback.xml
2024-04-09 01:10:37.226 [vert.x-eventloop-thread-0] INFO  com.demo.MainVerticle.lambda$loadFile$0:43 - Successfully retrieved file: json/sample.json
2024-04-09 01:10:37.226 [vert.x-eventloop-thread-0] INFO  com.demo.MainVerticle.lambda$loadFile$0:47 - file content: {"key1":"value1"}
2024-04-09 01:10:37.229 [vert.x-eventloop-thread-1] INFO  com.demo.Main.lambda$main$0:27 - ✅ Started
```

<br>

---

## Running As Executable

Assuming the built binary is located at `target/demo-native`, from the same directory,

```bash
./target/demo-native
```

Output:

```bash
18:17:55,387 |-INFO in ch.qos.logback.classic.LoggerContext[default] - This is logback-classic version 1.5.3
18:17:55,387 |-INFO in ch.qos.logback.classic.util.ContextInitializer@2eccc1cd - No custom configurators were discovered as a service.
18:17:55,387 |-INFO in ch.qos.logback.classic.util.ContextInitializer@2eccc1cd - Trying to configure with ch.qos.logback.classic.joran.SerializedModelConfigurator
18:17:55,387 |-INFO in ch.qos.logback.classic.util.ContextInitializer@2eccc1cd - Constructed configurator of type class ch.qos.logback.classic.joran.SerializedModelConfigurator
18:17:55,387 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.scmo]
18:17:55,387 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback.scmo]
18:17:55,387 |-INFO in ch.qos.logback.classic.util.ContextInitializer@2eccc1cd - ch.qos.logback.classic.joran.SerializedModelConfigurator.configure() call lasted 0 milliseconds. ExecutionStatus=INVOKE_NEXT_IF_ANY
18:17:55,387 |-INFO in ch.qos.logback.classic.util.ContextInitializer@2eccc1cd - Trying to configure with ch.qos.logback.classic.util.DefaultJoranConfigurator
18:17:55,387 |-INFO in ch.qos.logback.classic.util.ContextInitializer@2eccc1cd - Constructed configurator of type class ch.qos.logback.classic.util.DefaultJoranConfigurator
18:17:55,388 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [/Users/cch/work/personal/vertx-native-image/logback.xml]
18:17:55,388 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Could NOT find resource [logback-test.xml]
18:17:55,388 |-INFO in ch.qos.logback.classic.LoggerContext[default] - Found resource [logback.xml] at [resource:/logback.xml]
18:17:55,388 |-INFO in ch.qos.logback.core.joran.spi.ConfigurationWatchList@6b6f4fc3 - URL [resource:/logback.xml] is not of type file
18:17:55,399 |-INFO in ch.qos.logback.core.model.processor.AppenderModelHandler - Processing appender named [STDOUT]
18:17:55,399 |-INFO in ch.qos.logback.core.model.processor.AppenderModelHandler - About to instantiate appender of type [ch.qos.logback.core.ConsoleAppender]
18:17:55,401 |-INFO in ch.qos.logback.core.model.processor.ImplicitModelHandler - Assuming default type [ch.qos.logback.classic.encoder.PatternLayoutEncoder] for [encoder] property
18:17:55,402 |-INFO in ch.qos.logback.classic.model.processor.RootLoggerModelHandler - Setting level of ROOT logger to INFO
18:17:55,402 |-INFO in ch.qos.logback.core.model.processor.AppenderRefModelHandler - Attaching appender named [STDOUT] to Logger[ROOT]
18:17:55,402 |-INFO in ch.qos.logback.core.model.processor.DefaultProcessor@6d6e5bf6 - End of configuration.
18:17:55,402 |-INFO in ch.qos.logback.classic.joran.JoranConfigurator@11b176c6 - Registering current configuration as safe fallback point
18:17:55,402 |-INFO in ch.qos.logback.classic.util.ContextInitializer@2eccc1cd - ch.qos.logback.classic.util.DefaultJoranConfigurator.configure() call lasted 15 milliseconds. ExecutionStatus=DO_NOT_INVOKE_NEXT_IF_ANY
2024-04-08 18:17:55.402 [main] INFO  com.demo.Main.main:20 - logback.configurationFile /Users/cch/work/personal/vertx-native-image/logback.xml
2024-04-08 18:17:55.414 [main] WARN  i.n.r.d.DnsServerAddressStreamProviders.<clinit>:70 - Can not find io.netty.resolver.dns.macos.MacOSDnsServerAddressStreamProvider in the classpath, fallback to system defaults. This may result in incorrect DNS resolutions on MacOS. Check whether you have a dependency on 'io.netty:netty-resolver-dns-native-macos'
2024-04-08 18:17:55.418 [vert.x-eventloop-thread-0] INFO  com.demo.MainVerticle.lambda$loadFile$0:43 - Successfully retrieved file: json/sample.json
2024-04-08 18:17:55.418 [vert.x-eventloop-thread-0] INFO  com.demo.MainVerticle.lambda$loadFile$0:47 - file content: {"key1":"value1"}
2024-04-08 18:17:55.418 [vert.x-eventloop-thread-1] INFO  com.demo.Main.lambda$main$0:27 - ✅ Started
```

<br>
