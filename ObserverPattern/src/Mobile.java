
public class Mobile implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("Mobile-The price of" + stock.getStockName() + " has changed and new price is "
				+ stock.getStockPrice());

	}

}
