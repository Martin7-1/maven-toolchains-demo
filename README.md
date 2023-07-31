# Maven Toolchains Demo

## What is Maven Toolchains

> see [Guide to Using Toolchains](https://maven.apache.org/guides/mini/guide-using-toolchains.html)

Maven Toolchains 为 plugin 提供了一种在构建过程中发现要使用什么 JDK (或其他工具)的方法，而不需要在每个插件或每个 pom.xml 中配置它们，也不需要在构建项目的每台机器中强制设置精确的位置。

使用 Maven Toolchains 来配置 JDK Toolchains，可以让项目构建在特定的 JDK 上，而不是使用 Maven 运行的 JDK。

## How to Run the demo

可以使用以下命令进行 demo 构建和测试，测试通过说明构建正确

```shell
mvn clean package -gt toolchains.xml -Pjdk-17-test -Pjdk-11-compile
```

使用 `java -jar ./target/toolchains-demo-1.0-SNAPSHOT.jar` 命令运行，正确结果为

```bash
false
true
```