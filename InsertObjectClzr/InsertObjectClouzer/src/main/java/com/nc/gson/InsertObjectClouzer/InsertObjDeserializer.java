package com.nc.gson.InsertObjectClouzer;

import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class InsertObjDeserializer implements JsonDeserializer<InsertObj>{

	public InsertObj deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		
		JsonObject jsonObject = json.getAsJsonObject();
		
		String action = jsonObject.get("action").getAsString();
		String moduleName = jsonObject.get("moduleName").getAsString();
		String offLineRequest = jsonObject.get("offLineRequest").getAsString();
		

	/*	
	 // Delegate the deserialization to the context
	    DataArray[] dArray = context.deserialize(jsonObject.get("dataArray"), DataArray[].class);
	*/
		
		
		Map<String, String> dArray = new LinkedHashMap<String, String>();
		
		dArray.put("ACTION_ARRAY", "ADD_EVENT");
		dArray.put("ACTIVE_STATUS", "1");
		dArray.put("CML_ACCEPTED", "1");
		dArray.put("CML_ALLOW_FORWARD", "1");
		dArray.put("CML_ASSIGNED", "john.ross@mstorm.com");
		dArray.put("CML_ASSIGNED_TYPE", "FROM");
		dArray.put("CML_CALENDAR_ID", "john.ross@mstorm.com#CAL:WKS:2");
		dArray.put("CML_CATEGORY", "2");
		dArray.put("CML_CONFERENCE_ID", "john.ross@mstorm.com#PRJ:CGR_TSK_EVT_1515401284089_2434");
		dArray.put("CML_DESCRIPTION", "event 1");
		dArray.put("CML_FOLDER_ID", "john.ross@mstorm.com#PRJ:CLD_MSTORM_john.ross@mstorm.com_SEC:FOL_AGENDA_SEC:FOL_EVENT_SEC:FOL_1515401162584_2253");
		dArray.put("CML_FROM_DATETIME", "2018-01-08T09:30:00.000Z");
		dArray.put("CML_ID", "john.ross@mstorm.com#TSK:TSK_EVT#1515401284089_5881");
		dArray.put("CML_LOCATION", "Pune, Maharashtra, India");
		dArray.put("CML_PRIORITY", "1");
		dArray.put("CML_REF_ID", "1");
		dArray.put("CML_SUB_CATEGORY", "john.ross@mstorm.com#WKS:2");
		dArray.put("CML_TITLE", "event 1");
		dArray.put("CML_TO_DATETIME", "2018-01-08T11:00:00.000Z");
		dArray.put("CREATED_BY", "john.ross@mstorm.com");
		dArray.put("CREATED_ON", "2018-01-08T08:48:04.089Z");
		dArray.put("DEPT_ID", "1");
		dArray.put("INVITATION_DETAILS", "john.ross@mstorm.com#TSK:TSK_EVT#1515401284089_5881_IDE:1515401284093_4638");
		dArray.put("KEY_TYPE", "TSK");
		dArray.put("KEY_VAL", "john.ross@mstorm.com#TSK:TSK_EVT#1515401284089_5881");
		dArray.put("LAST_MODIFIED_BY", "john.ross@mstorm.com");
		dArray.put("LAST_MODIFIED_ON", "2018-01-08T08:48:04.089Z");
		dArray.put("NODE_DETAILS_DISPLAY", "");
		dArray.put("ORG_ID", "1");
		dArray.put("SUB_KEY_TYPE", "TSK_EVT");
		dArray.put("SYNC_PENDING_STATUS", "0");
		dArray.put("TN", "CAL_MAIL");
		dArray.put("CML_ACCEPTED", "1");
		dArray.put("CML_ACCEPTED", "1");
		dArray.put("CML_ACCEPTED", "1");
		dArray.put("CML_ACCEPTED", "1");
		
		
		
		
	    final InsertObj insertObj = new InsertObj();
	    insertObj.setAction(action);
	    insertObj.setDataArray(dArray);
	    insertObj.setModuleName(moduleName);
	    insertObj.setOffLineRequest(offLineRequest);
	    return insertObj;
	    
	}

}
