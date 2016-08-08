package com.ssh.service.impl;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import com.ssh.beans.User;
import com.ssh.dao.BaseDao;
import com.ssh.forms.UserForm;
import com.ssh.service.UserManager;

public class UserManagerImpl implements UserManager {

	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	@Override
	public void regUser(UserForm userForm) throws HibernateException {
		User user = new User();
		BeanUtils.copyProperties(userForm, user);
		dao.saveObject(user);
	}

}
