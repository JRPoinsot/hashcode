package com.jrpoinsot.hashcode.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.jrpoinsot.hashcode.services.TestService;

public class Main {

	public static void main(String[] args) {
		
		TestService.getInstance().setAttribute(78);
		String fileName = "c://lines.txt";

		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
