package com.tns.framework;

public abstract class ShopAcc {

	protected int accNo;
	protected String accNm;
	protected float charges;
	
	public int getAccNo(){	
		System.out.println("Your account number "+ accNo);
		return accNo;
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public String getAccNm(){	
		System.out.println("Your account Name " + accNm);
		return accNm;
	}
	
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	public float getCharges(){
		System.out.println("Dear user,Your product charges are : "+ charges);
		return charges;
	}
	
	public void setAccNm(float charges) {
		this.charges = charges;
	}	
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	
	public void bookProduct(float charges) {
		System.out.println("Thanks for shopping visit again!!" + "\n");
	}
	
	
	public void items(float charges) {
		System.out.println("Items are delivered with charges :"+charges);

	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}