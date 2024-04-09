# Overriding Configurations With External Files

There will be times when we would like to override on the fly for the configruations that are built in into the application when application is currently running without having to rebuild it just to make the configuration changes.

`vertx-config` library makes it easy to setup a listenr and change handler for this. All we have to do is to provide external files at a place where they are expected by the application.

---

## Logback Configuration

In `resource-config.json` file we specify that `logback.xml` is to be included in the application's executable binary. What is not so obvious is that this file is to be expected to exist at the same directory as the binary itself (the lack of subdirectory in the pattern value).

```
{
  "resources": {
    "includes": [
      {"pattern": "logback.xml$"}
    ]
  }
}
```

When `logback.xml` is built it, it is available at `/logback.xml`.


To override the existing built-in `logback.xml`, we place the external `logback.xml` file along side with the `demo-native`.


```
-rwxr-xr-x  1 cch  staff  49132504 Apr  9 07:44 demo-native
-rw-r--r--  1 cch  staff       355 Apr  9 07:43 logback.xml
```


That is it. Restart the application.

To verify the change, for example, you can change the logging level.

Note that changing `logback.xml` on the fly is NOT supported.


---

## Json Files


In `resource-config.json` file we specify that json files under `src/main/resources/json` directory to be included in the application's executable binary.

```
{
  "resources": {
    "includes": [
      {"pattern": "json/.*.json$"}
    ]
  }
}
```

To override the existing built-in json file, we place the external json file under `json` directory.


```
.
├── demo-native
└── json
    └── sample.json
```


That is it.

To verify the change, for example, you can change content of the `sample.json` file.

The following output shows the file content `{"key1":"value1"}` when the application starts up.

And the output shows the content after we made the change to become `{"key1":"value3"}`. The change was detected by the listener we configured.


```
2024-04-09 08:19:32.251 [vert.x-eventloop-thread-0] INFO  com.demo.MainVerticle.lambda$loadFile$0:43 - Successfully retrieved file: json/sample.json
2024-04-09 08:19:32.251 [vert.x-eventloop-thread-0] INFO  com.demo.MainVerticle.lambda$loadFile$0:47 - file content: {"key1":"value1"}
2024-04-09 08:19:32.252 [vert.x-eventloop-thread-1] INFO  com.demo.Main.lambda$main$0:27 - ✅ Started



2024-04-09 08:19:45.250 [vert.x-eventloop-thread-0] INFO  com.demo.MainVerticle.handleConfigChange:63 - Received ConfigChange, content: {"key1":"value3"}
```

<br>

