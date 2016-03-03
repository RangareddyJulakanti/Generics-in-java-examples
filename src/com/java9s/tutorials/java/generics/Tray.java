package com.java9s.tutorials.java.generics;

public class Tray {
	public Glass<?> a;
	public void add(Glass<? extends Juice> glass){ 
		Glass<?> x;
	}
	
	public void remove(Glass<? super CokeZero> cokeGlass){ }
}
