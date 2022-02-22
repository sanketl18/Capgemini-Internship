package java11assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class Q3java11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String stat="A quick brown fox jumps over the lazy dog";
ArrayList<String> list = new ArrayList<>(Arrays.asList(stat.split(" ")));
 for (String string : list) {
	System.out.println(string);
	
}
 String arr1[]=list.stream().toArray(size-> new String[size]);
	System.out.println(Arrays.toString(arr1));
	}

}
