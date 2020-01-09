package com.qa.aggregates;

public class MainUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A root = new A();
		B parent = new B(root);
		
		
		parent.foobar();

	}

}
