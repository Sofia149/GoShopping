package com.tns.application;
import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	
	private static final float deliverycharges = 0;
	
	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float a) {
		System.out.println("Dear Prime user,Your delivery charges are : "+ deliverycharges);
		super.bookProduct(a);
		}
	
	
	@Override
	public String toString() {
		return "GSPrimeAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}