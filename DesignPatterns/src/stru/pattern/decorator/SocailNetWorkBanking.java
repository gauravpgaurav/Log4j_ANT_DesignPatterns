package stru.pattern.decorator;

public class SocailNetWorkBanking extends OnlineBanking {

	private BankAccount account;

	public SocailNetWorkBanking(BankAccount account) {
		super(account);
		this.account = account;
	}

	@Override
	public double balanceToMaintain() {
		return account.balanceToMaintain() + 10000.0;
	}
}
