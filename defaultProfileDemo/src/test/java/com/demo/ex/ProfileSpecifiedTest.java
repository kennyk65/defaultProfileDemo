package com.demo.ex;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Configuration.class)
@ActiveProfiles("specified")
public class ProfileSpecifiedTest {

	@Autowired(required=false) A a;
	@Autowired(required=false) B b;
	@Autowired(required=false) C c;
	
	
	@Test
	public void test() {
		//	WITH an active profile, the default profile bean should not load:
		
		assertNotNull(a);
		assertNull(b);
		assertNotNull(c);
	}

}
