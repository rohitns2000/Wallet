package com.cg.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.bean.Account;
import com.cg.service.AccountService;

public class AccountDAOImpl implements AccountDAO {
	static Map<Long,Account> accmap= new HashMap<Long,Account>();
	@Override
	public boolean addAccount(Account ob) {
		accmap.put(ob.getMobile(), ob);
		return true;
	}

	@Override
	public boolean updateAccount(Account ob) {
		accmap.put(ob.getMobile(), ob);
		return false;
	}

	@Override
	public boolean deleteAccount(long ob) {
		accmap.remove(ob);
		return true;
	}

	@Override
	public Account getAccount(Long mobileno) {
		Account ob1 = accmap.get(mobileno);
		return ob1;
	}

	@Override
	public Map<Long, Account> getAllAccounts() {
		return accmap;
	}

}
