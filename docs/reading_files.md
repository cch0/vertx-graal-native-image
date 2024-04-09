# Reading Files

After configuing `resource-config.json`, we are able to access resources such as reading files by using `Class.getResource()` or `Class.getResourceAsStream()`.

While reading files is now possible, Vert.x makes it easy for us by providing `vertx-config` library. You can see an example in `MainVerticle` clas where we are reading the `json/sample.json` file in the `loadFile` method.

In this method, we first create `ConfigStoreOptions` to specify the location, format and type of the file to read. We then create `ConfigRetriever`, configure a listener and register a handler to respond to file change.

Once file is read in, the logging output shows the content of the file (for illustration purpose).

Although reading files is possible, these files are, however, bundled together with the application. There will be times when we like to modify logging level in `logback.xml` file or modify other json config files on the fly when application is running. It would be very useful to be able to override configuration using external files.

See [Override with External Files](./external_files.md) for details.

<br>
