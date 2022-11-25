package Day3;

import java.util.Scanner;


public class Marisza_Latihan3 {

	public static void main(String[] args) {
		
		Scanner baca = new Scanner(System.in);
		
		System.out.println("Nama anda:");
		String nama= baca.nextLine().toUpperCase();
	
		//pecah
		String[]Anama= nama.split(" ");
		//cetak
		for(int i=0; i<Anama.length; i++) {
			String awal= Anama[i].substring(0,1);
			String akhir=Anama[i].substring(Anama[i].length()-1);
			
			System.out.println(awal+" "+akhir);
	
		}
		
		baca.close();
	}
	

}
