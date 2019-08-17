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
import java.util.List;
import java.util.Random;

import org.junit.Test;

import net.jpcode.wxapi.request.UserGetRequest;
import net.jpcode.wxapi.request.UserInfoRequest;
import net.jpcode.wxapi.response.UserGetResponse;
import net.jpcode.wxapi.response.UserInfoResponse;

public class UserTest extends BaseTest  {
	
	@Test
	public void testUserGet() throws IOException {
		
		UserGetRequest request = new UserGetRequest();
		UserGetResponse response = apiClient.execute(request);
		
		assertResponse(response);
		
		assertTrue( "未找到用户信息。", response.getTotal() > 0 );
		assertTrue( "未找到用户信息。", response.getCount() > 0 );
		
		assertNotNull( response.getUserList() );
	}
	
	@Test
	public void testUserInfo() throws IOException {
		
		UserGetRequest request = new UserGetRequest();
		UserGetResponse response = apiClient.execute(request);
		
		assertResponse(response);
		
		assertTrue( "未找到用户信息。", response.getTotal() > 0 );
		assertTrue( "未找到用户信息。", response.getCount() > 0 );
		
		assertNotNull( response.getUserList() );
		assertTrue( "未找到用户信息。", response.getUserList().size() > 0);
		
		List<String> list = response.getUserList();
		String openId = list.get(new Random().nextInt(list.size())); 
		
		// TODO:
		
		request = null;
		response = null;
		
		//
		UserInfoRequest request2 = new UserInfoRequest();
		request2.setOpenid(openId);
		UserInfoResponse response2 = apiClient.execute(request2);
		
		assertResponse(response2);
		
		assertNotNull("未找到用户信息。", response2.getNickname());
	}
}
