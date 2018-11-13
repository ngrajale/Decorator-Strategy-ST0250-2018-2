
public class Context {
	Strategy strategy;
	Mode mode;
	
	public Context (Strategy strategy, Mode mode) {
		this.strategy = strategy;
		this.mode = mode;
	}
	
	public void changeSetting(Strategy strategy, Mode mode) {
		this.strategy = strategy;
		this.mode = mode;
	}
	
	public void planRoute() {
		this.strategy.planRoute();
	}
	
	public static void main(String[] args) {
		Mode economicMode = new Mode("Eco");
		Mode sportsMode = new Mode("Sports");
		Mode offroadMode = new Mode("Offroad");
		
		Strategy ecoStrategy = new ecoStrategy();
		Strategy sportsStrategy = new sportsStrategy();
		Strategy offroadStrategy = new offroadStrategy();
		
		Context context = new Context(ecoStrategy, economicMode);
		
		context.planRoute();
		
		context.changeSetting(sportsStrategy, sportsMode);
		context.planRoute();
		
		context.changeSetting(offroadStrategy, offroadMode);
		context.planRoute();
	}

}
