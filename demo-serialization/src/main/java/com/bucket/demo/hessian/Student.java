package com.bucket.demo.hessian;

import java.io.Serializable;
import java.util.List;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4316102400587597235L;

	private String name;
	
	private double count;
	
	private List<String> degree;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	public List<String> getDegree() {
		return degree;
	}

	public void setDegree(List<String> degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", count=" + count + ", degree=" + degree + "]";
	}
	
	
}
