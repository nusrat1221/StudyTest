package com;

import org.openqa.selenium.WebDriver;

public class A {
	String color="yellow";
	WebDriver driver;
	A(String color){
	this.color=color;
	}
	A(WebDriver driver){
		this.driver=driver;
	}
	void init(String color) {
		this.color=color;
	}
void printColor() {
	System.out.println(color);
}
}
