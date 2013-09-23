/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */

package org.mule.module.facebook.automation.testcases;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.HashMap;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.api.MuleEvent;
import org.mule.api.processor.MessageProcessor;

public class GetApplicationAlbumsTestCases extends FacebookTestParent {
	
    @SuppressWarnings("unchecked")
	@Category({RegressionTests.class})
	@Test
	public void testGetApplicationAlbums() {
    	
    	testObjects = (HashMap<String,Object>) context.getBean("getApplicationAlbumsTestData");
    	
		MessageProcessor flow = lookupFlowConstruct("get-application-albums");
    	
		try {
			publishAlbum((String) testObjects.get("albumName"), (String) testObjects.get("msg"), (String) testObjects.get("profileId"));
			
			String until = String.valueOf(new Date().getTime());
			testObjects.put("until", until);

			MuleEvent response = flow.process(getTestEvent(testObjects));
			Object albums = (Object) response.getMessage().getPayload();
			
			// albums is an empty collection
			
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
     
	}
    
}