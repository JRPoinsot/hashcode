package com.jrpoinsot.hashcode.services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteLineService {

	private static WriteLineService instance;
	
	
	// attributes here
	//
	//
	//
	
	private WriteLineService () {};
	
	public static WriteLineService getInstance() {
		if (instance == null) {
			instance = new WriteLineService();
		}
		return instance;
	}

	public void writeFile(String filePath) {
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

			StringBuffer content = new StringBuffer();
			
			content.append("This is the content to write into file\n");
			content.append("second line\n");
			content.append("third line\n");
			// content.append("etcc line\n");
			
			bw.write(content.toString());

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
