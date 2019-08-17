/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import net.jpcode.wxapi.request.MenuGetRequest;
import net.jpcode.wxapi.response.MenuGetResponse;

public class MenuTest extends BaseTest {

	@Test
	public void testMenuGet() throws IOException {
		MenuGetRequest request = new MenuGetRequest();
		MenuGetResponse response = apiClient.execute(request);
		
		assertResponse(response);
		
		assertNotNull(response.getCustomMenu());
		assertNotNull(response.getCustomMenu().getItemList());
		
		assertTrue(response.getCustomMenu().getItemList().size() > 0);
	}

}
