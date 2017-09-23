package problem1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin implements Comparator<Employee>, Comparable<Employee> {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		List<Employee> e=new ArrayList<>();
		EmployeeAdmin ea=new EmployeeAdmin();
		for(String s:socSecNums)
		{
			try
			{				
					if(ea.compareTo(table.get(s))>0)
					{
						e.add(table.get(s));
					}
			}
			catch(Exception c){
				
			}
			finally
			{
				
			}

		}
		return e;
		
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		int ssn=o1.getSsn().compareToIgnoreCase(o2.getSsn());
		return ssn;
	}

	@Override
	public int compareTo(Employee o) {
		
		return o.getSalary()-80000;
	}
	
}
