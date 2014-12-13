package com.architecture.example.cache;

import java.util.HashMap;
import java.util.Map;

import com.architecture.example.dto.ExampleUsersDTO;
import com.ea.core.base.dto.DynamicDTO;
import com.ea.core.cache.CacheConstants;
import com.ea.core.cache.CacheContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations="/applicationContext-appserver.xml")
public class CacheTest {

	@Autowired
	private CacheContext cacheContext;
	
	@Test
	public void testCache() {
		ExampleUsersDTO exampleDto = new ExampleUsersDTO();
		exampleDto.setUserId("woijjfkdfjoiwjer9rifdf4444");
		exampleDto.setUsername("王小五");
		exampleDto.setPassword("wiejrie");
		ExampleUsersDTO obj;
		try {
//			cacheContext.clean("dto");
			Boolean result = cacheContext.set(CacheConstants.CACHE_LEVEL.L1.getCode(),"dtoL1", exampleDto, 100000);
			System.out.println(result);
			if(result){
				obj = (ExampleUsersDTO) cacheContext.get("dtoL1");
				System.out.println(obj.getUserId());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
