package lab5;

import java.util.Iterator;


public interface Iterable {
	String toString();
	void add(String string);
	void clear();
	boolean remove(String string);
	Object[] toArray();
	int size();
	boolean contains(String string);
	boolean containsAll(funcs container);
	public Iterator<String> iterator();
	

}
