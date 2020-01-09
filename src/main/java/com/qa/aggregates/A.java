package com.qa.aggregates;

public class A implements IA{

	private int x = 7;

	public A() {

	}

	public int foobar() {
		int x = 9;
		System.out.println("A::foobar()");
		return 3;
	}

	public void f1() {
		System.out.println("Shouldn't be here");
	}
	
	private void f2() {
		System.out.println("Shouldn't be here");
	}

}
