package com.java9s.tutorials.java.generics;

public class Guest {
	public static void main(String[] args) {
		Tray t = new Tray();
		t.add(new Glass<OrangeJuice>());
		t.remove(new Glass<CokeZero>());
	}
}
