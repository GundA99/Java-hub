
public class Date {

	private int dd,mm,yy;

	
	public Date() {
		super();
		this.dd = 21;
		this.mm = 05;
		this.yy = 1999;
	}


	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public String toString()
	{
		return "Date : "+dd+" / "+mm+" / "+yy;
	}	
}

