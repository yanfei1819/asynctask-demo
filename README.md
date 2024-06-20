# 项目说明
1、异步任务项目 asynctask-api 的示例工程；
2、需要引入 asynctask-api 的jar包：
```
        <dependency>
            <groupId>com.yanfei</groupId>
            <artifactId>asynctask-api</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
```
3、其中 `TicketIssueAsyncTask` 任务是案例，实际项目中需要替换具体任务；
4、`ticket.issue` 是示例任务名称；
5、启动项目前需要手动创建所需要的具体任务的表和日志表；
6、需要扫描到异步任务重的 Mapper 接口：
  `@MapperScan({"com.yanfei.common.asynctask.db.mapper"})`
7、配置数据库信息；
