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

import net.jpcode.wxapi.WxPostRequest;
import net.jpcode.wxapi.response.MaterialGetResponse;

/**
 * 获取永久素材
 * @author billy
 *
 * @param <T>
 */
public class MaterialGetRequest<T> extends WxPostRequest<MaterialGetResponse<T>> {

	private String mediaId;
	private String type;
	
	@Override
	public String getAction() {
		return "material/get_material";
	}

	@Override
	protected Object getPostData() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("media_id", mediaId);
		return null;
	}
	
	public MaterialGetResponse<T> createResponse() {
		MaterialGetResponse<T> resp = new MaterialGetResponse<T>();
		resp.setType( type );
		return resp;
	}
}
