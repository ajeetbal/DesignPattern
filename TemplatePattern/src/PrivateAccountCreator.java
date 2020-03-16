
public class PrivateAccountCreator extends AccountCreator {

	@Override
	public void generateAccountNo() {
		System.out.println("PrivateAccountCreator number generated");
	}

	@Override
	public void sendAtmCard() {
		super.sendAtmCard();
		System.out.println("send movie  numtickets");

	}
}
