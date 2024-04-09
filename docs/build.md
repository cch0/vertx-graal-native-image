# How To Build

## Building Container Image Using Jib

Without using GraalVM, we can build and containerize the application using [jib-maven-plugin](https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin).
The base image to use is specified by the **base.image.version** property in `pom.xml` file.


```bash
mvn clean compile jib:dockerBuild
```

The built image can be seen in the registry by using `docker images` command.

```bash
REPOSITORY                       TAG                     IMAGE ID       CREATED          SIZE
demo-native                      latest                  e7e0b9b3bb24   7 seconds ago    297MB
```

## Building Native Image Using GraalVM

With Graalvm, we can build the native executable binary using the following command

```bash
mvn -Pnative clean native:compile
```

The executable is located at `target/demo-native`. The name is configured by `imageName` property for the **native-maven-plugin** in the `pom.xml` file.

<br>
