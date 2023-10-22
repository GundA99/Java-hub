package com.tester;
import com.peyroll.*;

public class casting {

	public static void main(String[] args) {
	
		employee e1 = new employee(101,	"emp_name", 5000);
		manager mgr = new manager(111,"mgr_name",50000,"IT",5000);
		Trainer t1 = new Trainer(201,"trainer_name",6520,"java","sep23");
		employee[] iacsd = new employee[5];
				iacsd[0] = e1;
				iacsd[1] = mgr;
				iacsd[2] = t1;
				
				for(employee e:iacsd)
				{
					System.out.println("----------------------------");
					if(e != null) 
					{
					System.out.println(e);
					e.calsalary();
					}
					
					if(e instanceof Trainer)
					{
						Trainer tipu = (Trainer)e;
						tipu.teaching();
						
					}
					else if (e instanceof manager)
					{
						manager m1 = (manager)e;
						m1.managerspfunc();
					}

				
				}
				
				
	
		
		
	}

	
}
