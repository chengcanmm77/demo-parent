package com.bucket.demo.hessian;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HessianSerializeTest {

	public static void main(String[] args) throws IOException {
		List<String> str = new ArrayList<String>();
		str.add("gg");
		str.add("gg");
		
		Student s1 = new Student();
		s1.setCount(33);
		s1.setDegree(str);
		s1.setName("test");
		
		Student s2 = new Student();
		s2.setCount(66);
		s2.setDegree(str);
		s2.setName("test 2");
		
		
		List<Student> stus = new ArrayList<Student>();
		stus.add(s2);
		stus.add(s1);
		
		Map<String,Student> map = new HashMap<String,Student>();
		map.put("1", s1);
		
		Person p = new Person();
		p.setAge(2);
		p.setName("bucket");
		p.setSex(false);
		p.setStudents(stus);
		p.setStuMap(map);
		
		
		byte[] data = HessianUtil.serialize(p);
		System.out.println(data.length);
		Person p2 = (Person)HessianUtil.deSerialize(data);
		
		System.out.println(p2);
	}
}
