/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi.model;

import java.util.ArrayList;
import java.util.List;

public class CustomMenu {

	private int menuId;
	private List<MenuItem> itemList;
	
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public List<MenuItem> getItemList() {
		return itemList;
	}
	public void setItemList(List<MenuItem> itemList) {
		this.itemList = itemList;
	}
    
	public void addItem(MenuItem item) {
		if (itemList == null) {
			itemList = new ArrayList<MenuItem>();
		}
		
		itemList.add(item);
	}
}
