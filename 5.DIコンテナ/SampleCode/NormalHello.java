package com.example.demo;

/**
 * ノーマルな文字列出力のためのクラス
 */
public class NormalHello {

	/**
	 * "Hello×? Normal World"を作成する関数
	 * @param cnt Helloを繰り返す回数
	 * @return "Hello×? Normal World"文字列
	 */
	public String HelloWorld(int cnt) {

		String result = "";
		for (int i = 0; i < cnt; i++) {
			result += "Hello ";
		}
		return result + "Normal World !";
	}

}
