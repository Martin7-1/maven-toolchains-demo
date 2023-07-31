# 使用如下命令即可实现在 jdk11 上编译 source 但是在 jdk17 上进行测试
mvn clean package -gt toolchains.xml -Pjdk-17-test -Pjdk-11-compile