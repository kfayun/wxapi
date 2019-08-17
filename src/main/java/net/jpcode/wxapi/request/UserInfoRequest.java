/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi.request;

import net.jpcode.wxapi.WxGetRequest;
import net.jpcode.wxapi.response.UserInfoResponse;

/**
 * 获取用户基本信息（包括UnionID机制
 * @author billy
 *
 */
public class UserInfoRequest extends WxGetRequest<UserInfoResponse> {

	private String openid;
	private String lang = "zh_CN";
	
	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getAction() {
		return String.format("user/info?openid=%s&lang=%s", openid, lang);
	}
	
	@Override
	public UserInfoResponse createResponse() {
		return new UserInfoResponse();
	}

	
}
