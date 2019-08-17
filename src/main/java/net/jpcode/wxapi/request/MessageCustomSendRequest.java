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
 * 客服接口-发消息
 * @author billy
 *
 */
public class MessageCustomSendRequest extends WxPostRequest<WxApiResponse> {

	private String toUserName;
	private String msgType;
	private Map<String, Object> data;
	
	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	@Override
	public String getAction() {
		return "message/custom/send";
	}

	@Override
	protected Object getPostData() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("touser", toUserName);
		map.put("msgtype", msgType);
		map.put(msgType, data);
		return map;
	}

}
