package zentrum;

public class Leer {

	public static void main(String[] jaad) {

		int meinesumme = rechneSumme(5, 564456456);		
		Long meinRechnerei1 = rechne(43564534534543567L, 5464564645645656L, 5643634634657L);
		Long meinRechnerei244 = rechne(1L, 20L, 8L);

		System.out.println("meine summequartsc ist   " +meinesumme);
		
		System.out.println("meine rechnerei1 ist    " + meinRechnerei1);
		
		System.out.println("meine meinRechnerei244 ist    "+ meinRechnerei244);
		
	}

	public static Integer rechneSumme(int a, int x) {

		int c = a + x;

		return c;

	}

	public static Long rechne(Long a, Long x, Long b) {

		Long c = (a * x)/b;

		return c;

	}

}
