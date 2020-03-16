import java.util.Random;

public class Route1 implements Route {

	@Override
	public void getDirection() {
		System.out.println("Turn Left 200 meters.");
	}

	@Override
	public int getTotalDistance() {
		return 20;
	}

	@Override
	public Enum<Traffic> getTraffic() {
		Random random = new Random();
		if (random.nextBoolean() == true) {
			System.out.println("High Traffic on Route1");
			return Traffic.HIGH_TRAFFIC;
		}
		System.out.println("Low Traffic on Route1");
		return Traffic.LOW_TRAFFIC;
	}

}
