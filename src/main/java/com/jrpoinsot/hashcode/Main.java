package com.jrpoinsot.hashcode;

import com.jrpoinsot.hashcode.services.ReadLineService;
import com.jrpoinsot.hashcode.services.WriteLineService;

public class Main {

	public static void main(String[] args) {
		
		ReadLineService.getInstance().readFile("src/main/resources/lines.txt");
		
		
		// TODO Algo service
		
		
		WriteLineService.getInstance().writeFile("src/main/resources/results.txt");

	}


}
