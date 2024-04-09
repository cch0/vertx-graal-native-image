# How To Build

## Building Container Image Using Jib

Without using GraalVM, we can build and containerize the application using [jib-maven-plugin](https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin).
The base image to use is specified by the **base.image.version** property in `pom.xml` file.

From the command line,

```bash
mvn clean compile jib:dockerBuild
```

The built image can be seen in the registry by using `docker images` command.

```bash
REPOSITORY                       TAG                     IMAGE ID       CREATED          SIZE
demo-native                      latest                  e7e0b9b3bb24   7 seconds ago    297MB
```

Note that we can also configure `jib-maven-plugin` to specify the platform OS and architecture. If you are using **arm64**, you can un-comment the `platforms` section. If your build environment supports multiple platforms, you can add additional `platform` section for other platform you want to support.


---

## Building Native Image Using GraalVM

With Graalvm, we can build the native executable binary using [native-maven-plugin](https://graalvm.github.io/native-build-tools/latest/maven-plugin.html).

From the command line,

```bash
mvn -Pnative clean native:compile
```

The **native** Maven profile is added to allow us the opportunity to build the binary when profile is active.

The executable is located at `target/demo-native`. The name is configured by `imageName` property for the **native-maven-plugin** in the `pom.xml` file.

To understand the build arguments needed for building the application, see [Native Build Configurations](./native.md) for details.


<br>
