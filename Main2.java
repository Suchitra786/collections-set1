import java.util.*;
public class Main2 {
Set<String>country=new HashSet<>();
public void storeCountryName(String Country) {
	country.add(Country);
}
public String findCountry(String Country) {
	Iterator<String>itr=country.iterator();
	while(itr.hasNext()) {
		if(itr.next().equals(Country))
			return Country;
	}
	return null;
}
}
