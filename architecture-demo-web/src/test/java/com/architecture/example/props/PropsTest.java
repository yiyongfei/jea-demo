package com.architecture.example.props;

import java.io.IOException;
import java.util.Iterator;

import jodd.props.Props;
import jodd.props.PropsEntries;
import jodd.props.PropsEntry;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

public class PropsTest {

	//@Test
	public void test(){
		ClassPathResource resource = new ClassPathResource("storm.properties");
		try {
			 Props p = new Props();
			 p.load(resource.getInputStream());
			 PropsEntries entries = p.entries();
			 Iterator<PropsEntry> it = entries.section("topoloty.definition").iterator();
			 while(it.hasNext()){
				 PropsEntry entry = it.next();
				 System.out.println(entry.getKey() + "   " + entry.getValue());
			 }
			 System.out.println(p.getValue("drpc.server.host"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
