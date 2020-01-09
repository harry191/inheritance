package com.qa.inheritance;

public abstract class A {

	private int x = 7;
	
	
	public A() {
		
	}
	
	
	public int foobar() {
		int x=9;
		System.out.println("A::foobar()");
		return 3;
	}
	
	
	public abstract void f1();
	
	
}
