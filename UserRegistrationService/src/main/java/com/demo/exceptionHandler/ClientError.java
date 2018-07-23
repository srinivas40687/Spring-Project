package com.demo.exceptionHandler;

public class ClientError {
	
	
	private String errorMsg;
	
	private String requestUrl;
	

	public ClientError(String errorMsg, String requestUrl) {
		super();
		this.errorMsg = errorMsg;
		this.requestUrl = requestUrl;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}
	
	

}
