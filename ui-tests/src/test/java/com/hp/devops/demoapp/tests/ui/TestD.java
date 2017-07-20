package com.hp.devops.demoapp.tests.ui;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shitritn on 4/9/2017.
 *
 */
public class TestD {

	@Test
	public void testUIcaseAlwaysPass() {
		//Unmark the Assert.fail line and comment the rest of the methods
		//Assert.fail("Catch me if u can...)))");
		System.out.println("Proudly  running test " + Thread.currentThread().getStackTrace()[1]);
		Assert.assertTrue(true);
		
	}
}
