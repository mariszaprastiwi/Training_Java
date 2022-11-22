package Day2;

public class IfEx {
	
	public static void main(String[] args) {
		int umur = 26
				;
		//jika umur dibawah 25 maka cetak belum cukup umur
		int score =100;
		//jika score 100 maka cetak lulus
		
		String point = "B"; //jika huruf ato string kondisi pakai equals
		
		//if single body tidak pakai tanda {}
		if(false) 
			System.out.println("if sebaris1");
			System.out.println("if sebaris2");
		
	
		//jika true maka cetak
		if(true) {
			System.out.println("benar");
		}
		
		//untuk pembanding huruf
		//jika point A atau B cetak high point
		if(point.equals("A") || point.equals("B")) {
			System.out.println("high point");
		}
			
		//jika point A cetak lulusan terbaik
		if(point.equals("A")) { 
			System.out.println("Lulusan terbaik");
		}
		
		//kondisi jika nilai = nilai yang di deklarasi
		if(score == 100) {
			System.out.println("Lulus");
		}
		
		System.out.println("start");
		if(umur<=25) {
			System.out.println("belum cukup umur");
		}
		else {
			System.out.println("cukup umur");
		}
		System.out.println("end");
		
		
	}
}
