
public class Navigation {

	private Route route;

	public Navigation() {
		route = this.getBestRoute();
	}

	private Route getBestRoute() {
		Route route1 = new Route1();
		Route route2 = new Route2();

		if (route1.getTraffic() == Traffic.LOW_TRAFFIC && route2.getTraffic() == Traffic.HIGH_TRAFFIC) {
			System.out.println("Selecting low traffic route - Route1");
			return route1;
		}
		System.out.println("Selecting low traffic route - Route2");
		return route2;
	}

	public void navigate() {
		route.getDirection();
	}
}
