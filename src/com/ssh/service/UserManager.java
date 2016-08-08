package com.ssh.service;

import org.hibernate.HibernateException;

import com.ssh.forms.UserForm;

public interface UserManager {

	public void regUser(UserForm user) throws HibernateException;

}
