package com.vektorel;

public class Runner_Array_Exam {

	public static void main(String[] args) {
		
		int[] sayi_dizisi = {12,3,22,67};
		// yukar�da olan dizinin de�erleri toplam� nedir?
		int toplam=0;
		
		for(int i=0;i<sayi_dizisi.length;i++) {
			//System.out.println(sayi_dizisi[i]);
			toplam += sayi_dizisi[i];
		}
		System.out.println("Toplam...: "+ toplam);

	}//Main Sonu
}//class Sonu
