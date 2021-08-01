package com.komal.Myfirst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.komal.Myfirst.core.HashMapKomal;

@RestController 
@RequestMapping(value="/hashmap", produces = MediaType.APPLICATION_JSON_VALUE)
public class APIcontroller {
	@Autowired
	HashMapKomal hk;
	@RequestMapping(value="/get/{key}", method=RequestMethod.GET)
	public int getValue(@PathVariable int key)
	{
		return hk.get(key);
	}
	
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public void putKeyValue(@Validated @RequestBody HashMapCreateRequest request)
	{
		hk.put(request.key, request.value);
	}
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String myName()
	{
		return "Hi";
	}
	
}
