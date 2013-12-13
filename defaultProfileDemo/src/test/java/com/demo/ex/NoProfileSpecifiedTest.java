package com.demo.ex;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Configuration.class)
public class NoProfileSpecifiedTest {

	@Autowired(required=false) A a;
	@Autowired(required=false) B b;
	@Autowired(required=false) C c;
	
	
	@Test
	public void test() {
		//	Without an active profile, only beans b and c should load:
		
		assertNotNull(b);
		assertNotNull(c);
		assertNull(a);
	}

}
