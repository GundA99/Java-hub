package TestObject;


public class Date {

	private int day,month, year;
	
	

	public Date() {
		super();
	}



	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public String toString()
	{
		return day+" / "+month+"/"+year;
	}
	
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Date)
		{
			System.out.println("---Date Class equals Method---");
			Date d = (Date)obj;
			
			if(this.day == d.day && this.month == d.month && this.year == d.year)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
		
	}
	
}
