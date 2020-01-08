package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparableTest 
{
	public static void main(String agrs[])
	{
		ArrayList<Employee> al= new ArrayList();
		Employee e1= new Employee(10, "vipin", 23);
		Employee e2= new Employee(9, "vipin", 25);
		Employee e3= new Employee(15, "vipin", 21);
		al.add(e1);
		al.add(e2);
		al.add(e3);
		Collections.sort(al);
		Iterator<Employee> itr=al.iterator();
		while(itr.hasNext())
		{
			Employee emp= (Employee)itr.next();
			System.out.println(emp.empId +" "+emp.name+" "+emp.empAge);
		}
	
	
	}

}
