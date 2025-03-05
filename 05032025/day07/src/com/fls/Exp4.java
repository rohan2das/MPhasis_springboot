package com.fls;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Exp4 {
	
	public static void main(String[] args) {
		List<String> data = null;
		try(Stream<String> strm = Files.lines(Paths.get("src/chartest.txt")))
		{
			//strm.forEach(System.out::println);
			
			data = strm.filter(str -> str.startsWith("T"))
					.map(String :: toUpperCase).toList();
			
			System.out.println(data);
			
			Set<PosixFilePermission> perm = new HashSet<>();
			
			perm.add(PosixFilePermission.OWNER_WRITE);
			perm.add(PosixFilePermission.OWNER_READ);
			perm.add(PosixFilePermission.GROUP_READ);
			perm.add(PosixFilePermission.GROUP_WRITE);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
