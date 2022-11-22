package Day1;

public class Marisza_Method {
	
	//deklarasi method
	static void cetak(Integer inNilai1,Integer inNilai2, int hasil) {
		System.out.println("nilai 1=" +inNilai1);
		System.out.println("nilai 2=" +inNilai2);
		System.out.println("hasil=" +hasil);
//		System.out.println("umur:" +inUmur);
		
	}
	 static String cetak2() {
		 String output="sukses";
		 return output;
	 }
	public static void main(String[] args) {
//		String nama = "Thename";
//		String alamat = "Dunia";
//		int umur=111;
		int nilai1=10;
		int nilai2=5;
		int hasil = nilai1+nilai2;
		
//		System.out.println("Start");
		cetak(nilai1, nilai2, hasil); // panggil method non return
//		cetak2();
		String result =cetak2(); //panggil method return
		System.out.println("jumlah " +nilai1+ " + " +nilai2+ " adalah " +hasil);
//		System.out.println("End");
		
	}
		

}
