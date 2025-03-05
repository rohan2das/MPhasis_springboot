package com.fls;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Exp1 {
	
	public static void main(String[] args) {
		
		Path path = Paths.get("src/bytetest.txt");
		
		//File file = new File("src/bytetest.txt");
		
		try
		{
			String lines = "";
			Files.writeString(path, lines, StandardOpenOption.CREATE);
			
			List<String> obj = new ArrayList<>();
			
			Files.write(path, obj);
			
			byte[] bs = Files.readAllBytes(path);
			
			List<String> linesData = Files.readAllLines(path);
			
			System.out.println("Reading byte data : "+new String(bs));
			System.out.println("Reading list of lines : "+linesData);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
