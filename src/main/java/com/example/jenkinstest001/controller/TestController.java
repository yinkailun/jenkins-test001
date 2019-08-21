package com.example.jenkinstest001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinkailun
 * @description:
 * @date 2019-08-20 6:41 PM
 */

@RestController
public class TestController {

	@GetMapping("test")
	public String hello(){
		return "hello jenkins";
	}
}
