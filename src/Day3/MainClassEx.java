package Day3;



public class MainClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("start");
		
		//contruc kelas
		Ikan ikan1= new Ikan();//laut
		Ikan ikan2= new Ikan();//tawar
		
		ikan1.nama="paus";
		ikan1.habitat="laut";
		
		ikan2.nama="bawel";
		ikan2.habitat="tawar";
		
		System.out.println("nama ikan:" +ikan1.nama);
		System.out.println("nama habitat:" +ikan1.habitat);
		System.out.println();
		ikan1.bernafas();
		System.out.println("nama ikan:" +ikan2.nama);
		System.out.println("nama habitat:" +ikan2.habitat);
		ikan2.bernafas();
		System.out.println("end");

	}

}
