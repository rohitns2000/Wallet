package cg;
import java.util.*;
import com.cg.bean.*;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Long,Account>accmap=new TreeMap<Long,Account>();
		Account ob1 = new Account(101,986724705,"Ram",25000.00);
		accmap.put(ob1.getMobile(), ob1);
		Account ob2 = new Account(102,986724702,"Sham",55000.00);
		accmap.put(ob2.getMobile(), ob2);
		Account ob3 = new Account(103,986724701,"Abdul",15000.00);
		accmap.put(ob3.getMobile(), ob3);
		Account ob4 = new Account(104,986724704,"Ganesh",45000.00);
		accmap.put(ob4.getMobile(), ob4);
		
		System.out.println(accmap);
		System.out.println(accmap.keySet());
		
		System.out.println("==========================================");
		Collection<Account> vc = accmap.values();
		List<Account> acclist= new ArrayList<Account>(vc);
		Collections.sort(acclist);
		for(Account o :acclist)
		{
			System.out.println(o);
		}
		System.out.println("================================sort by name");
		
		Comparator nc = new NameComparator();
		Collections.sort(acclist,nc);
		for(Account o : acclist)
		{
			System.out.println(o);
		}
		System.out.println("================================sort by balance");
		
		Comparator bc = new BalanceComparator();
		Collections.sort(acclist,bc);
		for(Account o : acclist)
		{
			System.out.println(o);
		}

//		Set<Account> aset = new TreeSet<Account>();
//		aset.add(Account object); // compareTo method of account Comparable //default sorting
//		aset.add(Account object);
//		aset.add(Account object);
		
//      sort by name then
//		Comparator nc = new NameComparator();
//		Set<Account> aset = new TreeSet<Account>(nc);
//		aset.add(Account object);//compare method of Name Comparator//custom sorting
//		aset.add(Account object);
		
		
	}

}