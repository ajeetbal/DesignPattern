
public class BusinessAccountCreator extends AccountCreator {

	@Override
	public void generateAccountNo() {
		System.out.println("BusinessAccount number generated");
	}

	@Override
	public void sendAtmCard() {
		super.sendAtmCard();
		System.out.println("send a small gift");
	}
}
