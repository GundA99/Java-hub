package Showroom_managment_System;

import java.text.SimpleDateFormat;
import java.util.Date;

public class vehicle {

	private String chasisNO;
	private Color Vehiclecolor;
	private double Price;
	private Date manufacturDate;
	public static SimpleDateFormat sdf;
	private String company;
	private boolean isAvailable = true;
	
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}


	public vehicle(String chasisNO, Color vehiclecolor, double price, Date manufacturDate, String company) {
		super();
		this.chasisNO = chasisNO;
		Vehiclecolor = vehiclecolor;
		Price = price;
		this.manufacturDate = manufacturDate;
		this.company = company;
	}

	@Override
	public boolean equals(Object obj) {
		System.err.println("in vehicle eq");
		if (obj instanceof vehicle) {
			vehicle v = (vehicle)obj;
			return this.chasisNO.equals(v.chasisNO);
		} 
			return false;
	}

	@Override
	public String toString() {
		return "vehicle [chasisNO=" + chasisNO + ", Vehiclecolor=" + Vehiclecolor + ", Price=" + Price
				+ ", manufacturDate=" + sdf.format(manufacturDate) + ", company=" + company + ", isAvailable=" + isAvailable + "]";
	}

}
