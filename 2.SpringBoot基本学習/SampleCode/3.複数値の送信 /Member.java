package com.example.demo;

/**
 *  Name, Address, Telnoをマッピングするためのクラス
 *  リスト値を作成する際に、型として使用する
 */
public class Member {

	// メンバー
	private String name;
	private String address;
	private String telno;

	// Name ゲッター/セッター
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	// Address ゲッター/セッター
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }

	// Telno ゲッター/セッター
	public String getTelno() { return telno; }
	public void setTelno(String telno) { this.telno = telno; }

	/*
	 * デフォルトコンストラクタ
	 */
	public Member() {}

	/*
	 *  コンストラクタ
	 *  @param name 利用者の名前
	 *  @param address 利用者の住所
	 *  @param telno 利用者の電話番号
	 */
	public Member(String name, String address, String telno) {
		this.name = name;
		this.address = address;
		this.telno = telno;
	}
}

