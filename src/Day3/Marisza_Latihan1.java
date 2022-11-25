package Day3;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

public class Marisza_Latihan1 {

	public static void main(String[] args) {
		Scanner baca = new Scanner(System.in);
		System.out.println("Tentukan banyak menu masakah:");
	
		int b = baca.nextInt();
		baca.nextLine(); //buffer
		
		//array
		String[]menu= new String[b];
		
		//loop input masakan
		System.out.println("==output==");
		for(int i=0; i<menu.length; i++) {// a=a+1
			System.out.print("masakan ke " +(i+1)+":");
			menu[i] = baca.nextLine();
		}
		
		System.out.print("Macam masakan:");
		for(int i=0; i<menu.length; i++) {// a=a+1
			System.out.print((i+1)+"."+menu[i]+" ");
//			menu[i] = baca.nextLine();
		}
		
		baca.close();

	}

}
