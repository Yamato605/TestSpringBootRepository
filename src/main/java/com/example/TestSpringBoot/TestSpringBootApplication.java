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
PowerShell
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
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git push -u origin main
fatal: 'origin' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git remote add origin https://github.com/Yamato605/TestSpringBootRepository.git
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git push -u origin main
Enumerating objects: 29, done.
Counting objects: 100% (29/29), done.
Delta compression using up to 16 threads
Compressing objects: 100% (19/19), done.
Writing objects: 100% (29/29), 46.06 KiB | 7.68 MiB/s, done.
Total 29 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/Yamato605/TestSpringBootRepository.git
 * [new branch]      main -> main
branch 'main' set up to track 'origin/main'.
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git rm -r -cached build/
error: did you mean `--cached` (with two dashes)?
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git rm -r --cached build/
fatal: pathspec 'build/' did not match any files
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git rm -r --cached .
rm '.gitattributes'
rm '.gitignore'
rm 'build.gradle'
rm 'gradle/wrapper/gradle-wrapper.jar'
rm 'gradle/wrapper/gradle-wrapper.properties'
rm 'gradlew'
rm 'gradlew.bat'
rm 'settings.gradle'
rm 'src/main/java/com/example/TestSpringBoot/.gitignore'
rm 'src/main/java/com/example/TestSpringBoot/ServletInitializer.java'
rm 'src/main/java/com/example/TestSpringBoot/TestSpringBootApplication.java'
rm 'src/main/resources/application.properties'
rm 'src/test/java/com/example/TestSpringBoot/TestSpringBootApplicationTests.java'
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
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git commit -m "Apply .gitignore rules"
[main 68fb548] Apply .gitignore rules
 1 file changed, 43 insertions(+)
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git push
Enumerating objects: 17, done.
Counting objects: 100% (17/17), done.
Delta compression using up to 16 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (9/9), 1.72 KiB | 1.72 MiB/s, done.
Total 9 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
To https://github.com/Yamato605/TestSpringBootRepository.git
   b2efbc3..68fb548  main -> main
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git rm -r --cached .
rm '.gitattributes'
rm '.gitignore'
rm 'build.gradle'
rm 'gradle/wrapper/gradle-wrapper.jar'
rm 'gradle/wrapper/gradle-wrapper.properties'
rm 'gradlew'
rm 'gradlew.bat'
rm 'settings.gradle'
rm 'src/main/java/com/example/TestSpringBoot/.gitignore'
rm 'src/main/java/com/example/TestSpringBoot/ServletInitializer.java'
rm 'src/main/java/com/example/TestSpringBoot/TestSpringBootApplication.java'
rm 'src/main/resources/application.properties'
rm 'src/test/java/com/example/TestSpringBoot/TestSpringBootApplicationTests.java'
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
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git commit -m "Clean up files based on upupdated .gitignore"
[main 3b79e78] Clean up files based on upupdated .gitignore
 1 file changed, 9 insertions(+), 1 deletion(-)
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot> git push
Enumerating objects: 17, done.
Counting objects: 100% (17/17), done.
Delta compression using up to 16 threads
Compressing objects: 100% (6/6), done.
Writing objects: 100% (9/9), 804 bytes | 804.00 KiB/s, done.
Total 9 (delta 2), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (2/2), completed with 2 local objects.
To https://github.com/Yamato605/TestSpringBootRepository.git
   68fb548..3b79e78  main -> main
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot>  git push -u origin main
branch 'main' set up to track 'origin/main'.
Everything up-to-date
PS C:\Users\Owner\Downloads\TestSpringBoot\TestSpringBoot>

 */
