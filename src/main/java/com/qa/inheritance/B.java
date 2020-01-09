package com.qa.inheritance;

public class B extends A{

	public int foobar() {
		System.out.println("B::foobar()");
		
		return 99;
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("B::f1()");
		
	}
}
