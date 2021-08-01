package com.komal.Myfirst.core;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.komal.Myfirst.dao.Test;
import com.komal.Myfirst.dao.TestRepos;



@Service
public class HashMapKomal {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(HashMapKomal.class);
	@Autowired
	TestRepos testr;
	public int get(int key) 
	{
		return 1;
	}
	public void put(int a,int b)
	{
		
		logger.error(a);
		logger.error(b);
		Test t=new Test();
		t.setKey(a);
		t.setValue(b);
		testr.save(t);
	}
	
	public void delete(int key)
	{
		
	}
	
	
}
