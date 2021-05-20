
public class Set3 {
public static void main(String[] args) {
	Main3 m3=new Main3();
	m3.storeCountryCaptials("ind", "Delhi");
	m3.storeCountryCaptials("japan", "Tokoyo");
	System.out.println(m3.getCaptialByCountry("ind"));
	System.out.println(m3.getCountryByCaptial1("Tokoyo"));
}
}
