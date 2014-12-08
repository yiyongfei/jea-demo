package com.architecture.example.topology;

import backtype.storm.topology.IRichSpout;
import backtype.storm.topology.TopologyBuilder;

import com.ea.core.achieve.bolt.MQBolt;
import com.ea.core.achieve.spout.MQSpout;
import com.ea.core.storm.bolt.AbstractRichBolt;
import com.ea.core.storm.topology.AbstractTopology;

public class MQTopology extends AbstractTopology{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 6698261212331620208L;

	@Override
	protected AbstractRichBolt setBolt(TopologyBuilder builder, String upStreamId) {
		// TODO Auto-generated method stub
		MQBolt bolt = new MQBolt();
		bolt.setBoltName("mqBolt");
		builder.setBolt(bolt.getBoltName(), bolt).noneGrouping(upStreamId);
		return bolt;
	}

	@Override
	protected IRichSpout initSpout() {
		// TODO Auto-generated method stub
		return new MQSpout();
	}
}
