package lab8;



import java.time.LocalDate;
import java.util.Calendar;

public class data {
	private String dateOfexit;
	private String dateOfenter;
	

	public data()
	{
		
	}




	public String getDateOfexit() {
		return dateOfexit;
	}




	public void setDateOfexit(String dateOfexit) {
		this.dateOfexit = dateOfexit;
	}




	public String getDateOfenter() {
		return dateOfenter;
	}




	public void setDateOfenter(String dateOfenter) {
		this.dateOfenter = dateOfenter;
	}




	public void Show(Guest guest)
	{
		System.out.print(guest.getLast_name() + " ");
		System.out.print(guest.getName()+ " ");
		System.out.print(guest.getMiddle_name()+ " ");
		System.out.println();
		System.out.println("Дата поселения: " + this.dateOfenter);
		System.out.println("Дата выселения: " + this.dateOfexit);
		System.out.println(("Номер: "+ "люкс" ));
		System.out.println(("Индекс: "+ "20" ));
		System.out.println(("Причина поселения: "+ "Коммандировка" ));
	}
}
