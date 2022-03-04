package com.tns.application;
import com.tns.framework.NormalAcc;
import com.tns.framework.ShopAcc;

public class GSNormalAcc extends NormalAcc {

	
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}

	public void bookProduct(float a) {
		System.out.println("Dear Normal user,Your delivery charges are : "+ deliveryCharges);
		super.bookProduct(a);
	}
 
	@Override
	public String toString() {
		return "GSNormalAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}