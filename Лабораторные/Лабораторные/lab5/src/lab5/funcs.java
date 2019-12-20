package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;



public class funcs implements Iterable{
	
    private ArrayList<String> str;

    
    public funcs(ArrayList<String> str) {
		this.str = str;
	}
	
	public ArrayList<String> getData() {
		return str;
	}
	
	public void setData(ArrayList<String> str) {
		this.str = str;
	}
    
	public void add(String string) {
		str.add(string);
		System.out.println("Added Word:" + string);
		System.out.println("New Str: "+ str);
	}
	
	public void clear() {
		str.clear();
		System.out.println("Clear: " + str);
	}

	public boolean remove(String string) {
		str.add("noise ");
		str.add("warning");
		str.add(string);
		System.out.println("Str before removing: " + str);
		return str.remove(string);
	}
	 
	public String toString()
	{
		StringBuilder build = new StringBuilder();
		for(String iter1: str)
		{
			build.append(iter1);
		}
		System.out.println("Str without previous word: " + build);
		return build.toString();
	}

	public Object[] toArray() {
		String[] mas = str.toArray(new String[str.size()]);
		System.out.println("Array: " + Arrays.toString(mas));
		return str.toArray();
	}

	public int size() {
		int s = str.size();
		System.out.println("size: " + s);
		return s;
	}

	public Iterator<String> iterator() {
		return new newIterator();
	}
	
	private class newIterator<String> implements Iterator{
		
		int index;
		
		@Override
		public boolean hasNext() {
			if(index < str.size()) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			return str.get(index++);
		}

	}
	
	public boolean contains(String string) {
		newIterator iterator = new newIterator();
		while(iterator.hasNext()) {
			if(iterator.next().toString().equals(string)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean containsAll(funcs container) {
		return this.str.equals(container.str);
	}

}