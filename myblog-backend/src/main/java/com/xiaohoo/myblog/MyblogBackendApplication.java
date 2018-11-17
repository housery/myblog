package com.xiaohoo.myblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
// 扫描dao接口
@MapperScan(basePackages = "com.xiaohoo.myblog.dao")
public class MyblogBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyblogBackendApplication.class, args);
    }
}
