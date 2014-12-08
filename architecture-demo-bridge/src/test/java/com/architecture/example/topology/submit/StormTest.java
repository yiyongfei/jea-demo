package com.architecture.example.topology.submit;

import org.junit.Test;

public class StormTest {

	//@Test
	public void test(){
		LocalSubmitTopology local = new LocalSubmitTopology();
		try { 
			local.submitTopology();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
