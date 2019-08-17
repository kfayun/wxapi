/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi.request;

import java.util.HashMap;
import java.util.Map;

import net.jpcode.wxapi.WxApiResponse;
import net.jpcode.wxapi.WxPostRequest;
import net.jpcode.wxapi.model.MenuItem;

/**
 * 自定义菜单创建
 * @author billy
 *
 */
public class MenuCreateRequest extends WxPostRequest<WxApiResponse> {

	private MenuItem[] menuItems;
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public String getAction() { return "menu/create"; }
	
	@Override
	public Map<String, Object> getPostData() {
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("button", menuItems);
		
		return map;
	}
	
}
