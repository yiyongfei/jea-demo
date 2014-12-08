package com.architecture.example.topology.submit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import backtype.storm.Config;
import backtype.storm.LocalCluster;

import com.ea.core.storm.TopologyDefinition;
import com.ea.core.storm.cluster.StormCluster;
import com.ea.core.storm.main.AbstractLocalSubmitTopology;
import com.ea.core.storm.topology.AbstractDRPCTopology;
import com.ea.core.storm.topology.ITopology;

public class LocalSubmitTopology extends AbstractLocalSubmitTopology {
	public LocalSubmitTopology(){
		super();
		Config conf = new Config();
        conf.setDebug(false);
        conf.setMaxTaskParallelism(3);
        conf.put(Config.TOPOLOGY_MESSAGE_TIMEOUT_SECS, 30);//30秒超时      
        conf.put(Config.TOPOLOGY_MAX_SPOUT_PENDING, 1);
        StormCluster cluster = new StormCluster(new LocalCluster());
        super.init(cluster, conf);
	}

	@Override
	protected Collection<ITopology> findTopologys() {
		// TODO Auto-generated method stub
		List<ITopology> list = new ArrayList<ITopology>();
		Collection<ITopology> topolotys = TopologyDefinition.findAll();
		ITopology tmp = null;
		String topologyName = null;
		for(ITopology topology : topolotys){
			try {
				topologyName = topology.getTopologyName();
				tmp = topology.getClass().newInstance();
				tmp.setTopologyName(topologyName);
				if(tmp instanceof AbstractDRPCTopology){
					((AbstractDRPCTopology)tmp).setLocalDRPC(this.getClient());
				}
				list.add(tmp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
}
