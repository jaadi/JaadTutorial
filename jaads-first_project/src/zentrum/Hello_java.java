package zentrum;

public class Hello_java {
	
	static String leerzeichen = " ";
	static String semincolone = ";";
	

	public static void main(String[] args) {
		
		sagHallo("jaad");
		sagHallo("naim");
		sagCiao("salma","mama");

	}
	
	
	public static void sagHallo (String name) {		
		
		System.out.println("hallo"+ leerzeichen + name);	
		
	}
	
    private static void sagCiao (String name, String name2) {		
		
		System.out.println("Ciao alle !! auch"+ leerzeichen+ name+leerzeichen+name2);	
		
	}

}
