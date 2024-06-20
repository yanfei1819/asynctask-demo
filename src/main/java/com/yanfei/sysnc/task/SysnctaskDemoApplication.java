package com.yanfei.sysnc.task;

import com.yanfei.common.asynctask.api.EnableAsyncTask;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@EnableAsyncTask
@MapperScan({"com.yanfei.common.asynctask.db.mapper"})
public class SysnctaskDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysnctaskDemoApplication.class, args);
    }

}
