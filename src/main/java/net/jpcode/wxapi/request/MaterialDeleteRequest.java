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

/**
 * 删除永久素材
 * @author billy
 *
 */
public class MaterialDeleteRequest extends WxPostRequest<WxApiResponse> {

	private String mediaId;
	
	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	@Override
	public String getAction() {
		return "material/del_material";
	}

	@Override
	protected Object getPostData() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("media_id", mediaId);
		return map;
	}
}
