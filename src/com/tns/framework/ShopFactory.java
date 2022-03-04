package com.tns.framework;

public abstract class ShopFactory {

	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		return null;
	}
	
	NormalAcc getNewNormalAccount(int accNo, String accNm, float charges) {
		return null;
		
	}

}
