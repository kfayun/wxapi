/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi.request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.jpcode.wxapi.WxApiResponse;
import net.jpcode.wxapi.WxPostRequest;
import net.jpcode.wxapi.model.NewsItem;

/**
 * 新增永久图文素材
 * @author billyzh
 *
 */
public class MaterialAddnewsRequest extends WxPostRequest<WxApiResponse> {

	private List<NewsItem> newsList;
	
	public void setNewsList(List<NewsItem> list) {
		newsList = list;
	}
	
	@Override
	public String getAction() {
		return "material/add_news";
	}

	@Override
	protected Object getPostData() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("articles", newsList);
		return map;
	}
}
