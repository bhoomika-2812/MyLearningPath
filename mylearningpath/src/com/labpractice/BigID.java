package com.labpractice;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigID {

	public static void main(String[] args) {
		
		BigInteger b1 = new BigInteger("8483409239402940290492039493");
		BigInteger b2 = new BigInteger("923891830913019202732382381983");
		BigInteger bigintegerresult = b1.add(b2);
		
		BigDecimal bd1 = new BigDecimal("55.08");
		BigDecimal bd2 = new BigDecimal("29.8745");
		BigDecimal bigdecimalresult = bd1.add(bd2);
		
		System.out.println("Big Integer Value 1 : " +b1);
		System.out.println("Big Integer Value 2 : " +b2);
		System.out.println("Big Integer Result : " +bigintegerresult);
		
		System.out.println("Big Decimal Value 1 : " +bd1);
		System.out.println("Big Decimal Value 2 : " +bd2);
		System.out.println("Big Decimal Result : " +bigdecimalresult);

	}

}
