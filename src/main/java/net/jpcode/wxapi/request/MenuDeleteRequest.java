/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi.request;

import net.jpcode.wxapi.WxApiResponse;
import net.jpcode.wxapi.WxGetRequest;

/**
 * 自定义菜单删除
 * @author billy
 *
 */
public class MenuDeleteRequest extends WxGetRequest<WxApiResponse> {

	public String getAction() { return "menu/delete"; }
	
}
