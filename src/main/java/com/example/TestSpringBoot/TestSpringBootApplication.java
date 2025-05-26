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
/*
Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

新機能と改善のために最新の PowerShell をインストールしてください!https://aka.ms/PSWindows

PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git init
Initialized empty Git repository in C:/Users/Owner/Downloads/TestSpringBoot/TestSpringBoot/.git/
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git add .
warning: in the working copy of '.gitattributes', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'build.gradle', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'gradle/wrapper/gradle-wrapper.properties', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'settings.gradle', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/java/com/example/TestSpringBoot/ServletInitializer.java', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/java/com/example/TestSpringBoot/TestSpringBootApplication.java', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/resources/application.properties', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/test/java/com/example/TestSpringBoot/TestSpringBootApplicationTests.java', LF will be replaced by CRLF the next time Git touches it
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git commit -m "first commit with .gitignore makefile"
[master (root-commit) b2efbc3] first commit with .gitignore makefile
 13 files changed, 498 insertions(+)
 create mode 100644 .gitattributes
 create mode 100644 .gitignore
 create mode 100644 build.gradle
 create mode 100644 gradle/wrapper/gradle-wrapper.jar
 create mode 100644 gradle/wrapper/gradle-wrapper.properties
 create mode 100644 gradlew
 create mode 100644 gradlew.bat
 create mode 100644 settings.gradle
 create mode 100644 src/main/java/com/example/TestSpringBoot/.gitignore
 create mode 100644 src/main/java/com/example/TestSpringBoot/ServletInitializer.java
 create mode 100644 src/main/java/com/example/TestSpringBoot/TestSpringBootApplication.java
 create mode 100644 src/main/resources/application.properties
 create mode 100644 src/test/java/com/example/TestSpringBoot/TestSpringBootApplicationTests.java
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git branch -m master main
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git push -u origin main
fatal: 'origin' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
 */
