package com.adm.struts2.dao;
/***
 * 
 * @author greatwqs.iteye.com
 * @data 2011-12-01
 */
public class PersonDao {

	/***
	 * @param username
	 * @param password
	 * @return
	 */
	public boolean isPersonCanLogin(String username, String password) {
		return username.equals(password);
	}
}
