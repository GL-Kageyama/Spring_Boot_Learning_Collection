package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ノーマルなコントローラークラス
 */
@RestController
public class NormalController {

	// newでインスタンス化
	NormalHello nHello = new NormalHello();

	/**
	 * NormalHelloクラスに依存した関数
	 * @return "Hello×3 Normal World"文字列
	 */
	@RequestMapping("/hello1")
    public String Hello1() {

		return nHello.HelloWorld(3);
    }
}
