package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class DemoApplicationTests {

	@Test
	public void testA() {
        fail();
	}

	@Test
	public void testB() {
        assertTrue(true);
	}

	@Test
	public void testC() {
        assertTrue(true);
	}

}
