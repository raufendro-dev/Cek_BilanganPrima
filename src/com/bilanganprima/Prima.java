package com.bilanganprima;

import java.util.Scanner;

public class Prima {
	public static void bilanganPrima(int bilangan) {
        int cek=0;
        
        System.out.println("Bilangan bisa dibagi dengan bilangan berikut :");
        for (int i=2; i<=bilangan; i++) {
        	if(bilangan%i==0) {
        		
        		System.out.println(i);
        		cek=cek+1;
        	}
        }
        System.out.println("");
        System.out.println(bilangan+" bisa dibagi dengan bilangan lain sebanyak "+cek+" bilangan");
        System.out.println("===========================================================");
        if(cek==1) {
        	System.out.println(bilangan+" adalah bilangan prima");
        } else {
        	System.out.println(bilangan+" bukan bilangan prima");
        }	
	}

	public static void main(String[] args) {
		
		int masuk;
		Scanner input = new Scanner(System.in);
		masuk=input.nextInt();
		bilanganPrima(masuk);
	}
	

}
