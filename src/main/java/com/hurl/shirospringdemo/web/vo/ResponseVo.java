package com.hurl.shirospringdemo.web.vo;

public class ResponseVo {
	private boolean success;
	private String errorMessage;
	private Object data;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public static ResponseVo success(Object data){
		ResponseVo vo = new ResponseVo();
		vo.setSuccess(true);
		vo.setData(data);
		return vo;
	}
	public static ResponseVo failure(String errorMessage){
		ResponseVo vo = new ResponseVo();
		vo.setSuccess(false);
		vo.setErrorMessage(errorMessage);
		return vo;
	}
}
