
public class Test {

	public static void main(String[] args) {
		//create stock
		IBMStock ibmStock=new IBMStock();
		MicrosoftStock microsoftStock=new MicrosoftStock();
	
		//create Observer
		Mobile mobile=new Mobile();
		DisplayBoard board=new DisplayBoard();
		
		//register observer for stocks
		ibmStock.registerObserver(mobile);
		ibmStock.registerObserver(board);

		microsoftStock.registerObserver(mobile);
		microsoftStock.registerObserver(board);
		
		ibmStock.updateStockPrice(12);

	}

}
