/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.facebook.automation.testcases;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class AttendEventTestCases extends FacebookTestParent {
	
	@SuppressWarnings("unchecked")
	@Before
	public void setUp() {
		try {
	    	testObjects = (HashMap<String,Object>) context.getBean("attendEventTestData");
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
	@Category({RegressionTests.class})
	@Test
	public void testAttendEvent() {
    	
		try {
			Boolean result = attendEvent((String) testObjects.get("eventId"));
			
			assertTrue(result);
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
     
	}
}