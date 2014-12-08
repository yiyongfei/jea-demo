package com.architecture.example.dao;

import java.util.List;

import com.ea.core.orm.dao.BaseDAO;

public interface ExampleDAO extends BaseDAO{

	public List<Object> queryAll() throws Exception;
	
	public List<Object> queryByName(String username) throws Exception;
	
	public int countAll() throws Exception;
}
