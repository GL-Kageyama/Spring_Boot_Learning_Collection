package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 画面表示とDB取得を行うコントローラークラス
 */
@Controller
public class DBController {

	/**
	 * CustomerRepositoryクラスをインスタンス化
	 */
	@Autowired
	CustomerRepository customerRepository;

	/**
	 * 初期画面表示のための関数
	 * @return "index" index.htmlを返す
	 */
	@RequestMapping(value = "/")
	public String index() {

		return "index";
	}

	/**
	 * DBから情報を取得する関数
	 * @param model DB情報を格納するためのModel
	 * @return "information" information.htmlを返す
	 */
	@RequestMapping(value = "/get")
	public String Information(Model model) {

		// DB情報を全て取得
		List<Customer> cuslist = customerRepository.findAll();
		// DB情報をModelに格納
		model.addAttribute("customerList", cuslist);

		return "information";
	}
}
