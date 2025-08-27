package com.site;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.site.dao") // 여기에 Mapper 인터페이스 위치 설정
public class S082502BatisImgApplication {

	public static void main(String[] args) {
		SpringApplication.run(S082502BatisImgApplication.class, args);
	}

}
