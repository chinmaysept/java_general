package com.json.example;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

public class Test {

	public static void main(String[] args) throws IOException {
		//System.out.println(-10%-3);
//		float f[] = new float[5];
//		Object o = f;
//		System.out.println(f[0]);
		//System.out.println(value());
		/*try{
		value();
		System.out.println("1");
		} catch(Exception e) {
			System.out.println("2");
		} finally {
			System.out.println("3");
		}
		System.out.println("4");*/
		FileReader fis = new FileReader(new File("input.txt"));
		Gson gson = new GsonBuilder().create();
		JsonReader reader = gson.newJsonReader(fis);
//		String str = reader.nextString();
		//reader.beginObject();
		
		JsonParser jsonParser = new JsonParser();
		JsonArray results = (JsonArray) jsonParser.parse(reader)
		        .getAsJsonObject().get("result")
		        .getAsJsonObject().getAsJsonArray("people");
		        
		for (JsonElement people : results) {
		    
		    System.out.println(people);
		}
		
	}
	
	static JsonArray bruteForceJsonArray(JsonObject object, String key) {
	    if (object.get(key).isJsonArray()) {
	        return object.get(key).getAsJsonArray();
	    } else {
	        JsonArray oneElementArray = new JsonArray();
	        oneElementArray.add(new JsonObject());
	        return oneElementArray;
	    }
	}
	
	
}
