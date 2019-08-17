/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi.request;

import net.jpcode.wxapi.WxGetRequest;
import net.jpcode.wxapi.response.MaterialGetcountResponse;

/**
 * 获取素材总数
 * @author billy
 *
 */
public class MaterialGetcountRequest extends WxGetRequest<MaterialGetcountResponse> {

	@Override
	public String getAction() {
		return "material/get_materialcount";
	}
	
	@Override
	public MaterialGetcountResponse createResponse() {
		return new MaterialGetcountResponse();
	}

}
