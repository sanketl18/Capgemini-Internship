package java11assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Q4java11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
var path= "F:\\training\\Student.txt";

try {int count =0;
	String s = Files.readString(Path.of(path));
	
	List<String> f=s.lines().collect(Collectors.toList());
	for (String string : f) {
		if(string.isBlank())
		{
			
		}
		else {count++;
		System.out.println(count+")"+string);
	}}
	System.out.println("Total no of students:"+count);
} catch (IOException e) {
	e.printStackTrace();
} 

	}

}
