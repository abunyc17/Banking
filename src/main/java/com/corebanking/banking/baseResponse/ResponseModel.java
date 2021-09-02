package com.corebanking.banking.baseResponse;

/**
 * @author Abu
 */

public class ResponseModel {

	private String responseCode;
	private String responseMessage;

	public ResponseModel() {
		super();
	}

	public ResponseModel(String responseCode, String responseMessage) {
		super();
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

}
