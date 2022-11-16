import java.util.*;
class HashtableDemo{
	public static void main(String[] args){
		Hashtable<String,Double> gdp=new Hashtable<String,Double>();
		gdp.put("USA",2.00);
		gdp.put("China",6.00);
		gdp.put("Japan",0.70);
		gdp.put("Germany",1.10);
		gdp.put("India",5.80);
		Enumeration<String> country=gdp.keys();
		System.out.println("GDP statistics of 5 counries");
        while(country.hasMoreElements()) {
            String str = country.nextElement();
            System.out.println(str + ": " +gdp.get(str));
       }
       System.out.println();
    }
}
/*Input and Output
GDP statistics of 5 counries
China: 6.0
USA: 2.0
Germany: 1.1
India: 5.8
Japan: 0.7
*/	