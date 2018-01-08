package com.nc.gson.InsertObjectClouzer;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainInsertObject {

	public static void main(final String[] args) throws IOException {
	    // Configure GSON
	    final GsonBuilder gsonBuilder = new GsonBuilder();
	    gsonBuilder.registerTypeAdapter(InsertObj.class, new InsertObjDeserializer());
	  //  gsonBuilder.registerTypeAdapter(DataArray.class, new DataArrayDeserializer());
	    gsonBuilder.serializeNulls();
	    final Gson gson = gsonBuilder.create();
	    
	 
	    // Read the JSON data
	    try (Reader reader = new InputStreamReader(MainInsertObject.class.getResourceAsStream("/InsertObjectStructure.json"), "UTF-8")) {

	      // Parse JSON to Java
	      final InsertObj insertObject = gson.fromJson(reader, InsertObj.class);
	      System.out.println(insertObject);
	    }
	}
}
