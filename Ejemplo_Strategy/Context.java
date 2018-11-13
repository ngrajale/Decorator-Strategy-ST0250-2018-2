
public class Context {
	private Strategy strategy;
	
	public Context (Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy (int x, int y) {
		return strategy.doOperation(x, y);
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public static void main (String[] args) {
		Strategy add = new Add();
		Strategy subtract = new Subtract();
		Strategy multiply = new Multiply();
		
		Context c = new Context(add);
		System.out.println("5 + 3 = " + String.valueOf(c.executeStrategy(5, 3)));
		
		c.setStrategy(subtract);
		System.out.println("5 - 3 = " + String.valueOf(c.executeStrategy(5, 3)));
		
		c.setStrategy(multiply);
		System.out.println("5 * 3 = " + String.valueOf(c.executeStrategy(5, 3)));
	}
}
