
public class Test {

	public static void main(String[] args) {
		OldCustomer oldCustomer = new OldCustomer();
		oldCustomer.setName("ABC");
		oldCustomer.setAge(23);
		oldCustomer.setAddress("Gurgaon,Haryana,India");

		CustomerAdapter adapter = new CustomerAdapter();
		NewCustomer newCustomer = adapter.adaptData(oldCustomer);
		System.out.println("OldCustomer:  " + oldCustomer);
		System.out.println("NewCustomer:  " + newCustomer);
	}

}
