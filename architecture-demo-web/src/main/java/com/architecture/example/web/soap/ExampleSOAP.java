package com.architecture.example.web.soap;

import javax.jws.WebService;
import javax.ws.rs.PathParam;

import com.architecture.example.dto.ExampleUsersDTO;

@WebService
public interface ExampleSOAP {

	public String save(ExampleUsersDTO exampleDto);
	
	public void update(ExampleUsersDTO exampleDto);
	
	public void delete(String id);
	
	public Object load(String id);
	
	public Object query(String name);
}
