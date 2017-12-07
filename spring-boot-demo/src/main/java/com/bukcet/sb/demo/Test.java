package com.bukcet.sb.demo;

public class Test {
	public static void main(String[] args) throws Exception {
		//SpringApplication.run(Example.class, args);
		System.out.println(System.currentTimeMillis());
		Integer t = new Integer(555);
		test(t);
		
		System.out.println(t);
		
	}
	
	public static void test(Integer dd){
		dd = new Integer(66);
	}
}
