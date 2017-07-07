package WeekendJuly1;

public  abstract class RetailItem {

	protected String name;

	// Initializes retail item data
	public RetailItem(String name) {

		this.name = name;
	}

	// Returns name of Retail Item
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Returns cost of RetailItem
	public abstract double getCost();
}
