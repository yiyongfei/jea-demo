package com.architecture.example.po;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.ea.core.base.po.BasePO;

@Entity
@Table(name="EXAMPLE_USERS")
public class ExampleUsersPO extends BasePO{

    /**
	 * 
	 */
	private static final long serialVersionUID = 3684738975304313951L;
	
	@EmbeddedId
	private ExampleUsersPK pk;
	
	@Transient
	private String userId;//该ID存放主键的值，但只用于与其它对象值的传递，不做持久化
	
    @Column(name="username")
	private String username;
    
    @Column(name="password")
	private String password;
    
    @Column(name="password_salt")
	private String passwordSalt;
    
	public ExampleUsersPK getPk() {
		return pk;
	}
	public void setPk(ExampleUsersPK id) {
		this.pk = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordSalt() {
		return passwordSalt;
	}
	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
	public String getUserId() {
		if(pk != null){
			userId = pk.getUserId();
		}
		return userId;
	}
	public void setUserId(String id) {
		this.userId = id;
		if(pk == null){
			pk = new ExampleUsersPK();
		}
		pk.setUserId(id);
	}
	
	
}


