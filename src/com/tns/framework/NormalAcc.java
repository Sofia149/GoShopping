package com.tns.framework;

public abstract class NormalAcc extends ShopAcc {
	
	protected static float deliveryCharges = 100;
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
	}

	public void bookProduct(float charges) {
		System.out.println("Order Placed");
		super.bookProduct(charges);
	}
	
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}