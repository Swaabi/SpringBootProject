package com.pack.SpringbootA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
public String getMsg() {
	return "Hello World from controller!";
}
}
