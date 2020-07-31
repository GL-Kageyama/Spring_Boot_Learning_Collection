package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DIコンテナを用いたコントローラークラス
 */
@RestController
// DIコンテナからコンポーネントをスキャン
@ComponentScan
public class DIController {

	// DIコンテナを用いてインスタンス化
	@Autowired
	DIHello diHello;

	/**
	 * DIコンテナのオブジェクトを用いた関数
	 * @return "Hello×3 DI World"文字列
	 */
	@RequestMapping("/hello2")
    public String Hello2() {

		return diHello.HelloWorld(3);
    }

}
