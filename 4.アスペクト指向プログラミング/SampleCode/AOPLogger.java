package com.example.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Logging class using AOP
 */
@Aspect
@Component
public class AOPLogger {

	/**
	 * Logging Before Method Execution
	 */
	@Before("within(com.example.demo.MainController)")
    public void BeforeTest() {

        System.out.println("\r\nBefore the method execution.");
    }

	/**
	 * Logging After Method Execution
	 */
	@After("within(com.example.demo.MainController)")
    public void AfterTest() {

        System.out.println("After the method execution. \r\n");
    }

	/**
	 * Logging by interrupt processing
	 */
	@Around("execution(* com.example.demo.MainController.hello2(..))")
    public void AroundTest() {

        System.out.println("\r\nThe interrupt process was performed. \r\n");
    }

	/**
	 * Logging when the method is successfully executed
	 */
	@AfterReturning("within(com.example.demo.MainController)")
    public void AfterReturningTest() {

        System.out.println("The method was executed without problems.");
    }

	/**
	 * Logging when a method is error
	 */
	@AfterThrowing("within(com.example.demo.MainController)")
    public void AfterThrowingTest() {

        System.out.println("ERROR : Method encountered a problem at runtime.");
    }
}
