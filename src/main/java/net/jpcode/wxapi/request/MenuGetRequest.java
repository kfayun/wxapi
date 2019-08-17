/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi.request;

import net.jpcode.wxapi.WxGetRequest;
import net.jpcode.wxapi.response.MenuGetResponse;

/**
 * 自定义菜单查询
 * @author billy
 *
 */
public class MenuGetRequest extends WxGetRequest<MenuGetResponse>{

	@Override
	public String getAction() { return "menu/get"; }

	@Override
	public MenuGetResponse createResponse() {
		return new MenuGetResponse();
	}

}
