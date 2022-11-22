package Day2;

import java.util.Scanner;

public class Marisza_latihan3 {

	public static void main(String[] args) {
		System.out.println("input nama :");
		System.out.println("cetak: ");
		Scanner baca = new Scanner(System.in);
		String nama= baca.nextLine();
		String cetak=baca.nextLine();
		int hasil= Integer.parseInt(cetak);
		//cetak

		System.out.println("==output==");
		for(int a=0; a<hasil; a++) {// a=a+1
			System.out.println((a+1)+"." +nama);
		}
		
		baca.close();

	}

}
