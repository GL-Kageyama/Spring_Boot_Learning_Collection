package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DB情報をREST形式で返すための、コントローラークラス
 */
@RestController
@RequestMapping("/")
public class RESTController {

	@Autowired
	CustomerRepository cusRepository;

    /**
     * HTTP GETメソッドから、REST形式の値を返す関数
     * @return customers DB情報をJSON形式で返す
     */
	@GetMapping
    List<Customer> getInformation() {

        List<Customer> customers = cusRepository.findAll();

        return customers;
    }

}
