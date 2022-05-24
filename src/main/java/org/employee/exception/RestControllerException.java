package org.employee.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//@RestControllerAdvice
public class RestControllerException {

	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<ExceptionHandling> Exception(DataIntegrityViolationException e){
		ExceptionHandling ex = new ExceptionHandling(e.getMessage(),"Cannot delete");
		return new ResponseEntity<ExceptionHandling>(ex,  HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<ExceptionHandling> Exceptions(EmptyResultDataAccessException e){
		ExceptionHandling ex = new ExceptionHandling(e.getMessage(),"Data Not Found!,Please try with existing inputs.");
		return new ResponseEntity<ExceptionHandling>(ex,  HttpStatus.BAD_REQUEST);
		
	}
	
	
	
}
