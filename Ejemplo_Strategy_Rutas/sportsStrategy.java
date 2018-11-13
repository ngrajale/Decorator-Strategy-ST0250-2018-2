public class sportsStrategy implements Strategy {

	@Override
	public Route planRoute() {
		// plan the fastest route
		Route output = new Route();
		System.out.println("Hey, you just planned a sporty route");
		return output;
	}
}