package com.example.demo;

public class Customer {
    @Override
	public String toString() {
		return "Customer [cusNum=" + cusNum + ", cusName=" + cusName + ", cusAddress=" + cusAddress + ", cusTelno="
				+ cusTelno + "]";
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_table.cus_Num
     *
     * @mbg.generated Fri Jul 03 11:09:12 JST 2020
     */
    private Integer cusNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_table.cus_Name
     *
     * @mbg.generated Fri Jul 03 11:09:12 JST 2020
     */
    private String cusName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_table.cus_Address
     *
     * @mbg.generated Fri Jul 03 11:09:12 JST 2020
     */
    private String cusAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer_table.cus_Telno
     *
     * @mbg.generated Fri Jul 03 11:09:12 JST 2020
     */
    private String cusTelno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_table.cus_Num
     *
     * @return the value of customer_table.cus_Num
     *
     * @mbg.generated Fri Jul 03 11:09:12 JST 2020
     */
    public Integer getCusNum() {
        return cusNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_table.cus_Num
     *
     * @param cusNum the value for customer_table.cus_Num
     *
     * @mbg.generated Fri Jul 03 11:09:12 JST 2020
     */
    public void setCusNum(Integer cusNum) {
        this.cusNum = cusNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_table.cus_Name
     *
     * @return the value of customer_table.cus_Name
     *
     * @mbg.generated Fri Jul 03 11:09:12 JST 2020
     */
    public String getCusName() {
        return cusName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_table.cus_Name
     *
     * @param cusName the value for customer_table.cus_Name
     *
     * @mbg.generated Fri Jul 03 11:09:12 JST 2020
     */
    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_table.cus_Address
     *
     * @return the value of customer_table.cus_Address
     *
     * @mbg.generated Fri Jul 03 11:09:12 JST 2020
     */
    public String getCusAddress() {
        return cusAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_table.cus_Address
     *
     * @param cusAddress the value for customer_table.cus_Address
     *
     * @mbg.generated Fri Jul 03 11:09:12 JST 2020
     */
    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress == null ? null : cusAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer_table.cus_Telno
     *
     * @return the value of customer_table.cus_Telno
     *
     * @mbg.generated Fri Jul 03 11:09:12 JST 2020
     */
    public String getCusTelno() {
        return cusTelno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer_table.cus_Telno
     *
     * @param cusTelno the value for customer_table.cus_Telno
     *
     * @mbg.generated Fri Jul 03 11:09:12 JST 2020
     */
    public void setCusTelno(String cusTelno) {
        this.cusTelno = cusTelno == null ? null : cusTelno.trim();
    }
}