package com.elsoproject.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionGeneral {

	@ExceptionHandler
	public String exception(Exception ex, Model model){

		model.addAttribute("timestamp",ex.getCause());
		model.addAttribute("error",ex.getClass());
		model.addAttribute("message",ex.getMessage());
		model.addAttribute("path",ex.getLocalizedMessage());
		model.addAttribute("status",ex.getStackTrace());

		System.out.println(" getMessage: "+ex.getMessage()
				+" \n getLocalizedMessage: "+ex.getLocalizedMessage()
				+" \n getCause: "+ex.getCause()
				+" \n getStackTrace: "+ex.getStackTrace().toString()
				+" \n getSuppressed: "+ex.getSuppressed().toString()
				+" \n getClass: "+ex.getClass()
		);

		return "detailedError";
	}
	
}
