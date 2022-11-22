package Day1;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Training Day 1");
		
		System.out.println("Nama 	: Marisza \nKota	: Jakarta");
		System.out.println("Kota	: Jakarta");
		
		
		//deklarasi & initialise
		int nilai=10; // prim tipe data
		String nama ="Marisza"; //nonprim tipe data
		
		int a=5;
		int b=10;
		
		int total = a+b;
		nilai = 5;
		
		
		System.out.println("isi nilai :"+nilai);
		System.out.println("jumlah a+b="+total);
		
		//Logical Operator
		
		int n=10;
		int m=5;
		
		//cara lama exp:
		n=n+1;
		n=n+5;
		//incre
		n++;
		n+=5;
		
		//convert dari integer ke character
		m= Integer.parseInt("5");
		
		System.out.println(n);
		System.out.println(m);
		
		//buat var baca
		System.out.println("masukan nama : ");
		Scanner baca = new Scanner(System.in);
		String namax= baca.nextLine(); // input dari keyboard ke variabel nama
		
		System.out.println("nama di input: " +namax);
		baca.close();
		
		
		
	
	}

}
