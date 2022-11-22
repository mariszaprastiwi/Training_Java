package Day2;

import java.util.Scanner;

public class Marisza_latihan5 {
	public static void main(String[] args) {
		System.out.println("input bil:");
		Scanner baca = new Scanner(System.in);
		int bil= baca.nextInt();
		System.out.println("==output==");
		for(int i=1; i<=bil; i++) {// a=a+1
			System.out.print(i);
			if(i<bil) {
			System.out.print(",");
			}
		}		
		baca.close();
	
	}

}
