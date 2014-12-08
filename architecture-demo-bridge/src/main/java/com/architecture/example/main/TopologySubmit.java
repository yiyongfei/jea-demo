package com.architecture.example.main;

import com.ea.core.storm.StormConstant;
import com.ea.core.storm.TopologyDefinition;
import com.ea.core.storm.main.ISubmitTopology;

public class TopologySubmit {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class<?> className = TopologyDefinition.findSubmitMode(StormConstant.SUBMIT_MODE.REMOTE.getCode());
		((ISubmitTopology)className.newInstance()).submitTopology();
	}

}
