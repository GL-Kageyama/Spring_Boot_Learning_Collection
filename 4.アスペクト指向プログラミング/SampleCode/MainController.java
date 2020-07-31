package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for checking the log output by AOP
 * AOP : Aspect Oriented Programming
 */
@RestController
public class MainController {

	/**
	 * Function to output "Hello World 1" on the screen
	 * @return "Hello World 1" text line
	 */
	@RequestMapping("/hello1")
    public String hello1() {

		return "Hello World 1";
    }

	/**
	 * Function to output "Hello World 2" on the screen
	 * @return "Hello World 2" text line
	 */
	@RequestMapping("/hello2")
    public String hello2() {

        return "Hello World 2";
    }

	/**
	 * Function to output "Hello World 3" on the screen
	 * On the way, the zero division generates an error
	 * @return "Hello World 3" text line
	 */
	@RequestMapping("/hello3")
	public String hello3(){

    	// Zero division error
    	int zeroError = 1 / 0;

        return "Hello World 3";
    }
}
