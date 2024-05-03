# Vertx Graal Native Image Demo Application

This is a project which uses [GraalVM](https://www.graalvm.org/) to build a native image of a basic Vert.x application.


For comparison, the application can also be containerized by using Jib.

## The Application

This repository contains the source code for running a basic Vert.x application with as few Verticles as possible.
The idea is to provide configuration examples to illustrate various aspects of configuring the application.


## What is illustrated in this application?

- Basic Vert.x application.
- Logging configuration via Logback.
- External Override of Logback configuration.
- External and Dyanmic configuration file reload.
- Native executable binary.
- Containerization


## What is not included in this application?
- Setting Gabage collector
    - G1 collector is not yet supported on MacOS arm64.


## What is the catch?
- No cross-compile support.
    - Have to use machines with different OS and platforms to  build the native image for each OS/platform.


---


## Prerequisistes

The Java release version is set to **22** for `maven-compiler-plugin` in the `pom.xml` file.

GraalVM can be installed via sdkman

```bash
sdk install java 22-graalce
```



## How To Build

See [How To Build](./docs/build.md)

## How To Run The Application

See [How To Run](./docs/execution.md)

## How To Configure Logging

See [Logging](./docs/logging.md)

## How To Read Files

See [Reading Files](./docs/reading_files.md)

## Hoe To Override Configurations with External Files

See [Override with External Files](./docs/external_files.md) for details.


<br>
