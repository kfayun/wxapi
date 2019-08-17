/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi.response;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import net.jpcode.wxapi.WxApiResponse;

public class TokenResponse extends WxApiResponse {

	 private String accessToken;
     private long tokenExpires;
     
	public String getAccessToken() {
		return accessToken;
	}

	public boolean tokenIsExpires() {
		
		return tokenExpires < (new Date().getTime());
	}
	
	public boolean tokenIsValid() {
		
		return accessToken != null && accessToken.length() > 0 && !tokenIsExpires();
	}
	
	@Override
	public void parse() throws IOException {
		super.parse();
		
		 accessToken = getValue("access_token");
		 if (accessToken != null) {
			 
			 int expiresIn = getValue("expires_in");
			 Calendar cal = Calendar.getInstance();
			 cal.add(Calendar.SECOND, expiresIn);
			 tokenExpires = cal.getTimeInMillis();
		 }
	}
}
