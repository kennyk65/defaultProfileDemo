package com.demo.ex;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("specified")
public class A {

	public A() {
		System.out.println("I am bean " + A.class.getName() );
	}
}
