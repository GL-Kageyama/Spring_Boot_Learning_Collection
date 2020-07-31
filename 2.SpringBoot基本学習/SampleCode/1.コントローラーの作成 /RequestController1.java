package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 画面表示と文字の受け渡しを行うコントローラークラス
 */
@Controller
public class RequestController1 {

	/**
	 * 画面の初期表示を行う関数
	 * @return "index" index.htmlを返す
	 */
	@RequestMapping(value="/")
	public String index() {

		return "index";
	}

	/**
	 * 文字列を出力用のフォーマットに変更する関数
	 * @param name 名前の文字列
	 * @param tweet ツイートの文字列
	 * @return mav 文字列が格納されたModelAndView
	 */
	@RequestMapping(value="/callResponse")
	public ModelAndView response(@RequestParam("name") String name,
								@RequestParam("tweet") String tweet) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		// 文字列を、ModelAndViewに格納していく
		mav.addObject("helloResponse", "Hello. I am " + name + ".");
		mav.addObject("tweetResponse", tweet);

		return mav;
	}

}
