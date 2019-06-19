package cg;
import java.util.*;
import com.cg.bean.*;
import java.io.*;
import com.cg.service.*;
;public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<Long,Account>accmap=new TreeMap<Long,Account>();
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String choice="";
		while(true)
		{
		System.out.println("Menu");
		System.out.println("==================");
		System.out.println("1.Create new Account");
		System.out.println("2.Print all Accounts");
		System.out.println("3.exit");
		System.out.println("Enter Your Choice :");
		System.out.println("==================");
		choice = br.readLine();
		switch(choice)
		{
			case "1": int id=0;
							long mb=0L;
							String ah="";
							double bal=0.0;
							//Accepting and validating input for Account number
							System.out.println("Enter Account Number");
							while(true)
							{
								String s_id=br.readLine();
								boolean ch1=Validator.validatedata(s_id, Validator.aidpattern);
								if(ch1==true)
								{
									try
									{
										id=Integer.parseInt(s_id);
										break;
									}
									catch(NumberFormatException e)
									{
										System.out.println("Account Number Must Be numeric. Re-enter!");
									}
								}
								else 
								{
									System.out.println("Re Enter Account Number in 3 digits");
								}
							}//end of account number while
							//Accepting and validating input for Mobile Number
							System.out.println("Enter mobile Number");
							while(true)
							{
								String s_mb=br.readLine();
								boolean ch1=Validator.validatedata(s_mb, Validator.mobilepattern);
								if(ch1==true)
								{
									try
									{
										mb=Long.parseLong(s_mb);
										break;
									}
									catch(NumberFormatException e)
									{
										System.out.println("Mobile number Must Be numeric. Re-enter!");
									}
								}
								else 
								{
									System.out.println("Re Enter Mobile Number in 10 digits");
								}
							}//end of mobile while
							////accepting and validating account holder() shouldnt be empty)
							System.out.println("Enter Account holders name");
							ah=br.readLine();
							//accepting and validating balance(first letter shouldnt be space,)
							System.out.println("Enter initial balance");
							String s_bal=br.readLine();
							bal=Double.parseDouble(s_bal);//typecasting
							Account ob=new Account(id,mb,ah,bal);
							accmap.put(ob.getMobile(), ob);
				break;
			case "2":
							Collection<Account> vc = accmap.values();
							List<Account> acclist= new ArrayList<Account>(vc);
							Collections.sort(acclist);
							for(Account o :acclist)
							{
								System.out.println(o);
								//in actual project use service.printStatement(o);
							}
				
				break;
			case "3": 	System.out.println("Exiting Program Thank You! :)");
							System.exit(0);
							break;
			default:
				System.out.println("Please Enter A Valid Number!!!");
		}
		
		
		}//end of menu
		
		
		
		
//		System.out.println(accmap);
//		System.out.println(accmap.keySet());
//		
//		System.out.println("==========================================");
//		Collection<Account> vc = accmap.values();
//		List<Account> acclist= new ArrayList<Account>(vc);
//		Collections.sort(acclist);
//		for(Account o :acclist)
//		{
//			System.out.println(o);
//		}
//		System.out.println("================================sort by name");
//		
//		Comparator nc = new NameComparator();
//		Collections.sort(acclist,nc);
//		for(Account o : acclist)
//		{
//			System.out.println(o);
//		}
//		System.out.println("================================sort by balance");
//		
//		Comparator bc = new BalanceComparator();
//		Collections.sort(acclist,bc);
//		for(Account o : acclist)
//		{
//			System.out.println(o);
//		}

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