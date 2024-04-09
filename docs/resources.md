# Resources Configuration

Unlike Spring Boot or Vert.x applicatioin, resource files that are on the classpath will not be added to binary executable by **native-image** by default. This includes the **src/main/resources** directory.


To instruct **native-image** which resources to be included and/or excluded. The recommended approach is to configure `resource-config.json` file under `src/main/resources/META-INF/native-image` directory.

To avoid the situation when each application's dependency has its own native configuration and causes overlapping, it is highly recommended to use subdirectories within **META-INF/native-image** directory.

For this application, the `resource-config.json` file is placed under `src/main/resources/META-INF/native-image/com.demo/demo-native` directory. `com.demo` is maven group ID and `demo-native` is the artifact ID configured in `pom.xml` file.


In the `resource-config.json` file we specify that
- `logback.xml` file to be included.
- Files that match `json/.*.json` pattern will be included. This patten includes all `.json` files under `src/main/resources/json` directory.


## Further reading
- [Embed a Configuration File](https://www.graalvm.org/latest/reference-manual/native-image/overview/BuildConfiguration/#embed-a-configuration-file)

- [Accessing Resources in Native Image](https://www.graalvm.org/latest/reference-manual/native-image/dynamic-features/Resources/)


<br>
