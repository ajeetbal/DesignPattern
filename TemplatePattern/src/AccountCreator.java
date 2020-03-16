
public class AccountCreator {

	//template Method
	public void createAccount() {
		this.verifyApplicationDetails();
		this.verifyIdentificationDetails();
		this.receivePayment(10);
		this.generateAccountNo();
		this.sendAtmCard();
		this.sendAttmPin();
	}

	public void sendAttmPin() {
		System.out.println("ATM pin send!");

	}

	public void sendAtmCard() {
		System.out.println("ATM card send!");

	}

	public void generateAccountNo() {
		System.out.println("A/c no. generated!");

	}

	public void receivePayment(int i) {
		System.out.println("payment of " + i + "rs. is recieved!");

	}

	public void verifyIdentificationDetails() {
		System.out.println("Identfication detail verified");

	}

	public void verifyApplicationDetails() {
		System.out.println("Application detail verified");

	}
}
