# test-maven-docker01
# spring-cloud-demo
# Author : zhangbaolong
# Email : 292022420@qq.com
# Project : test-maven-docker01

项目介绍：
这个项目是一个springboot工程，主要是用于测试打包，构建成镜像，并且把镜像上传到远端docker服务器。

构建打包：

mvn clean

mvn install

mvn docker:build -DpushImage
