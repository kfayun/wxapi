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
 * 删除群发【订阅号与服务号认证后均可用】
 * @author billy
 *
 */
public class MessageMassDeleteRequest extends WxGetRequest<WxApiResponse> {

	private String msgId;
	
	@Override
	public String getAction() { return "message/mass/delete?msg_id=" + msgId; }
}
