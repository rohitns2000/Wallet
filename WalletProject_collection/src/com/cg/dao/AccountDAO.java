package com.cg.dao;

import java.util.Map;

import com.cg.bean.Account;

public interface AccountDAO {
	public boolean addAccount(Account ob);
	public boolean updateAccount(Account ob);
	public boolean deleteAccount(long o);
	public Account getAccount(Long mobileno);
	public Map<Long,Account> getAllAccounts();
}
