package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 画面表示とDB連携を行うコントローラークラス
 */
@Controller
public class DBController {

	@Autowired
	private CustomerRepository customerRepository;

	/**
	 * 初期画面表示のための関数
	 * @param model 顧客情報を格納するためのModel
	 * @return "index" index.htmlを返す
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {

		// DBに登録された顧客情報を、全て取得
		List<Customer> userlist = customerRepository.findAll();
		model.addAttribute("customerlist", userlist);

		return "/index";
	}

	/**
	 * 変更対象の顧客情報を表示するための関数
	 * @param num 変更対象のID
	 * @param model 変更対象の顧客情報を格納するためのModel
	 * @return "change" change.htmlを返す
	 */
	@RequestMapping(value = "/{num}/change", method = RequestMethod.GET)
	public String changeValue(@PathVariable Long num, Model model) {

		// IDを取得
		Customer customer = customerRepository.findById(num).get();
		model.addAttribute("customerUpdate", customer);

		return "change";
	}

	/**
	 * 変更後の顧客情報を、DBへ登録する関数
	 * @param customerUpdate 変更後の顧客情報
	 * @return "redirect:/" ルートのlist.htmlに戻る
	 */
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String update(@ModelAttribute Customer customerUpdate) {

		// 変更後の顧客情報をDBへ登録
		customerRepository.save(customerUpdate);

		return "redirect:/";
	}

}
