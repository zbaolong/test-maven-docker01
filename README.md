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

Step 1/3 : FROM java:8

 ---> d23bdf5b1b1b
Step 2/3 : ADD /test-maven-docker01-0.0.1-SNAPSHOT.jar //

 ---> Using cache
 ---> 79c6237fbe71
Step 3/3 : ENTRYPOINT ["java", "-jar", "/test-maven-docker01-0.0.1-SNAPSHOT.jar"]

 ---> Using cache
 ---> d79120b6b70d
ProgressMessage{id=null, status=null, stream=null, error=null, progress=null, progressDetail=null}
Successfully built d79120b6b70d
Successfully tagged 175.27.189.153:5000/saysky/test-maven-docker01:0.0.1-SNAPSHOT

[INFO] Pushing 175.27.189.153:5000/saysky/test-maven-docker01:0.0.1-SNAPSHOT
The push refers to repository [175.27.189.153:5000/saysky/test-maven-docker01]
a382f432b74e: Pushed
35c20f26d188: Pushed
c3fe59dd9556: Pushed
6ed1a81ba5b6: Pushed
a3483ce177ce: Pushed
ce6c8756685b: Pushed
30339f20ced0: Pushed
0eb22bfb707d: Pushed
a2ae92ffcd29: Pushed
0.0.1-SNAPSHOT: digest: sha256:9a7c38acb5f8203e51dd64603373d008804be7626f44bf40eeb748378eacbd6e size: 2212
null: null
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  49.869 s
[INFO] Finished at: 2021-01-25T01:26:22+08:00
[INFO] ------------------------------------------------------------------------

