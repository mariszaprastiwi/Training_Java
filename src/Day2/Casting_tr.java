package Day2;

public class Casting_tr {
	public static void main(String[] args) {
	
	
	int n1 =100;
	long n2 =0;
	String n3="150";
	
	
	n2=n1;
	n1 = (int)n2; //long ke int
	
	n1 = Integer.parseInt(n3); //string to int
	
	System.out.println(n1);
	System.out.println(n2);
	
	}

}
