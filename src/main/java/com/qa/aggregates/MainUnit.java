package com.qa.aggregates;

public class MainUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IA root = new AStub();
		B parent = new B(root);
		
		
		parent.foobar();

	}

}
