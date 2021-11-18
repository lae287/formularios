package com.example.usuarios.entidades;

public class DTOResponse {
	
	private DTOResponseObject responseObject;
	private String responseMsg;
	private String responseMessage;
	public DTOResponseObject getResponseObject() {
		return responseObject;
	}
	public void setResponseObject(DTOResponseObject responseObject) {
		this.responseObject = responseObject;
	}
	public String getResponseMsg() {
		return responseMsg;
	}
	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

}
