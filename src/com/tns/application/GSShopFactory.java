package com.tns.application;

import com.tns.framework.*;


public class GSShopFactory extends ShopFactory {
	
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return gsprime;
		}
	
	
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc gsnormal = new GSNormalAcc(accNo, accNm, charges, deliveryCharges); 
		return gsnormal;	
	}

}
