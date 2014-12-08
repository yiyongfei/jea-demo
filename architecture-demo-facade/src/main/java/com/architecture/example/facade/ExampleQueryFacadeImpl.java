package com.architecture.example.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.architecture.example.service.ExampleService;
import com.ea.core.facade.AbstractFacade;

@Component("exampleQueryFacade")
public class ExampleQueryFacadeImpl extends AbstractFacade {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4668418387943348477L;
	@Autowired
    ExampleService exampleService;
	
	@Override
	protected Object perform(Object... obj) throws Exception {
		return exampleService.queryByName((String)obj[0]);
	}

}
