package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 画面表示とDB連携を行うコントローラークラス
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
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {

		// DBに登録された顧客情報を、全て取得
		List<Customer> customerList = customerRepository.findAll();
		model.addAttribute("customerList", customerList);

		return "index";
	}

	/**
	 * 顧客情報 追加画面表示のための関数
	 * @param model 入力欄のためのModel
	 * @return "addition" addition.htmlを返す
	 */
	@RequestMapping(value = "/addition", method = RequestMethod.GET)
	public String customerAddition(Model model) {

		// 入力された文字を格納するためのオブジェクトを生成
		model.addAttribute("customer", new Customer());

		return "addition";
	}

	/**
	 * 顧客情報をDBに登録するための関数
	 * @param cusAdd 顧客情報が格納されたオブジェクト
	 * @return "redirect:/" ルートのindex.htmlへ戻る
	 */
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insert(@ModelAttribute Customer cusInfo) {

		// 顧客情報をDBへ登録
		customerRepository.save(cusInfo);

		return "redirect:/";
	}
}
