package com.example.springboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.NoResourceFoundException;


@Slf4j
@Controller
@ControllerAdvice

//The @ControllerAdvice annotation is used to define the global exception handler
public class ErrorController {
    // this is optional ... im just showing you some things .. this is a catch all bucket for 404 errors
    // I am using this in seriesreminder because I need to do additional processing for a 404 page
    @ExceptionHandler(NoResourceFoundException.class)
    @RequestMapping(value = {"/error/404", "/404"})
    public ModelAndView error404(HttpServletRequest request) {
        // This is used in the security config for 404 pages
        ModelAndView response = new ModelAndView("error/404");

        log.debug("!!!!!!!!!!!!!!!!!! IN ERROR CONTROLLER : 404 NOT FOUND : " + request.getMethod() + " " + request.getRequestURI());

        // this line of code is specifically setting a 404 status code
        response.setStatus(HttpStatus.NOT_FOUND);

        return response;
    }



}
