package com.vektorel;

import java.util.Scanner;

public class Runner_Array_Exam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double[] sayilar;
		double ortalama=0,toplam=0;
		System.out.println("*******************");
		System.out.println("**** ORTALAMA *****");
		System.out.println("*******************");
		System.out.println();
		System.out.print("Kaç Sayý gireceksiniz? ");
		int sayi_adedi = sc.nextInt();// kaç sayýdan oluþacak
		sayilar = new double[sayi_adedi];
		for (int i = 0; i < sayi_adedi; i++) {
			System.out.print((i+1)+".Sayýyý gir..: ");
			sayilar[i]= sc.nextDouble();
		}
		for(int i=0;i<sayi_adedi;i++) {
			toplam+=sayilar[i];
		}
		System.out.print("Ortalama....: ");
		System.out.println(toplam/sayi_adedi);

	}//Method Sonu
}//Class Sonu
