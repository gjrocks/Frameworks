package com.gj.multilevel;

public class Config {

	SubConfig subConfig;

	public Config() {
		super();
		
	}

	public Config(SubConfig subConfig) {
		super();
		this.subConfig = subConfig;
	}

	public SubConfig getSubConfig() {
		return subConfig;
	}

	public void setSubConfig(SubConfig subConfig) {
		this.subConfig = subConfig;
	}
	
}
