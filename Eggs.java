package WeekendJuly1;

public class Eggs extends RetailItem {

	double number;
	double pricePerDozen = 3;

	public Eggs(String name, double number) {
		super(name);
		this.number = number;

	}

	@Override
	public double getCost() {
		double cost = (number*pricePerDozen)/12;
		return cost;
	}
	

}
