package Day3;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]nama = new String[5];
		
		//isi
//		nama[0] = "Iwan";
		
		for(int i=0;i<nama.length;i++) {
			nama[i] = ("isi di " + i);
		}
		
		//cetak
		for(int i=0;i<nama.length;i++) {
			System.out.println(nama[i]);
			
		}
	}

}
