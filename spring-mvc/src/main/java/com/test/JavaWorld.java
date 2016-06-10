package com.test;

import java.io.Serializable;

import com.spring.app.bean.User;

public class JavaWorld extends User implements TestInterface, Serializable {
	public static final String NAME = "AKAMBE";
	enum CofeeSize {BIG, SMALL, MEDIUM, TALL};
	public static void main(String a[]) {
		//System.out.println(TestInterface.NAME);
		//System.out.println(NAME);
		CofeeSize cs = CofeeSize.MEDIUM;
		System.out.println("Here is my Cofee Size : "+CofeeSize.values().toString());
		int number = 5;
		new JavaWorld().doStuff(number);
		System.out.println(number);
		
	}
	
	public void doStuff(int number) {
		System.out.println("Doing Stuff/..number : "+(number+1));
	}
	public void go() {
		System.out.println("Going to do Stuff");
	}
}
