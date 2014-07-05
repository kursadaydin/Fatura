package com.kursadaydin;

import java.text.ParseException;

public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Fatura fatura1 = new Fatura();
		
		System.out.println(fatura1.getTOPLAM_BORC());
		
		fatura1.borc_ode(15, "03.08.2014");
		
		System.out.println("Kalan toplam borcunuz :" + fatura1.getTOPLAM_BORC());
		
		
		Telefon t1 = new Telefon();
		System.out.println(t1.faiz_hesapla());
		
		Elektrik e1 = new Elektrik();
		System.out.println(e1.faiz_hesapla());
		

	}

}

