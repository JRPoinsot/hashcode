package com.jrpoinsot.hashcode.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadLineService {

	private static ReadLineService instance;
	
	
	// attributes here
	//
	//
	//
	List<String> listLine3 = new ArrayList<>();
	
	private ReadLineService () {};
	
	public static ReadLineService getInstance() {
		if (instance == null) {
			instance = new ReadLineService();
		}
		return instance;
	}
	

	// Service Public Methods here
	
	
	public void readFile(String filePath) {
		
	
		try (Stream<String> stream = Files.lines(Paths.get(filePath))) {

			//1. filter line 3
			//2. convert all content to upper case
			//3. convert it into a List
			this.listLine3 = stream
					.filter(line -> !line.startsWith("line3"))
					.map(String::toUpperCase)
					.collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}

		this.listLine3.forEach(System.out::println);
	}
}
