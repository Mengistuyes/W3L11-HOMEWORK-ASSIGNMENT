package problem2;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
		Double sum=0.0;
		List<Account> LOfaccounts;
		for(Employee e: emps)
		{
			LOfaccounts=e.getAccounts();
			for(Account a:LOfaccounts)
			{
				sum+=a.getBalance();
			}
		}
		return sum;
	}
}
