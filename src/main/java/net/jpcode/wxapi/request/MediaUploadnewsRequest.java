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
 * 上传图文消息素材【订阅号与服务号认证后均可用】
 * @author billy
 *
 */
public class MediaUploadnewsRequest extends WxPostRequest<WxApiResponse> {

	private List<NewsItem> newsList;
	
	public List<NewsItem> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<NewsItem> newsList) {
		this.newsList = newsList;
	}

	@Override
	public String getAction() { return "media/uploadnews"; }

	@Override
	protected Object getPostData() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("articles", newsList);
		return map;
	}
	
	
}
