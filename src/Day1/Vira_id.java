package Day1;

import java.util.Scanner;

public class Vira_id {
	public static void main(String[] args) {
		
		//buat var baca
		Scanner baca = new Scanner(System.in);// input dati keyboard ke variabel nama
		
				System.out.println("nama : ");
				String nama= baca.nextLine();
				System.out.println("alamat : ");
				String alamat= baca.nextLine();
				System.out.println("umur : ");
				String umur= baca.nextLine();

				System.out.println("data input nama: "+nama+ ", alamat " +alamat+ ", umur " +umur);
				baca.close();
						
		}

}
