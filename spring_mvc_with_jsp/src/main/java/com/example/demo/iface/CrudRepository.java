package com.example.demo.iface;

import java.util.List;

public interface CrudRepository <T>{
	public int add(T t);
	public List<T> findAll(); 
	public int deleteById(int id);
	public T findById(int id);
	public int update(T t);
}
