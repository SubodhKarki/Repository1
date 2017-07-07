package WeekendJuly1;

public class Sundae extends IceCream{
	
	double sundaeCost;

	public Sundae(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public double gettotalCost () {
		
		double totalCost = getCost () + sundaeCost;
		return totalCost;

	}

}
