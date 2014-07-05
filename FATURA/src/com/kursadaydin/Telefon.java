package com.kursadaydin;

public class Telefon extends Fatura {
	
	 private final  String TEL_NO= "1234562";

	@Override
	public double faiz_hesapla() {
		double faiz_orani=0.04;
		
		double faiz_tutari = getTOPLAM_BORC()*faiz_orani;
		
		return faiz_tutari;	
	}
	 
	 	 

}

