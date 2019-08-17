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
 * 获取临时素材
 * @author billy
 *
 */
public class MediaGetRequest extends WxGetRequest<WxApiResponse> {

	private String mediaId;
	
	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	@Override
	public String getAction() { 
		return "media/get?media_id=" + mediaId; 
	}
}
