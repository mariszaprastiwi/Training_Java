package Day2;

import java.util.Scanner;

public class Marisza_latihan1 {

	public static void main(String[] args) {
		System.out.println("masukan huruf :");
		Scanner baca = new Scanner(System.in);
		String huruf= baca.nextLine();
		huruf = huruf.toUpperCase();// besarkan huruf
		String hasil=" ";
	
		if(huruf.equals("A") || huruf.equals("I") || huruf.equals("U") || huruf.equals("E") || huruf.equals("O")) {
			hasil="vokal";
		}
		else {
			hasil="konsonan";
		}
		System.out.println("huruf "+huruf+ "=" +hasil);
		baca.close();
		
		
		//proses
		switch(huruf) {
		case "A":
		case "I":
		case "U":
		case "E":
		case "O":
			hasil = "Vokal";
			break;
			default:
				hasil = "Konsonan";	
		}
		System.out.println("hasil dari proses switch");
		System.out.println("huruf "+huruf+ "=" +hasil);
		baca.close();
	}

}
