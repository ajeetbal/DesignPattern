
public class Test {
	public static void main(String[] args) {
		BusinessAccountCreator businessAccountCreator = new BusinessAccountCreator();
		businessAccountCreator.createAccount();

		PrivateAccountCreator privateAccountCreator = new PrivateAccountCreator();
		privateAccountCreator.createAccount();
	}
}
