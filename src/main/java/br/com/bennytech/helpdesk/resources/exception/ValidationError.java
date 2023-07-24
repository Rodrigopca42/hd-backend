package br.com.bennytech.helpdesk.resources.exception;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{
	private static final long serialVersionUID = 1L;

	private List<FieldMessage> errors = new ArrayList<>();

	public ValidationError() {
		super();
	}

	public ValidationError(Long timetamp, Integer status, String error, String message, String path) {
		super(timetamp, status, error, message, path);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}

	public void addError(String fielName, String message) {
		this.errors.add(new FieldMessage(fielName, message));
	}
	
	
	
}
