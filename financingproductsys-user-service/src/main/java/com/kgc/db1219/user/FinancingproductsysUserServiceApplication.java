package com.kgc.db1219.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDubbo
@MapperScan("com.kgc.db1219.user.mapper")
@SpringBootApplication
public class FinancingproductsysUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancingproductsysUserServiceApplication.class, args);
	}

}
