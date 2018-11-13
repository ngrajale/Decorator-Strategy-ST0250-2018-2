public class offroadStrategy implements Strategy {

	@Override
	public Route planRoute() {
		// plan an offroad route
		Route output = new Route();
		System.out.println("Hey, you just planned an offroad route");
		return output;
	}
}