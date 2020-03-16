
public class CustomerAdapter extends NewCustomer implements Customer {

	@Override
	public NewCustomer adaptData(OldCustomer oldCustomer) {
		this.setName(oldCustomer.getName());
		this.setAge(oldCustomer.getAge());
		Address address=new Address();
		address.setCity(oldCustomer.getAddress().split(",")[0]);
		address.setState(oldCustomer.getAddress().split(",")[1]);
		address.setCountry(oldCustomer.getAddress().split(",")[2]);
		this.setAddress(address);
		return this;
	}

}
