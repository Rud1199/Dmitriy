package lab6;

import lab3.lab3;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Machine", "Car", "Helicopter", "Hello", "Hi"));
		Func str = new Func(arr);
		while(true) {
			System.out.print("1) Add word\n"
							  +
					           "2) Serialize\n" +
					           "3) Deserialize\n" +
							   "4) Sort\n" +
							   "5) Find\n" + 
							   "6) Exit\n");
			Scanner sc = new Scanner(System.in);
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
				case 1:
					System.out.print("put the word: ");
					str.add(sc.nextLine());
					break;
				case 2:
					FileOutputStream fileOutputStream = new FileOutputStream("temp.txt");
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
					objectOutputStream.writeObject(str);
					objectOutputStream.close();
					break;

				case 3:
					FileInputStream fileInputStream = new FileInputStream("temp.txt");
					ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
					str = (Func) objectInputStream.readObject();
					objectInputStream.close();
					break;

				case 4:
					str.sort();
					Iterator iterator = str.iterator();
					while (iterator.hasNext()){
						System.out.print(iterator.next() + " ");
					}
					System.out.println();
					break;

				case 5:
					System.out.print("put word: ");
					System.out.println(str.find(sc.nextLine()));
					break;
				case 6:
					return;
				default:
					break;
				}
		}
	}
}

