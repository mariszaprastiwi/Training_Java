package Day3.inhertiance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KendaraanDarat kd1= new KendaraanDarat();
		KendaraanDarat kd2 =new KendaraanDarat();
		
		kd1.namaKendaraan = "Truck";
		kd2.namaKendaraan = "Bus";
		
		System.out.println("Kendaraan pertama:" +kd1.namaKendaraan );
		System.out.println("Bergerak di :"  );
		kd1.bergerakdi();

	}

}
