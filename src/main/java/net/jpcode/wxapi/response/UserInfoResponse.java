/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi.response;

import java.io.IOException;

import net.jpcode.wxapi.WxApiResponse;

public class UserInfoResponse extends WxApiResponse {

	private String nickname;
	private String headimgUrl;
	
	public String getNickname() { return nickname; }
	
	public String getHeadimgUrl() { return headimgUrl; }
	
	@Override
	public void parse() throws IOException {
		super.parse();
		
		nickname = getValue("nickname");
        headimgUrl = getValue("headimgurl");
	}
}
