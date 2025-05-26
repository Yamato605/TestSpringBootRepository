package com.example.TestSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // ← これを追加
public class TestSpringBootApplication {

	public static void main(String[] args) {
		// localhost:8080		リクエストをとばす　ポート番号を指定
		SpringApplication.run(TestSpringBootApplication.class, args);
	}

	// localhost:8080/hello
	@GetMapping("/hello") // メソッドを動かすという指示になっている
	public String hello() {
		return "こんにちは！";
	}

	// localhost:8080/name
	@GetMapping("/name") // メソッドを動かすという指示になっている
	public String name() {
		return "山本源流斎重國";
	}

}
