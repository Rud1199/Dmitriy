package lab2;

public class Help {
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
	
