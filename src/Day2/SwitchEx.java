package Day2;

public class SwitchEx {
	
	public static void main(String[] args) {
		
		String lampu = "kuning";
		//jika lampu merah maka cetak berenti
		//jika lampu kuning maka cetak bersedia
		//jika lampu hijau maka cetak jalan
		
		
		switch(lampu) {
		case "merah":
			System.out.println("Berenti");
			break;
		case "kuning":
			System.out.println("Bersedia");
			break;
		case "hijau":
			System.out.println("Jalan");
			break;
			default:
				System.out.println("lampu rusak");
		}
	}
	

}
