package com.tns.entry;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopAcc;
import com.tns.framework.ShopFactory;

public class Entry {

	public static void main(String[] args) {
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAccount(001, "Sofia", 10000 , true);
		gssfactory.getNewNormalAccount(002, "Katrina", 3000 ,50);
		
		GSPrimeAcc gsprime = new GSPrimeAcc(001, "Sofia", 10000 , true);
		gsprime.getAccNo();
		gsprime.getAccNm();
		gsprime.getCharges();
		
		gsprime.bookProduct(1);
		gsprime.toString();
		
		
		GSNormalAcc gsnormal = new GSNormalAcc(002, "Katrina", 3000 ,50);
		gsnormal.getAccNo(); 
		gsnormal.getAccNm();
		gsnormal.getCharges();
		
		gsnormal.bookProduct(1);
		gsnormal.toString();
		
		
		
		
	}

}
