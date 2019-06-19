package cg;
import java.util.*;


public class Demo3 {
	
	public static void main(String[] args) {
		Map<String,Double> m = new HashMap<String,Double>();
		//Map<String,Double> m = new TreeMap<String,Double>();//null not accepted,name sorted
		m.put("Ram" , 5000.00);
		m.put("Sham" , 7000.00);
		m.put("Abdul" , 9000.00);
		m.put("Ganesh" , 4000.00);
		//m.put(null , 5000.00);
		
		System.out.println(m);
		System.out.println(m.size());
		
		Set<String>keysSet=m.keySet();
		System.out.println(keysSet);
		
		for(String k : keysSet)
		{
			Double val=m.get(k);
			System.out.println(k+" has balance of Rs. "+val);
		}
		System.out.println("========================");
		Double bal = m.get("Sham");
		
		System.out.println("Before balance "+bal);
		bal = bal - 3000.00;//auto unboxing
		m.put("Sham", bal);//auto boxing
		System.out.println("After balance "+bal);
		System.out.println("========================");
		
		
		//collection and collections below are the steps to sort the values
		Collection<Double> vals = m.values();
		List<Double> vallist = new ArrayList<Double>(vals);
		
		Collections.sort(vallist);
		
		for(double d:vallist)
		{
			System.out.println(d);
		}
		
	}

	

}
