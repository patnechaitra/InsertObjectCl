package com.nc.gson.InsertObjectClouzer;

import java.util.Map;

public class InsertObj {

	private String action;
	private String moduleName;
	private String offLineRequest;
	private Map<String, String> dataArray;
	
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}


	public Map<String, String> getDataArray() {
		return dataArray;
	}

	public void setDataArray(Map<String, String> dataArray) {
		this.dataArray = dataArray;
	}

	
	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getOffLineRequest() {
		return offLineRequest;
	}

	public void setOffLineRequest(String offLineRequest) {
		this.offLineRequest = offLineRequest;
	}

	@Override
	public String toString() {
		return "InsertObj: \n{\t action=" + action + ",\n\t dataArray=" + dataArray
				+ ",\n\t moduleName=" + moduleName + ",\n\t offLineRequest="
				+ offLineRequest + "\n}";
	}

	
	
	
	
	
}
