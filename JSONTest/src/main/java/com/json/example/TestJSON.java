package com.json.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
//import javax.json.JsonReader;

public class TestJSON {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ParseException {
		

		InputStream fis = new FileInputStream("input.txt");
//		Gson gson = new Gson();
		
		Gson gson = new GsonBuilder().create();
//		gson.
//		JsonElement
		
//		GsonReader gsonReader = 
		/*JsonReader jsonReader = (JsonReader) Json.createReader(fis);
		JsonObject jsonObject = jsonReader.readObject();
		jsonReader.close();
		fis.close();
		
		JsonObject json1 = jsonObject.getJsonObject("result");
		JsonNumber jsonPeople = json1.getJsonNumber("nPeople");
		JsonArray jsonArr = json1.getJsonArray("people");
		JsonObject sr = jsonArr.getJsonObject(0);
		JsonString str = sr.getJsonString("namePeople");
		System.out.println(str.getString());
		
		int index = 0;
		String[] valuesArr = new String[jsonArr.size()];
		for(JsonValue value: jsonArr) {
			System.out.println("Values are..."+value.toString());
			valuesArr[++index] = value.toString();
			
		}*/
	
	}
}
