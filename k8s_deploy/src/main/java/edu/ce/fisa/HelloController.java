package edu.ce.fisa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// GET 요청을 처리하는 메소드
	// http://localhost:8080/hello 로 접속
	@GetMapping("/hello")
	public String getHello() {
		return "GET 방식으로 요청되었습니다.";
	}

	// POST 요청을 처리하는 메소드
	// http://localhost:8080/hello 로 POST 요청
	@PostMapping("/hello")
	public String postHello(@RequestBody String message) {
		return "POST 방식으로 요청되었습니다. 받은 메시지: " + message;
	}
}