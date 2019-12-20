package lab3;

import java.util.Scanner;

public class SecondLab {

    public static void main(String[] args) {
	 Scanner in = new Scanner (System.in);
	 System.out.println("Input string: ");
	 String name = in.nextLine();
	 String test = "dimon";
	 System.out.printf("Your String: %s\n", name);
	 in.close();
	 func (name,test);
    }


public static void func (String name,String test)
{
	 StringBuilder res = new StringBuilder(test);
	  if(name.contains(res.reverse()))
      {
    System.out.println("Your reverse word: ");
    System.out.println(res);
      }
}
}