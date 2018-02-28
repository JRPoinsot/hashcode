package com.jrpoinsot.hashcode.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jrpoinsot.hashcode.models.Person;

public class WriteObjectService {

	private static WriteObjectService instance;
	
	
	// attributes here
	//
	//
	//
	
	private WriteObjectService () {};
	
	public static WriteObjectService getInstance() {
		if (instance == null) {
			instance = new WriteObjectService();
		}
		return instance;
	}

	public void writePersonFile(String filePath) {
		
		Person p1 = new Person("John", 30, "Male");
		Person p2 = new Person("Rachel", 25, "Female");

		try {
			FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(p1);
			o.writeObject(p2);

			o.close();
			f.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		}
		
	}
	
}
