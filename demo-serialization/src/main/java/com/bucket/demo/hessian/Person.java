package com.bucket.demo.hessian;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Person implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -7157692251283261511L;

	private String name;
    
    private int age;
    
    private List<Student> students;
    
    private Map<String,Student> stuMap;
    
    private boolean sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Map<String, Student> getStuMap() {
		return stuMap;
	}

	public void setStuMap(Map<String, Student> stuMap) {
		this.stuMap = stuMap;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", students=" + students + ", stuMap=" + stuMap + ", sex="
				+ sex + "]";
	}
    
    
}
