package com.architecture.example.integration;

import java.util.Date;
import java.util.Set;

import org.junit.Test;

import com.ea.core.base.dto.DynamicDTO;
import com.ea.core.base.model.BaseModel;


public class IntegrationTest {
	
	//01c577cf7f95415dad6748fe9ba194e9
	@Test
	public void testRest(){
		ExampleIntegration example = new ExampleIntegration();
		DynamicDTO dto = new DynamicDTO();
    	dto.setValue("username", "李老四");
    	dto.setValue("password", "eaie");
    	//dto.setValue("userId", "01c577cf7f95415dad6748fe9ba194e9");
		try {
//			Object obj = example.queryByRest("李老四");
			Object obj = example.saveByRest(dto);
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Test
	public void testSoap(){ 
		ExampleIntegration example = new ExampleIntegration();
		DynamicDTO dto = new DynamicDTO();
    	dto.setValue("username", "李老三");
    	dto.setValue("password", "wowowo");
		try {
//			Object[] obj = (Object[]) example.getBySoap("817080c5b5354cd380efa45fe245b82a");
//			if(obj[0] != null){
//				dto = new DynamicDTO(obj[0]);
//				Set<String> keys = dto.properties();
//				for(String key : keys){
//					System.out.println(key + ":" + dto.getValue(key));
//				}
//			}
			
			example.deleteBySoap("ca89d0e195e84daabbab0d2bdba2e928");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
