import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Stock implements Observable {
	private List<Observer> observers;

	private String stockName;
	private int stockPrice;

	public Stock() {
		super();
		observers = new ArrayList<Observer>();
	}

	public String getStockName() {
		return stockName;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void updateStockPrice(int newPrice) {
		this.stockPrice = newPrice;
		this.notifyObservers();

	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	@Override
	public void registerObserver(Observer o) {
		if (Objects.nonNull(o)) {
			this.observers.add(o);
		}
	}

	@Override
	public void removeObserver(Observer o) {
		if (Objects.nonNull(o)) {
			this.observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		observers.stream().forEach(obs -> {
			Observer o = obs;
			o.update(this);
		});
	}
}
