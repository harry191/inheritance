package com.qa.aggregates;

public class B {

	private IA parent;

	public B(IA theParent) {
		parent = theParent;
	}

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
