package lab6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;



public class Func implements  Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<String> str;

    
    public Func(ArrayList<String> str) {
		this.str = str;
	}
	
	public ArrayList<String> getData() {
		return str;
	}
	
	public void setData(ArrayList<String> str) {
		this.str = str;
	}
	
	public void add(String string) {
		this.str.add(string);
		System.out.println("added word:" + string);
		System.out.println("new array: "+ str);
	}
	
	public void clear() {
		str.clear();
		System.out.println("method clear: " + str);
	}

	public boolean remove(String string) {
		this.str.add(string);
		System.out.println("array before removing: " + str);
		return str.remove(string);
	}
	 
	public String toString()
	{
		StringBuilder build = new StringBuilder();
		for(String iter1: this.str)
		{
			build.append(iter1);
		}
		System.out.println("string without previous word: " + build);
		return build.toString();
	}

	public Object[] toArray() {
		String[] mas = str.toArray(new String[str.size()]);
		System.out.println("mass: " + Arrays.toString(mas));
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
	
	public boolean containsAll(Func container) {
		return this.str.equals(container.str);
	}
	public void sort(){
		Collections.sort(str, String.CASE_INSENSITIVE_ORDER);
	}

	public int find(String str1){
		int index = 0;
		Iterator iterator = iterator();
		while (iterator.hasNext()){
			index++;
			if (iterator.next().equals(str1)){
				return index;
			}
		}
		return -1;
	}
}

