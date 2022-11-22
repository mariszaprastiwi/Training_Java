package Day2;

public class TryCatchEx {
	public static void main(String[] args) {
		System.out.println("start");
		
		int n=10;
		int hasil = 0;
		
		try {
			 hasil = n / 2;
		}catch (Exception e) {
			System.out.println("Error :"+e);
		}
		
		System.out.println(hasil);
		
		System.out.println("end");
	}

}
