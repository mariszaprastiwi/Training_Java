package Day1;

import java.util.Scanner;

public class Marisza_ReadKB {
	public static void main(String[] args) {
	
	//buat var baca
			System.out.println("masukan nama : ");
			Scanner baca = new Scanner(System.in);
			String nama= baca.nextLine(); // input dati keyboard ke variabel nama
			
			System.out.println("nama di input: " +nama);
			baca.close();
					
	}

}
