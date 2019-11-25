package org.ntu.mantrov.labs.lab3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.ntu.mantrov.labs.lab3.model.University;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

public class GsonManager {
	
	public static void showToJson(University university) {
		Gson gson = new Gson();
		System.out.println(gson.toJson(university));
	}
	
	public static void saveToJson(University university) {
		try (Writer writer = new FileWriter("university.json")) {
		    Gson gson = new GsonBuilder().create();
		    gson.toJson(university, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void getFromJson() {
		Gson gson = new Gson();
		University university = null;
		try {
			JsonReader reader = new JsonReader(new FileReader("university.json"));
			university = gson.fromJson(reader, University.class); // contains the whole reviews list
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(university);
	}
}
