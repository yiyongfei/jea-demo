package com.architecture.example.topology.submit;

import java.util.Collection;

import backtype.storm.Config;
import backtype.storm.StormSubmitter;

import com.ea.core.storm.TopologyDefinition;
import com.ea.core.storm.cluster.StormCluster;
import com.ea.core.storm.main.AbstractSubmitTopology;
import com.ea.core.storm.topology.ITopology;

public class RemoteSubmitTopology extends AbstractSubmitTopology {
	
	public RemoteSubmitTopology(){
		super();
		Config conf = new Config();
        conf.setDebug(false);
        conf.setMaxTaskParallelism(3);
        conf.put(Config.TOPOLOGY_MESSAGE_TIMEOUT_SECS, 30);//30秒超时      
        conf.put(Config.TOPOLOGY_MAX_SPOUT_PENDING, 1);
        StormCluster cluster = new StormCluster(new StormSubmitter());
        super.init(cluster, conf);
	}

	@Override
	protected Collection<ITopology> findTopologys() {
		// TODO Auto-generated method stub
		return TopologyDefinition.findAll();
	}

	public static void main(String[] args){
		RemoteSubmitTopology submit = new RemoteSubmitTopology();
		try {
			submit.submitTopology();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
