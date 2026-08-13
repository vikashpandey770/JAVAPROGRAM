package com.p;

public class Obje extends Protection {

	void disply() {
		Protection p=new Protection();
		System.out.println("this a:"+p.a);
		//System.out.println("this ab:"+ab);
		System.out.println("this as:"+p.as);
		System.out.println("this ac:"+p.ac);
	}
	
public static void main(String[] args) {
	Obje o=new Obje();
	o.disply();
	Derived d=new  Derived();
	d.run();
	
}
}

