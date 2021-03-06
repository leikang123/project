package org.fkit.oa.util;


// 异常类
public class OaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OaException() {
		super();
		
	}

	public OaException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public OaException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public OaException(String message) {
		super(message);
		
	}

	public OaException(Throwable cause) {
		super(cause);
		
	}
	
}
