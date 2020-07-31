package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * テキストボックスの、表示&送信を行うクラス
 */
@Controller
public class RequestController4 {

	/*
	 * ルートパスを表示させるための関数
	 * @param model コントローラーからビューへ、値を渡す際に使用するオブジェクト
	 * @return "index" index.htmlを返す
	 */
	@RequestMapping(value="/")
	public String index(Model model) {

		// 初期表示時に、ParamObjectを作成しておく
		ParamObject paramObject = new ParamObject();
		// 10行分のMemberオブジェクトを追加
		for (int i = 0; i < 10; i++) {
			paramObject.members.add(new Member());
		}
		// ビュー側へ、オブジェクトを渡す
		model.addAttribute("paramObject", paramObject);

		return "index";
	}

	/*
	 * Sendボタンで送信された値を処理する関数
	 * @param members テキストボックス内の文字列を、リスト値(オブジェクト)として受け取る
	 * @return mav 文字列をModelAndViewに格納して返す
	 */
	@RequestMapping(value="/post")
	public ModelAndView response(@ModelAttribute ParamObject members) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		// リスト値を全て取得
		mav.addObject("result", members.getMembers());

		return mav;
	}

	/*
	 * respopnse関数に渡すオブジェクトのためのインナークラス
	 */
	public static class ParamObject {

		// リスト値を渡すために、メンバーにリストを持たせる。
		private List<Member> members = new ArrayList<>();

		// 入力値に対するゲッター/セッター
		public List<Member> getMembers() { return members; }
		public void setMembers(List<Member> members) { this.members = members; }

	}
}