/*******************************************************
 * Copyright 2018 jpcode
 * contact http://www.jpcode.net/
 * 
 * --- wxapi
 * 
 ********************************************************/

package net.jpcode.wxapi;

/**
 * WxApiException
 * @author billy
 *
 */
public class WxApiException extends Exception {
	
	public WxApiException(String message) {
        super(message);
    }

    public WxApiException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public WxApiException(Throwable cause) {
        super(cause);
    }
}
