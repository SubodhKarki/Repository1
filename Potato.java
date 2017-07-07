package WeekendJuly1;

public class Potato extends RetailItem {
	
	double weight;
	double priceperpound = 1;
	double cost;

	public Potato(String name, double weight) {
		super(name);
		this.weight = weight;
		
		
	}
	
	@Override
	public double getCost () {
		cost = weight*priceperpound;
		return cost;
	}

}
