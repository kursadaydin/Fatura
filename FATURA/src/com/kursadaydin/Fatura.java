package com.kursadaydin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Fatura {
	
	private double TOPLAM_BORC=100.0;
	
	
	
	private final String SON_ODEME_TARIHI =" 01.08.2014";
	
	
	
	public double getTOPLAM_BORC() {
		return TOPLAM_BORC;
	}


	public void setTOPLAM_BORC(double tOPLAM_BORC) {
		TOPLAM_BORC = tOPLAM_BORC;
	}


	public String getSON_ODEME_TARIHI() {
		return SON_ODEME_TARIHI;
	}

	

	public double faiz_hesapla(){
		
		double faiz_orani=0.03;
		
		double faiz_tutatý = TOPLAM_BORC*faiz_orani; 
		
		
		return faiz_tutatý;	
	}
	
	
	public void borc_ode( double odenen_tutar, String odeme_tarihi) throws ParseException{
		
		TOPLAM_BORC= TOPLAM_BORC-odenen_tutar;
		
		if (TOPLAM_BORC>0) {
			
			System.out.println(TOPLAM_BORC+ "TL kadar daha borcunuz bulunmaktadýr.... ");
			
		}
			
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		 
    	java.util.Date date =formatter.parse(SON_ODEME_TARIHI);
    	java.util.Date date2 =formatter.parse(odeme_tarihi);
    	
        
    	Calendar c = Calendar.getInstance();
    	c.setTime(date);
    	
    	Calendar c2 = Calendar.getInstance();
    	c.setTime(date2);
    	
    	int gec_odenen_gun_sayisi = c2.get(Calendar.DATE)- c.get(Calendar.DATE);
    	
    	
    	if ( c.get(Calendar.DATE)< c2.get(Calendar.DATE) ){
    		
    		double faiz_tutari=gec_odenen_gun_sayisi*0.03;
    		
    		TOPLAM_BORC= TOPLAM_BORC+ faiz_tutari;
    		
    		System.out.println("Toplamda " + gec_odenen_gun_sayisi + " gün geç ödeme yapmýþ bulunmaktasýnýz.");
    		
    	}
             
		
	}
	
	

}
