package com.architecture.example.web.soap.impl;

import com.architecture.example.dto.ExampleUsersDTO;
import com.architecture.example.po.ExampleUsersPK;
import com.architecture.example.web.rest.impl.ExampleRESTImpl;
import com.architecture.example.web.soap.ExampleSOAP;
import com.ea.core.web.controller.AbstractController;
import com.ea.core.web.controller.WebConstant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller("exampleSOAP")
public class ExampleSOAPImpl extends AbstractController implements ExampleSOAP {

private Logger logger = LoggerFactory.getLogger(ExampleRESTImpl.class);
	
	public String save(ExampleUsersDTO exampleDto){
		ExampleUsersPK pk = null;
		try {
			pk = (ExampleUsersPK) this.dispatch(WebConstant.CALL_BACK.SYNC.getCode(), "exampleSaveFacade", exampleDto);
			return pk.getUserId();
		} catch (Exception e) {
			e.printStackTrace();
		}
        return "";
	}
	
	public void update(ExampleUsersDTO exampleDto) {
		try {
			this.dispatch(WebConstant.CALL_BACK.SYNC.getCode(), "exampleUpdateFacade", exampleDto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void delete(String id) {
		try {
			this.dispatch(WebConstant.CALL_BACK.ASYNC.getCode(), "exampleDeleteFacade", id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Object load(String id) {
		try {
			return this.dispatch(WebConstant.CALL_BACK.SYNC.getCode(), "exampleLoadFacade", id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public Object query(String name) {
		try {
			return this.dispatch(WebConstant.CALL_BACK.SYNC.getCode(), "exampleQueryFacade", name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
