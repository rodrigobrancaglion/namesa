package com.mobdrops.namesa.exception;

public class CodAcessException  extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CodAcessException() {
		super();
	}

	public CodAcessException(String message, Throwable cause) {
		super(message, cause);
	}

	public CodAcessException(String message) {
		super(message);
	}

	public CodAcessException(Throwable cause) {
		super(cause);
	}
}
