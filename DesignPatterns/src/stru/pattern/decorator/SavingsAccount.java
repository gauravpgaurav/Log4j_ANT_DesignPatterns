package stru.pattern.decorator;

/**
 * 
 * @author gpant
 *
 *         Concrete Component
 *
 */
public class SavingsAccount extends BankAccount {

	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return 1000.0;
	}

}
