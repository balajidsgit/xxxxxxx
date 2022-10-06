package org.tcs;

public class Sample extends one {
	public Sample() {
	this(25);
	System.out.println("Child Default COnstructor");
	}

	public Sample(int age) {
		this(62.5f);
		System.out.println("Int Parameterized Constructor" + age);
	}
	public Sample(float weight) {
		super(2880);
		System.out.println("Child float parameterized constructor"+ weight);
	
	}
	public static void main(String[] args) {
		Sample s= new Sample();
	}

}
