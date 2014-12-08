package com.architecture.example.integration;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.HttpMethod;

import com.ea.core.integration.IntegrationConstant;
import com.ea.core.integration.IntegrationContext;


public class ExampleIntegration {
	public void saveByMQ(Object obj) throws Exception{
		IntegrationContext context = new IntegrationContext();
		Map<String, String> conf = new HashMap<String, String>();
		conf.put(IntegrationConstant.CONF.HOST.getCode(), "tcp://127.0.0.1:61616");
		conf.put(IntegrationConstant.CONF.USERNAME.getCode(), "admin");
		conf.put(IntegrationConstant.CONF.PASSWORD.getCode(), "admin");
		context.connect(IntegrationConstant.CONNECTOR_MODE.MQ.getCode(), conf, "exampleQuaue", "exampleSaveFacade", obj);
	}
	
	public Object saveByRest(Object obj) throws Exception{
		IntegrationContext context = new IntegrationContext();
		Map<String, String> conf = new HashMap<String, String>();
		conf.put(IntegrationConstant.CONF.HOST.getCode(), "http://127.0.0.1:8080/architecture-demo-web/ws/HelloREST");
		conf.put(IntegrationConstant.CONF.HTTP_METHOD.getCode(), HttpMethod.POST);
		return context.connect(IntegrationConstant.CONNECTOR_MODE.REST.getCode(), conf, "save", null, obj);
	}
	
	public void updateByRest(Object obj) throws Exception{
		IntegrationContext context = new IntegrationContext();
		Map<String, String> conf = new HashMap<String, String>();
		conf.put(IntegrationConstant.CONF.HOST.getCode(), "http://127.0.0.1:8080/architecture-demo-web/ws/HelloREST");
		conf.put(IntegrationConstant.CONF.HTTP_METHOD.getCode(), HttpMethod.PUT);
		context.connect(IntegrationConstant.CONNECTOR_MODE.REST.getCode(), conf, "update", null, obj);
	}
	
	public void deleteByRest(Object obj) throws Exception{
		IntegrationContext context = new IntegrationContext();
		Map<String, String> conf = new HashMap<String, String>();
		conf.put(IntegrationConstant.CONF.HOST.getCode(), "http://127.0.0.1:8080/architecture-demo-web/ws/HelloREST");
		conf.put(IntegrationConstant.CONF.HTTP_METHOD.getCode(), HttpMethod.DELETE);
		context.connect(IntegrationConstant.CONNECTOR_MODE.REST.getCode(), conf, "delete", null, obj);
	}
	
	public Object getByRest(Object obj) throws Exception{
		IntegrationContext context = new IntegrationContext();
		Map<String, String> conf = new HashMap<String, String>();
		conf.put(IntegrationConstant.CONF.HOST.getCode(), "http://127.0.0.1:8080/architecture-demo-web/ws/HelloREST");
		conf.put(IntegrationConstant.CONF.HTTP_METHOD.getCode(), HttpMethod.GET);
		Object dto = context.connect(IntegrationConstant.CONNECTOR_MODE.REST.getCode(), conf, "load", null, obj);
		return dto;
	}
	
	public Object queryByRest(Object obj) throws Exception{
		IntegrationContext context = new IntegrationContext();
		Map<String, String> conf = new HashMap<String, String>();
		conf.put(IntegrationConstant.CONF.HOST.getCode(), "http://127.0.0.1:8080/architecture-demo-web/ws/HelloREST");
		conf.put(IntegrationConstant.CONF.HTTP_METHOD.getCode(), HttpMethod.GET);
		Object dto = context.connect(IntegrationConstant.CONNECTOR_MODE.REST.getCode(), conf, "query", null, obj);
		return dto;
	}
	
	public Object saveBySoap(Object obj) throws Exception{
		IntegrationContext context = new IntegrationContext();
		Map<String, String> conf = new HashMap<String, String>();
		conf.put(IntegrationConstant.CONF.HOST.getCode(), "http://127.0.0.1:8080/architecture-demo-web/ws/HelloSOAP?wsdl");
		return context.connect(IntegrationConstant.CONNECTOR_MODE.SOAP.getCode(), conf, "save", null, obj);
	}
	
	public void updateBySoap(Object obj) throws Exception{
		IntegrationContext context = new IntegrationContext();
		Map<String, String> conf = new HashMap<String, String>();
		conf.put(IntegrationConstant.CONF.HOST.getCode(), "http://127.0.0.1:8080/architecture-demo-web/ws/HelloSOAP?wsdl");
		context.connect(IntegrationConstant.CONNECTOR_MODE.SOAP.getCode(), conf, "update", null, obj);
	}
	
	public void deleteBySoap(Object obj) throws Exception{
		IntegrationContext context = new IntegrationContext();
		Map<String, String> conf = new HashMap<String, String>();
		conf.put(IntegrationConstant.CONF.HOST.getCode(), "http://127.0.0.1:8080/architecture-demo-web/ws/HelloSOAP?wsdl");
		context.connect(IntegrationConstant.CONNECTOR_MODE.SOAP.getCode(), conf, "delete", null, obj);
	}
	
	public Object getBySoap(Object obj) throws Exception{
		IntegrationContext context = new IntegrationContext();
		Map<String, String> conf = new HashMap<String, String>();
		conf.put(IntegrationConstant.CONF.HOST.getCode(), "http://127.0.0.1:8080/architecture-demo-web/ws/HelloSOAP?wsdl");
		Object dto = context.connect(IntegrationConstant.CONNECTOR_MODE.SOAP.getCode(), conf, "load", null, obj);
		return dto;
	}
	
	public Object queryBySoap(Object obj) throws Exception{
		IntegrationContext context = new IntegrationContext();
		Map<String, String> conf = new HashMap<String, String>();
		conf.put(IntegrationConstant.CONF.HOST.getCode(), "http://127.0.0.1:8080/architecture-demo-web/ws/HelloSOAP?wsdl");
		Object dto = context.connect(IntegrationConstant.CONNECTOR_MODE.SOAP.getCode(), conf, "query", null, obj);
		return dto;
	}
}
