package com.nc.gson.InsertObjectClouzer;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class DataArrayDeserializer implements JsonDeserializer<DataArray> {

	public DataArray deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		
		JsonObject jsonObject = json.getAsJsonObject();
		
		DataArray dataArray = new DataArray();
		dataArray.setACTION_ARRAY(jsonObject.get("ACTION_ARRAY").getAsString());
		dataArray.setACTIVE_STATUS(jsonObject.get("ACTIVE_STATUS").getAsString());
		dataArray.setCML_ACCEPTED(jsonObject.get("CML_ACCEPTED").getAsString());
		
		/*
		dataArray.setCML_ALLOW_FORWARD(jsonObject.get("CML_ALLOW_FORWARD").getAsString());
		dataArray.setCML_ASSIGNED(jsonObject.get("CML_ASSIGNED").getAsString());
		dataArray.setCML_ASSIGNED_TYPE(jsonObject.get("CML_ASSIGNED_TYPE").getAsString());
		dataArray.setCML_CALENDAR_ID(jsonObject.get("CML_CALENDAR_ID").getAsString());
		dataArray.setCML_CATEGORY(jsonObject.get("CML_CATEGORY").getAsString());
		dataArray.setCML_CONFERENCE_ID(jsonObject.get("CML_CONFERENCE_ID").getAsString());
		dataArray.setCML_DESCRIPTION(jsonObject.get("CML_DESCRIPTION").getAsString());
		dataArray.setCML_FOLDER_ID(jsonObject.get("CML_FOLDER_ID").getAsString());
		dataArray.setCML_FROM_DATETIME(jsonObject.get("CML_FROM_DATETIME").getAsString());
		dataArray.setCML_ID(jsonObject.get("CML_ID").getAsString());
		dataArray.setCML_LOCATION(jsonObject.get("CML_LOCATION").getAsString());
		dataArray.setCML_PRIORITY(jsonObject.get("CML_PRIORITY").getAsString());
		dataArray.setCML_REF_ID(jsonObject.get("CML_REF_ID").getAsString());
		dataArray.setCML_SUB_CATEGORY(jsonObject.get("CML_SUB_CATEGORY").getAsString());
		dataArray.setCML_TITLE(jsonObject.get("CML_TITLE").getAsString());
		dataArray.setCML_TO_DATETIME(jsonObject.get("CML_TO_DATETIME").getAsString());
		dataArray.setCREATED_BY(jsonObject.get("CREATED_BY").getAsString());
		dataArray.setCREATED_ON(jsonObject.get("CREATED_ON").getAsString());
		dataArray.setDEPT_ID(jsonObject.get("DEPT_ID").getAsString());
		dataArray.setINVITATION_DETAILS(jsonObject.get("INVITATION_DETAILS").getAsString());
		dataArray.setKEY_TYPE(jsonObject.get("KEY_TYPE").getAsString());
		dataArray.setKEY_VAL(jsonObject.get("KEY_VAL").getAsString());
		dataArray.setLAST_MODIFIED_BY(jsonObject.get("LAST_MODIFIED_BY").getAsString());
		dataArray.setLAST_MODIFIED_ON(jsonObject.get("LAST_MODIFIED_ON").getAsString());
		dataArray.setNODE_DETAILS_DISPLAY(jsonObject.get("NODE_DETAILS_DISPLAY").getAsString());
		dataArray.setORG_ID(jsonObject.get("ORG_ID").getAsString());
		dataArray.setSUB_KEY_TYPE(jsonObject.get("SUB_KEY_TYPE").getAsString());
		dataArray.setSYNC_PENDING_STATUS(jsonObject.get("SYNC_PENDING_STATUS").getAsString());
		dataArray.setTN(jsonObject.get("TN").getAsString());
		
		*/
		 return dataArray;
		
		
	}

}
