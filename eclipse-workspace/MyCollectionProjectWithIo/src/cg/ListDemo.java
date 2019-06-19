package cg;

import java.util.*;

public class ListDemo {
	public static void main(String[] args) {

		List<String> col = new ArrayList<String>();

		col.add("Ram");
		col.add("Sham");
		col.add("Abdul");
		//col.add(55); //new Integer(55)//AutoBoxing Takes Place
		col.add(null);
		col.add("Ganesh");
		col.add("Ram");
		System.out.println(col);
		System.out.println(col.size());
		
		System.out.println("============================");//enhanced for loop execution
		for(String s : col)
		{
			System.out.println(s);
		}
		System.out.println("============================");
		Iterator<String> it = col.iterator();
		while(it.hasNext()) //iterator consists of pointer
		{
			String ss = it.next();
			System.out.println(ss);
		}

	}

}
