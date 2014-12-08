package com.architecture.example.po;

import javax.persistence.Column;

import com.ea.core.base.pk.BasePK;
import com.ea.core.orm.pk.generator.UUIDPKGenerator;

public class ExampleUsersPK extends BasePK{

	/**
	 * 
	 */
	private static final long serialVersionUID = -335994902461772346L;
	
    @Column(name="id")
	private String userId;
	
	public ExampleUsersPK(){
		super(new UUIDPKGenerator());
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public void generatorPK() {
		this.setUserId(getPkGenerator().generator().toString());
	}

	@Override
	public void generatorCacheKey() {
		// TODO Auto-generated method stub
		
	}	
}
