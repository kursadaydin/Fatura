package com.kursadaydin;

public class Elektrik extends Fatura {
	
	 private final  String ABONE_NO= "1234562";

		@Override
		public double faiz_hesapla() {
			double faiz_orani=0.02;
			
			double faiz_tutari = getTOPLAM_BORC()*faiz_orani;
			
			return faiz_tutari;	

}

}