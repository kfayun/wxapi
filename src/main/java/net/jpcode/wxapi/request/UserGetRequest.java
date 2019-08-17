/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi.request;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;

import net.jpcode.wxapi.StringUtils;
import net.jpcode.wxapi.WxApiRequest;
import net.jpcode.wxapi.response.UserGetResponse;

/**
 * 获取用户列表
 * @author billy
 *
 */
public class UserGetRequest extends WxApiRequest<UserGetResponse> {

	private String nextOpenId;
	public void setNextOpenId(String nextOpenId) {
		this.nextOpenId = nextOpenId;
	}
	
	public String getAction() {
		if (StringUtils.isEmpty(nextOpenId))
			return "user/get";
		
		return "user/get?next_openid=" + nextOpenId;
	}
	
	@Override
	public UserGetResponse createResponse() {
		return new UserGetResponse();
	}

	@Override
	public HttpUriRequest getRequest(String url) {
		return new HttpGet(url);
	}

}
