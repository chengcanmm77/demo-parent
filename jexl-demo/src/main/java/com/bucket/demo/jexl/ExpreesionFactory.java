package com.bucket.demo.jexl;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;

public class ExpreesionFactory {
	
	private static  JexlEngine jexl = new JexlBuilder().create();

	public static JexlExpression createExpression(String expression){
		return jexl.createExpression(expression);
	}
}
