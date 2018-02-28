package com.jrpoinsot.hashcode.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.jrpoinsot.hashcode.models.Person;

public class ReadObjectService {

	private static ReadObjectService instance;
	
	
	// attributes here
	//
	//
	//
	List<Person> listPerson = new ArrayList<>();
	
	private ReadObjectService () {};
	
	public static ReadObjectService getInstance() {
		if (instance == null) {
			instance = new ReadObjectService();
		}
		return instance;
	}
	

	// Service Public Methods here
	
	
	public void readPersonFile(String filePath) {
		
		try {
			FileInputStream fi = new FileInputStream(new File("myPerson.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);
		
			// Read objects
			Person pr1 = (Person) oi.readObject();
			Person pr2 = (Person) oi.readObject();
		
			System.out.println(pr1.toString());
			System.out.println(pr2.toString());
		
			oi.close();
			fi.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
