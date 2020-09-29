#### Spring Cloud Alibaba / Dubbo
```
一、dubbo-cloud
1. provider 服务提供方：端口[20880]
2. customer 服务消费方：端口
3. dubbo-service 公共接口jar，可同时供服务提供、消费方使用
3. 测试地址：http://localhost:30000/demo/,看到【[provider]：Hello, teacherblitz】及代表启动成功
二、Nacos
1. Nacos控制台：/nacos/nacos-server.jar
   启动命令：java -jar nacos-server.jar &
2. nacos数据持久化采用mysql8：/nacos/nacos-config.sql
3. 端口：[8848]
4. 用户名/密码：nacos/nacos
注意：如需自己定制nacos控制台，可前往nacos.io自行下载源码进行打包
```