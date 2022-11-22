package Day2;

import java.util.Scanner;

public class Marisza_latihan4 {
	public static void main(String[] args) {
		System.out.println("input bil:");
//		System.out.println("cetak: ");
		Scanner baca = new Scanner(System.in);
		int bil= baca.nextInt();
//		String cetak=baca.nextLine();
//		int hasil= Integer.parseInt(bil);
		//cetak
//		int i=1;

		System.out.println("==output==");
		for(int i=1; i<=bil; i++) {// a=a+1
			System.out.print(i);
		}
		System.out.println("");
		
		for(int i=1; i<=bil; i++) {
		System.out.print(i*2 + " ");
		}
		
		System.out.println("");
		
		for(int i=1; i<=bil; i++) {
			System.out.print((i*2)-1 + " ");
		}
		
		baca.close();

	}

}
