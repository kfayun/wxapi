/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi.request;

import net.jpcode.wxapi.WxApiResponse;
import net.jpcode.wxapi.WxUploadRequest;

/**
 * 上传图文消息内的图片获取URL【订阅号与服务号认证后均可用】
 * @author billy
 *
 */
public class MediaUploadimgRequest extends WxUploadRequest<WxApiResponse> {

	@Override
	public String getAction() { 
		return "media/uploadimg"; 
	}

}
