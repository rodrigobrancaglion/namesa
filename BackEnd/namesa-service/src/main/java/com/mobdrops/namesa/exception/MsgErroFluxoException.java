package com.mobdrops.namesa.exception;

public class MsgErroFluxoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public MsgErroFluxoException() {
		super();
	}

	public MsgErroFluxoException(String message, Throwable cause) {
		super(message, cause);
	}

	public MsgErroFluxoException(String message) {
		super(message);
	}

	public MsgErroFluxoException(Throwable cause) {
		super(cause);
	}

}
