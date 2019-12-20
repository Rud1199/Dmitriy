package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class main {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("level", "level", "oppo"));
		funcs str = new funcs(arr);
		Iterator<String> iterator = str.iterator();
	String str1 = "oppo";
	String str2="high";
	str.add(str1);
	str.clear();
	str.remove(str2);
	str.contains("look");
	str.toString();
	str.toArray();
	while(iterator.hasNext()) {
		System.out.println("Method Next: " + iterator.next());
	}
	str.size();
	}
}
