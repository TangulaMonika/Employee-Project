package org.employee.exception;

public class ExceptionHandling {

	private String error;
	private String errorMessage;

	public ExceptionHandling() {

	}

	public ExceptionHandling(String error, String errorMessage) {
		super();
		this.error = error;
		this.errorMessage = errorMessage;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ExceptionHandling [error=" + error + ", errorMessage=" + errorMessage + "]";
	}

}
