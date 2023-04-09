package com.example.demo;
//package chính chứa toàn bộ mã nguồn
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// ip 2 class của spframew
@SpringBootApplication
// đánh dấu demoapplycation là một ứng dụng của spb
public class DemoApplication {
// khai bao lop chinh của ứng dụng
	public static void main(String[] args) { //pt chính chạy đàu tiên khi chạy ứng dụng
		SpringApplication.run(DemoApplication.class, args);
	//sd spapp để khởi động
	}
}
