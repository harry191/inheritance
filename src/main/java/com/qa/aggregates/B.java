package com.qa.aggregates;

public class B {

	private A parent = new A();

	public int foobar() {
		parent.foobar();
		System.out.println("B::foobar()");

		return 99;
	}

	public void f1() {
		// TODO Auto-generated method stub
		System.out.println("B::f1()");

	}
}
