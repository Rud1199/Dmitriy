package lab8;



public class Guest {
	private String name;
	private String last_name;
	private String middle_name;
	
	public Guest(String last_name, String name, String middle_name)
	{
		this.name=name;
		this.last_name=last_name;
		this.middle_name=middle_name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	
	
	

}
