package com.gj.multilevel;

public class Service implements IService {

	Config config;
	
	
	@Override
	public String send(String something) {
		
		return "test" +config.getSubConfig().getUrl();
	}


	public Config getConfig() {
		return config;
	}


	public void setConfig(Config config) {
		this.config = config;
	}
	
	

}
