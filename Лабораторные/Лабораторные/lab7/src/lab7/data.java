package lab7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class data  {
	public static void main(String[] args)
	{

		Guest off = new Guest("Белянцева", "Татьяна", "Игоревна");
		LocalDate date = LocalDate.of(2019, 11, 13);
		LocalDate date1 = LocalDate.of(2010, 12, 24);
		LocalDate date2 = LocalDate.of(2025, 12, 24);
		LocalDate date3 = LocalDate.of(2019, 11, 11);
		Info guest = new Info(date, date1, date2, date3, off);
		LinkedList<Info> free = new LinkedList<>();
		free.add(guest);
		for(Object o: free)
		{
			Info.Show((Info) o);
			System.out.println();
		}
	}
	

}
