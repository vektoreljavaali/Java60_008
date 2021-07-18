package com.vektorel;

public class Runner {

	public static void main(String[] args) {
		
		// Diziler , Arrays
		// Sayý Dizisi
		// {12,2,344434,323,3}
		// Array Syntax
		int[] sayi_dizisi = new int[15];
		char[] karakter_dizisi = new char[5];
		float[] kesirli_diziler = new float[4];
		boolean[] anahtar_dizisi = new boolean[5];
		String[] ifadeler_dizisi = new String[4];
		Runner[] runner_dizisi = new Runner[54];
		// bu þekilde yapýlan atamalarda
		// uzunluk ve içerik bilgisi direkt yazýlýr.
		int[] sa_dizi = {32,3,320,0,123,0};
		// dizilerin deðerlerini okumak
		// 1. köþeli parantes ile deðiþken iþaretlenir.
		// okunmak istenilen dizi index deðeri yazýlýr
		// NOT: Önemli!!, diziler index deðeri olarak
		// daima 0(sýfýr) dan baþlar.
	 	System.out.println(sa_dizi[4]);
	 	// bir diziye deðer atamak
	 	int sayi = 3;
	 	System.out.println(sayi);
	 	System.out.println(sayi_dizisi[4]);
	 	sayi_dizisi[4]=45;	 	
	 	for(int i=0;i<sayi_dizisi.length;i++) {
	 		System.out.println(sayi_dizisi[i]);
	 	}
		
	 	// Object-> tüm sýnýflarýn üst sýnýfýdýr.
	 	// obje dizisi tüm deðiþken türlerini 
	 	// içinde barýndýrabilir.
	 	Object[] obje_dizisi = new Object[5];
	 	obje_dizisi[0]= 2;
	 	obje_dizisi[1]= true;
	 	obje_dizisi[2]= '4';
	 	obje_dizisi[3]= "selam napan :)";
	 	obje_dizisi[4]= 43234.43433D;
	 	obje_dizisi[5]= new Runner();
	 	
	 	
	}//Main Sonu
}//Class Sonu
