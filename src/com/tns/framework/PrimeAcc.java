package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
	
	protected static boolean isPrime;
	private static final float deliveryCharges = 0;
	
	
	public PrimeAcc(int accNo, String accNm, float charges) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}



	public void bookProduct(float charges) {
		System.out.println("Order Placed");
		super.bookProduct(charges);
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}