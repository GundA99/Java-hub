package ShowroomManagment;
import ShowroomManagment.InvalidInputException;
import java.time.LocalDate;
import java.util.List;

import ShowroomManagment.Vehicle;

public class ShowroomValidations {
	
	public static Color parseAndValidateColor(String str)throws InvalidInputException
	{
		return Color.valueOf(str.toUpperCase());
	}
	
	public static LocalDate parseAndValidateDate(String str) throws InvalidInputException
	{
		LocalDate menudate =  LocalDate.parse(str);
		LocalDate checkDate = LocalDate.of(2022, 1, 1);
		if(menudate.isBefore(checkDate))
		{
			throw new InvalidInputException("Manu date must be after 1st Jan 2022");
		}
		return menudate;
	}
	
	public static Vehicle findByChasisNo(String str, List<Vehicle> list) throws InvalidInputException
	{
		Vehicle v = new Vehicle(str);
		int index = list.indexOf(v);
		System.out.println("index= "+index);
		if(index == -1 )
		{
			throw new InvalidInputException("Invalid ch no , Vehicle not found !!!!");
		}
		else
		return list.get(index);
	}
	
	
	public static Vehicle validateAllInputs(String chasisNo, String vehicleColor, double price, String manufactureDate,
		String company) throws InvalidInputException
			{
		Color c =  parseAndValidateColor(vehicleColor);
		LocalDate d = parseAndValidateDate(manufactureDate);
		return new Vehicle(chasisNo, c, price, d, company);
		
			}
	
	
	
	
}

//String chasisNo, Color vehicleColor, double price, LocalDate manufactureDate, String company,
//boolean isAvailable