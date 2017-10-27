package com.bucket.jdk8.demo.lambda;

import java.util.Arrays;

public class SimpleLambdaTest {

	public static void main(String[] args) {
		MyNum myNum = null;
		Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
	}
}
