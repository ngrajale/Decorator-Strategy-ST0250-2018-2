public class ecoStrategy implements Strategy {

	@Override
	public Route planRoute() {
		// plan the shortest, most efficient route
		Route output = new Route();
		System.out.println("Hey, you just planned an economic route");
		return output;
	}
}