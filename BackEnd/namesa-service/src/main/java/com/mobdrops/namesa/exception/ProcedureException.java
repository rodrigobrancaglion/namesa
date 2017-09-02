package com.mobdrops.namesa.exception;
public class ProcedureException extends Exception{

	private static final long serialVersionUID = 1L;
	
	
	public ProcedureException(){
		super();
	}
	
	public ProcedureException(String message, Throwable cause){
		super(message, cause);
	}
	
	public ProcedureException(String message){
		super(message);
	}

	
	public ProcedureException(Throwable cause){
		super(cause);
	}
	
}