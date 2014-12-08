package com.architecture.example.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.architecture.example.dto.ExampleUsersDTO;
import com.architecture.example.service.ExampleService;
import com.ea.core.facade.AbstractTransactionalFacade;

@Component("exampleUpdateFacade")
public class ExampleUpdateFacadeImpl extends AbstractTransactionalFacade {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4676461076217515521L;
	@Autowired
    ExampleService exampleService;
	
	@Override
	protected Object perform(Object... obj) throws Exception {
		// TODO Auto-generated method stub
		exampleService.update((ExampleUsersDTO)obj[0]);
		return null;
	}

}
