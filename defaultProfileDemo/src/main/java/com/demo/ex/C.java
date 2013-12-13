package com.demo.ex;

import org.springframework.stereotype.Component;

@Component
public class C {

	public C() {
		System.out.println("I am bean " + this.getClass().getName() );
	}
}
