package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * DBと顧客情報を橋渡しするためのクラス
 */
@Entity
@Data
@Table(name="customer_table")
public class Customer {

	/**
	 * PRIMARY KEY
	 */
	@Id
	@Column(name="cus_Num")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long num;

	/**
	 * 名前
	 */
	@Column(name="cus_Name")
	private String name;

	/**
	 * 住所
	 */
	@Column(name="cus_Address")
	private String address;

	/**
	 * 電話番号
	 */
	@Column(name="cus_Telno")
	private String telno;

}

