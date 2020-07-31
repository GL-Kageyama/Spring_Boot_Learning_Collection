package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 画面表示とDB情報取得を行うコントローラークラス
 */
@Controller
public class InfoController {

	@Autowired
	CustomerRepository customerRepository;

    /**
     * 初期画面を表示させる関数
     * @return "index" index.htmlを返す
     */
    @RequestMapping(value="/")
    public String index() {
        return "index";
    }

	/**
	 * DBから顧客情報を取得する関数
	 * @param key 取得対象のプライマリーキー
	 * @return mav プライマリーキーに対応した顧客情報を返す
	 */
    @RequestMapping(value="/get")
	public ModelAndView getInformation(@RequestParam("key") String key) {

		int keyNum = Integer.parseInt(key);
		ModelAndView mav = new ModelAndView();

		mav.setViewName("index");
		// プライマリーキーから顧客情報を取得
		Customer customer = customerRepository.selectByPrimaryKey(keyNum);
		mav.addObject("customerInfo", customer);

		return mav;
	}
}
