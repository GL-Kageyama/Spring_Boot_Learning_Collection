package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * DIコンテナを用いた文字列出力のためのクラス
 */
// DIコンテナに登録させるアノテーション
@Component
public class DIHello {

	/**
	 * "Hello×? DI World"を作成する関数
	 * @param cnt Helloを繰り返す回数
	 * @return "Hello×? DI World"文字列
	 */
	public String HelloWorld(int cnt) {

		String result = "";
		for (int i = 0; i < cnt; i++) {
			result += "Hello ";
		}
		return result + "DI World !";
	}
}