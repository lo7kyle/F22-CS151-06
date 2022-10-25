package design_patterns.strategy;

public class DuckSimulator {
	public static void main(String[] args) {
		Duck duck = new NormalDuck();
		duck.performQuack();
		duck.performFly();
	}
}
