package com.bucket.demo.jexl.simple;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;
import org.apache.commons.jexl3.scripting.Main;

public class Simple {

	public static void main(String[] args) {
	    JexlEngine jexl = new JexlBuilder().create();
        /*
         *  Second make a jexlContext and put stuff in it
         */
        JexlContext jc = new MapContext();

        List<Object> l = new ArrayList<Object>();
        l.add("Hello from location 0");
        Integer two = new Integer(2);
        l.add(two);
        jc.set("array", l);

        JexlExpression e = jexl.createExpression("array[1]");
	}
}
