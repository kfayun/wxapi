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
 * 修改永久图文素材
 * @author billyzh
 *
 */
public class MaterialUpdatenewsRequest extends WxPostRequest<WxApiResponse> {

	private String mediaId;
	private int index;
	private List<NewsItem> newsList;
	
	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public List<NewsItem> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<NewsItem> newsList) {
		this.newsList = newsList;
	}

	@Override
	public String getAction() {
		return "material/update_news";
	}

	@Override
	protected Object getPostData() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("media_id", mediaId);
		map.put("index", index);
		map.put("articles", newsList);
		return map;
	}
}
