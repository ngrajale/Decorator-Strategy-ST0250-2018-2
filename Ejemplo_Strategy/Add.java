public class Add implements Strategy {

	@Override
	public int doOperation(int x, int y) {
		return x + y;
	}
}
