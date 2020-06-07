package com.sapient.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDir {
	
	public static void main(String[] args) throws IOException {
		
		Files.list(Paths.get(".")).forEach(System.out::println);
	}

}
