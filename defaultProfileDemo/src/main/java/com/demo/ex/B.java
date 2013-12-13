package com.demo.ex;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class B {

	public B() {
		System.out.println("I am bean " + this.getClass().getName() );
	}
}
