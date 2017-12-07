package com.bukcet.sb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) throws Exception {
		//SpringApplication.run(Example.class, args);
		System.out.println(System.currentTimeMillis());
		Integer t = new Integer(555);
		test(t);
		
		System.out.println(t);
		
	}
	
	public static void test(Integer dd){
		dd = Integer.valueOf(666);
	}

}
