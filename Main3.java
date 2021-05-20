import java.util.*;
public class Main3 {
	Map<String,String>hm=new HashMap();
	public void storeCountryCaptials(String c,String cap) {
		hm.put(c,cap);
	}
	public String getCountryByCaptial1(String c) {
		if(hm.containsKey(c))
			return hm.get(c);
		else
			return null;
		
	}
public String getCaptialByCountry(String cap) {
	Iterator<String> itr=hm.keySet().iterator();
	while(itr.hasNext()) {
		String t=itr.next();
		if(hm.get(t).contentEquals(cap))
			return t;
	}
	return null;
}
}
