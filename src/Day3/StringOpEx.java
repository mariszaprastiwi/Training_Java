package Day3;

public class StringOpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		char[]cr= {'i','c','h','a'};
		String string=new String(cr);
		String ssString="icha";
		
		String nama="Icha";
		
		//panjang char
		System.out.println(nama.length());
		
		//replace
		String alamat = "jalan.payah";
		alamat=alamat.replace(".", " ");
		System.out.println(alamat);
		
		//substring
		String bahasaString = "JavaFramework";
		System.out.println(bahasaString.substring(0,2));
		
		//split
		String warna ="merah biru jingga";
		System.out.println(warna.split(" "));
		String[]awarna =warna.split(" ");
		System.out.println(awarna[2]);
		

	}

}
