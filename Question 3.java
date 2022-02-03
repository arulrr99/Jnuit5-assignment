//bankAccount class to withdraw amount

package testing;
public class BankAccount {
	
	public void withdraw(double amount,double balance) {
		try {
			if(amount>balance) {
				throw new InsufficientFundsException("Insufficient fund in acccount");
			}
			else {
				balance-=amount;
				System.out.println("Withdraw successfull");
			}
		}
		catch(InsufficientFundsException e) {
			System.out.println(e);
		}	
	}
}


//Custom exception class InsufficientFundsException 

package testing;

public class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String s) {
		super(s);
	}

}

//BankAccountTest class to test BankAccount class
package testing;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		BankAccount ba=new BankAccount();
		assertThrows(InsufficientFundsException.class,()->ba.withdraw(6000.0, 5000.0));
		assertThrows(InsufficientFundsException.class,()->ba.withdraw(3000.0, 2000.0));
		assertThrows(InsufficientFundsException.class,()->ba.withdraw(4000.0, 1000.0));
	}

}

