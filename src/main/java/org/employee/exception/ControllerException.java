package org.employee.exception;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerException {

	@ExceptionHandler(Exception.class)
	public String handleExceptions(Exception e, Model model) {
		e.printStackTrace();
		model.addAttribute("error", "Not Found!");
		return "error";
	}

	@ExceptionHandler(EmptyResultDataAccessException.class)
	public String handlerExceptions(Exception e, Model model) {
		e.printStackTrace();
		model.addAttribute("error", "Data Not Found!,Please try with existing inputs.");
		return "error";
	}

	@ExceptionHandler(org.springframework.dao.DataIntegrityViolationException.class)
	public String handleeExceptions(Exception e, Model model) {
		e.printStackTrace();
		model.addAttribute("error", "Try to delete the data from parent class and then from child.");
		return "error";
	}

	@ExceptionHandler(org.springframework.validation.BindException.class)
	public String handlExceptions(Exception e, Model model) {
		e.printStackTrace();
		model.addAttribute("error", "Try to Fill out the data.");
		return "error";
	}

}
