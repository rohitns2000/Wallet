package cg;

import java.util.*;


public class Demo2 {

	public static void main(String[] args) {
		// generic - Compiler is watching you O.O
		//Set <String>col = new HashSet<String>();
		//Set <String>col = new LinkedHashSet<String>();//maintains insertion order
		Set <String>col = new TreeSet<String>();
		//does not allow null as object throws nullpointer exception,sorted order,No insertion order
		col.add("Ram");
		col.add("Sham");
		col.add("Abdul");
		//col.add(55); //new Integer(55)//AutoBoxing Takes Place
		col.add(null);
		col.add("Ganesh");
		col.add("Ram");
		System.out.println(col);
		System.out.println(col.size());

	}

}
