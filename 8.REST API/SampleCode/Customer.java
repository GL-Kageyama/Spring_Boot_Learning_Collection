package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

/**
 * DBからの取得した情報を保持するためのクラス
 */
@Entity
@Table(name="customer_table")
@Getter
public class Customer {

	/**
	 * PRIMARY KEYの数字
	 * ※表示には使用していない
	 */
	@Id
	@Column(name="cus_Num")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long num;

	/**
	 * 顧客の名前
	 */
	@Column(name="Cus_Name")
	private String name;

	/**
	 * 顧客の住所
	 */
	@Column(name="cus_Address")
	private String address;

	/**
	 * 顧客の電話番号
	 */
	@Column(name="cus_Telno")
	private String telno;
}
