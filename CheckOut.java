package WeekendJuly1;

import java.util.Scanner;

public class CheckOut {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);

		String userDecision = "";
		while (!userDecision.equals("no")) {

			System.out.println("Please enter the Item Type that you want to buy:");
			String itemType = input.next();

			if (itemType.equalsIgnoreCase("potato")) {
				System.out.println("Enter the Weight of the item:");
				double weight = input.nextDouble();

				Potato potato = new Potato(itemType, weight);

				System.out.println("The cost for " + weight + " lb " + itemType + " is: $" + potato.getCost());
			}

			else if (itemType.equalsIgnoreCase("eggs")) {

				System.out.println("Enter the number of eggs:");
				double number = input.nextDouble();

				Eggs egg = new Eggs(itemType, number);

				System.out.println("The cost for " + number + " eggs is: $" + egg.getCost());
			}

			else if (itemType.equalsIgnoreCase("icecream")) {

				IceCream iceCream = new IceCream(itemType);
				System.out.println("The cost of the icecream is: " + iceCream.getCost());
			}

			else if (itemType.equalsIgnoreCase("sundae")) {

				Sundae sundae = new Sundae(itemType);
				System.out.println("The cost of sundae is: " + sundae.gettotalCost());
			}

			System.out.println("Do you want to continue? Yes/No");
			userDecision = input.next();
		}
		System.out.println("You are out of the loop!!!!!");
	}

}
