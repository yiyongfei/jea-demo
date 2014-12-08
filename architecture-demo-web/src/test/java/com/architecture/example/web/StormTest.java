package com.architecture.example.web;

import java.util.HashMap;
import java.util.Map;

import com.architecture.example.dto.ExampleUsersDTO;
import com.ea.core.web.bridge.BridgeConstant;
import com.ea.core.web.bridge.BridgeContext;
import com.ea.core.web.bridge.sync.local.SpringConnector;
import com.ea.core.web.bridge.sync.storm.LocalConnector;
import com.ea.core.web.bridge.sync.storm.RemoteConnector;
import com.ea.core.base.dto.DynamicDTO;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//@RunWith(SpringJUnit4ClassRunner.class)  
//@ContextConfiguration(locations="/applicationContext.xml")
public class StormTest {

	//@Autowired
	private BridgeContext abuttingContext;
	
	//@Test
	public void testConnector() {
		ExampleUsersDTO exampleDto = new ExampleUsersDTO();
		exampleDto.setUserId("woijjfkdfjoiwjer9rifdf");
		exampleDto.setUsername("王小五");
		exampleDto.setPassword("wiejrie");
		Object obj;
		try {
			obj = abuttingContext.connect(BridgeConstant.CONNECTOR_MODE.STORM_LOCAL.getCode(),"exampleSaveFacade", exampleDto);
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
