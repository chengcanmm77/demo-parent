package com.bucket.demo.log.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;

public class LogBackTest {

	private static final Logger log = LoggerFactory.getLogger(LogBackTest.class);
	
	public static void main(String[] args) {
		 LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
		  lc.setPackagingDataEnabled(true);
		 log.debug("lll");
	}
}
