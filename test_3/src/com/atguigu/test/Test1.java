package com.atguigu.test;

import org.junit.Test;

import com.atguigu.bean.Person;

public class Test1 {


	@Test
	public void test() {
		Person p = new Person("003", "daniel.");
		
		System.out.println(p);
	}

}
