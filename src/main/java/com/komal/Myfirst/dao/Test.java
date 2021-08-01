package com.komal.Myfirst.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {
@Id
int Key;
int Value;
public int getKey() {
	return Key;
}
public void setKey(int key) {
	Key = key;
}
public int getValue() {
	return Value;
}
public void setValue(int value) {
	Value = value;
}

}
