# Logging

Log4j2 is my preferred logging library but according to this ticket [LOG4J2-2649](https://issues.apache.org/jira/browse/LOG4J2-2649), this library has not yet supported native compilation. The tracking ticket in Github is issue [1539](https://github.com/apache/logging-log4j2/issues/1539).

In the mean time, the next available logging library is Logback and is what this application is configured with.

## Maven Dependency

We only have to add the dependency on `logback-classic` library and it will bring in `slf4j-api` dependency.


```xml
<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>${logback-classic.version}</version>
</dependency>
```


## Configuration

We can customize logging configuration through `logback.xml` file. This file can be placed under `src/main/resouces` directory and we will make it available to `native-image` when building the binary.


See [Resources](./resources.md) for details.


<br>
