package com.architecture.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ea.core.base.dto.DynamicDTO;
import com.ea.core.base.pk.BasePK;
import com.ea.core.base.po.BasePO;
import com.architecture.example.dao.ExampleDAO;
import com.architecture.example.dto.ExampleUsersDTO;
import com.architecture.example.po.ExampleUsersPK;
import com.architecture.example.po.ExampleUsersPO;
import com.architecture.example.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2651831595084094642L;
	@Autowired
    ExampleDAO exampleDAO;
    
	public BasePK save(ExampleUsersDTO dto) throws Exception {
		// TODO Auto-generated method stub
		DynamicDTO dynamicDTO = new DynamicDTO(dto);
    	ExampleUsersPO exampleUsersPO = new ExampleUsersPO();
    	dynamicDTO.convert(exampleUsersPO);
    	exampleUsersPO.setPk(new ExampleUsersPK());
    	BasePK pk = exampleDAO.save(exampleUsersPO);
    	return pk;
    	
	}
	
	public void update(ExampleUsersDTO dto) throws Exception {
		// TODO Auto-generated method stub
		DynamicDTO dynamicDTO = new DynamicDTO(dto);
    	ExampleUsersPO exampleUsersPO = new ExampleUsersPO();
    	dynamicDTO.convert(exampleUsersPO);
    	exampleDAO.update(exampleUsersPO);
	}
	
	public void delete(String userId) throws Exception {
		// TODO Auto-generated method stub
    	ExampleUsersPO exampleUsersPO = new ExampleUsersPO();
    	exampleUsersPO.setUserId(userId);
    	exampleDAO.delete(exampleUsersPO);
	}
	
	public ExampleUsersDTO load(String userId) throws Exception {
		// TODO Auto-generated method stub
    	ExampleUsersPO exampleUsersPO = new ExampleUsersPO();
    	exampleUsersPO.setUserId(userId);
    	BasePO po = exampleDAO.load(exampleUsersPO);
    	if(po == null){
    		return null;
    	}
    	DynamicDTO dynamicDTO = new DynamicDTO(po);
    	ExampleUsersDTO dto = new ExampleUsersDTO();
    	dynamicDTO.convert(dto);
    	return dto;
	}

	public List<ExampleUsersDTO> queryByName(String username) throws Exception {
		// TODO Auto-generated method stub
		
		List<Object> list = exampleDAO.queryByName(username);
    	if(list == null || list.size() == 0){
    		return null;
    	}
    	List<ExampleUsersDTO> listDTO = new ArrayList<ExampleUsersDTO>();
    	for(Object po : list){
    		DynamicDTO dynamicDTO = new DynamicDTO(po);
        	ExampleUsersDTO dto = new ExampleUsersDTO();
        	dynamicDTO.convert(dto);
        	listDTO.add(dto);
    	}
    	return listDTO;
	}
}
