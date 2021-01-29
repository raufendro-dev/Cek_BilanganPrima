package com.bilanganprima;

import java.util.Scanner;

public class Prima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int bilangan;
        int cek=0;
        bilangan=input.nextInt();
        System.out.println("Bilangan bisa dibagi dengan beberapa bilangan berikut :");
        for (int i=2; i<=bilangan; i++) {
        	if(bilangan%i==0) {
        		
        		System.out.println(i);
        		cek=cek+1;
        	}
        }
        System.out.println("");
        System.out.println("Bisa dibagi dengan bilangan lain sebanyak "+cek+" bilangan");
        System.out.println("===========================================================");
        if(cek==1) {
        	System.out.println(bilangan+" adalah bilangan prima");
        } else {
        	System.out.println(bilangan+" bukan bilangan prima");
        }
	}

}
