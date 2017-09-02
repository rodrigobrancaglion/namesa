package com.mobdrops.namesa.domain;

public class RestErrorInfo {

	public String detail;
	public String message;

	public RestErrorInfo(Exception ex, String detail) {
		this.message = ex.getLocalizedMessage();
		this.detail = detail;
	}

	public RestErrorInfo(Exception ex) {
		this.message = ex.getLocalizedMessage();
	}
}
