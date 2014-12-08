package com.architecture.example.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.architecture.example.dao.ExampleDAO;
import com.ea.core.orm.dao.AbstractBaseDAO;

@Repository("exampleDAO")
public class ExampleDAOImpl extends AbstractBaseDAO implements ExampleDAO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3449221379566348281L;

	public List<Object> queryAll() throws Exception{
		// TODO Auto-generated method stub
		return this.queryMany("queryAll");
	}
	
	public int countAll() throws Exception{
		// TODO Auto-generated method stub
		return (Integer)this.queryOne("countAll");
	}

	public List<Object> queryByName(String username) throws Exception {
		// TODO Auto-generated method stub
		return this.queryMany("queryByName", username);
	}

}
