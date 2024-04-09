# Native Image Build Configurations

The **vertx-core** dependency this application has comes with the dependencies on various **Netty** libraries.

It seems this **Netty** libraries present some challenges when building a native executable. We can resolve these by providing build arguments to the `native-image` in the `native-image.properties` file. More specifically, the `initialize-at-run-time` and `trace-object-instantiation` arguments.

The way to determine which classes to be added with `initialize-at-run-time` argument is coming from the `native-image` error output when building the application. Based on the suggestion, class is added one by one until there is no more error.

Additionally, we also specify the `-H:Log=registerResource:3` argument to see more details about which resources are included and `-H:+UnlockExperimentalVMOptions` to unlock experimental options.


## Further reading
- [Embed a Configuration File](https://www.graalvm.org/latest/reference-manual/native-image/overview/BuildConfiguration/#embed-a-configuration-file)


<br>

