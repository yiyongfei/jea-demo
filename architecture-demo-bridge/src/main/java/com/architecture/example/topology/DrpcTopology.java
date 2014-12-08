package com.architecture.example.topology;

import backtype.storm.topology.TopologyBuilder;

import com.ea.core.achieve.bolt.DefaultDrpcBolt;
import com.ea.core.storm.bolt.AbstractDrpcBolt;
import com.ea.core.storm.topology.AbstractDRPCTopology;

public class DrpcTopology extends AbstractDRPCTopology{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -5127988459599709990L;

	@Override
	protected AbstractDrpcBolt setBolt(TopologyBuilder builder, String upStreamId) {
		// TODO Auto-generated method stub
		DefaultDrpcBolt bolt = new DefaultDrpcBolt();
		bolt.setBoltName("drpcBolt");
		builder.setBolt(bolt.getBoltName(), bolt).noneGrouping(upStreamId);
		return bolt;
	}
}
