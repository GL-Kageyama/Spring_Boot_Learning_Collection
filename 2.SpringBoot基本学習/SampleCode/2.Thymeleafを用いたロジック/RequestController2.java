package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 画面表示とオブジェクト受け渡しを行うコントローラークラス
 */
@Controller
public class RequestController2 {

	/**
	 * 画面の初期表示を行う関数
	 * @return "index" index.htmlを返す
	 */
	@RequestMapping(value="/")
	public String index() {

		return "index";
	}

	/**
	 * 受け取ったオブジェクトを、ModelAndViewに受け渡す関数
	 * @param param 文字列が格納されたオブジェクト
	 * @return mav 文字列が格納されたModelAndView
	 */
	@RequestMapping(value="/callResponse")
	public ModelAndView response(@ModelAttribute ParamObject param) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		// 文字列をModelAndViewに格納
		mav.addObject("response", param);

		return mav;
	}

	/**
	 * 文字列を保持するオブジェクトのためのインナークラス
	 */
	public static class ParamObject {

		// メンバー
		private String name;
		private String tweet;

		// Nameのゲッター/セッター
		public String getName() { return name; }
		public void setName(String name) { this.name = name; }

		// Tweetのゲッター/セッター
		public String getTweet() { return tweet; }
		public void setTweet(String tweet) { this.tweet = tweet; }
	}
}

