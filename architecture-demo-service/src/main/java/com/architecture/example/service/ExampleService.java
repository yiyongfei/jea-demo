package com.architecture.example.service;

import java.util.List;

import com.architecture.example.dto.ExampleUsersDTO;
import com.ea.core.base.dto.BaseDTO;
import com.ea.core.base.pk.BasePK;
import com.ea.core.service.IService;

public interface ExampleService extends IService {
	public BasePK save(ExampleUsersDTO dto) throws Exception;
	public void update(ExampleUsersDTO dto) throws Exception;
	public void delete(String userId) throws Exception;
	public BaseDTO load(String userId) throws Exception;
	public List<ExampleUsersDTO> queryByName(String username) throws Exception;
}
