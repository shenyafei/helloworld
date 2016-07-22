package com.adm.struts2.action;

import java.util.Map;

import com.adm.struts2.dao.PersonDao;
import com.adm.struts2.entity.Person;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/***
 * 
 * @author greatwqs.iteye.com
 * @data 2011-12-01
 */
public class PersonAction extends ActionSupport {
    
	private Person per;

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	public String execute() throws Exception {
		PersonDao dao = new PersonDao();
		boolean flag = dao.isPersonCanLogin(per.getUsername(), per.getPassword());
		if(flag){
			@SuppressWarnings("rawtypes")
			Map session=(Map)ActionContext.getContext().get(ActionContext.SESSION);
			session.put("user", per.getUsername());
			return SUCCESS;
		} else {
			return INPUT;
		}
	}

	public Person getPer() {
		return per;
	}

	public void setPer(Person per) {
		this.per = per;
	}
}
