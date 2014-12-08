package com.architecture.example.web;


import com.architecture.example.dto.ExampleUsersDTO;
import com.architecture.example.web.rest.ExampleREST;
import com.ea.core.base.dto.DynamicDTO;
import com.ea.core.base.model.BaseModel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//@RunWith(SpringJUnit4ClassRunner.class)  
//@ContextConfiguration(locations="/applicationContext.xml")
public class ControllerTest {

	
	//@Autowired
	private ExampleREST exampleREST;
	
	//@Test
	public void testSave() throws Exception{
		ExampleUsersDTO exampleDto = new ExampleUsersDTO();
		exampleDto.setUserId("woijjfkdfjoiwjer9rifdf");
		exampleDto.setUsername("王小五");
		exampleDto.setPassword("wiejrie");
		Object obj =  exampleREST.save(exampleDto);
		System.out.println(obj);
	}
	
	//@Test
	public void testDelete() throws Exception{
		exampleREST.delete("");
	}
	
	//@Test
	public void testLoad() throws Exception{
		BaseModel obj = (BaseModel) exampleREST.load("483d5c5f610840789d86695b76c8e26a");
		DynamicDTO dto = new DynamicDTO(obj);
		System.out.println(dto.getMap());
	}
}
