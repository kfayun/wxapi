/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi.request;

import net.jpcode.wxapi.WxGetRequest;
import net.jpcode.wxapi.response.TokenResponse;

public class TokenRequest extends WxGetRequest<TokenResponse> {

	private String appId;
	private String appSecret;
	
	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	@Override
	public String getAction() {
		return String.format("token?grant_type=client_credential&appid=%s&secret=%s", appId, appSecret);
	}
	
	@Override
	public TokenResponse createResponse() {
		return new TokenResponse();
	}

}
