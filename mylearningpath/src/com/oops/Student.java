package com.oops;

//Encapsulation...................
//DTO : DATA TRANSFER OBJECT
//POJO : PLAIN OLD JAVA OBJECT
//DATA MODEL
public class Student {

	// to avoid direct accessing data by outside of the class we need to use private keyword.
	//Private variables
	private int sId;
	private String sName;
	private long sMobNo;
	private String sAddress;
	
	//toString() method override
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sMobNo=" + sMobNo + ", sAddress=" + sAddress + "]";
	}
	
	//no-arg constructor
	public Student() {
		
	}
	
	//parameterized constructor
	public Student(int sId, String sName, long sMobNo, String sAddress) {
		this.sId = sId;
		this.sName = sName;
		this.sMobNo = sMobNo;
		this.sAddress = sAddress;
	}


	//Setters & Getters
	public void setSid(int sId) {
		this.sId = sId;
	}

	public int getSid() {
		return sId;
	}

	public void setSname(String sName) {
		this.sName = sName;
	}

	public String getSname() {
		return sName;
	}

	public void setMobNo(long sMobNo) {
		this.sMobNo = sMobNo;
	}

	public long getMobNo() {
		return sMobNo;
	}

	public void setAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getAddress() {
		return sAddress;
	}
}
