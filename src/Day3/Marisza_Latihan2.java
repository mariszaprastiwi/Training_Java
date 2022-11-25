package Day3;

import java.util.Scanner;

public class Marisza_Latihan2 {
	public static void mian(String[] args) {
		
	Scanner baca =  new Scanner(System.in);
	int[]deret= {3,2,1,4,5,6,9,8};
	boolean ada = false;
	System.out.println("Cari bilangan :");
	int bil = baca.nextInt();
	
	//proses 
	for(int i=0; i<deret.length ;i++) {
		
		if(deret[i]==bil) {
			ada=true;
		}
		
	}
	
	//cetak
	if(ada==true) {
		System.out.println("bilangan "+bil+"ada dalam array");
	}else {
		System.out.println("bilangan "+bil+"takda dalam array");
	}
	
	
	baca.close();
		
	}

}
