
public class DisplayBoard implements Observer {

	@Override
	public void update(Stock stock) {
		System.out.println("DisplayBoard-The price of" + stock.getStockName() + " has changed and new price is "
				+ stock.getStockPrice());
	}

}
