package zentrum;

public class Hello_java {
	
	static String leerzeichen = " ";
	static String semincolone = ";";
	

	public static void main(String[] args) {
		
		sagHallo("jaad");
		sagHallo("naim");
		sagCiao("hhhh");

	}
	
	
	public static void sagHallo (String name) {		
		
		System.out.println("hallo"+ leerzeichen + name);	
		
	}
	
    private static void sagCiao (String name) {		
		
		System.out.println("Ciao alle");	
		
	}

}
