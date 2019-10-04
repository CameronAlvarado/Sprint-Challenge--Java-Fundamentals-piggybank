package piggybank;

import java.util.*;

public class Main
{
	// public static ArrayList<Coins> filteredList = new ArrayList<>();

	// public static void printCoins(ArrayList<Coins> coins, CheckCoins tester)
	// {

	// }

	public static void main(String[] args)
	{
		Quarter quarter = new Quarter();
		Dime dime = new Dime();
		// Dollar dollar2 = new Dollar(5);
		// Nickel nickel = new Nickel(3);
		// Dime dime2 = new Dime(7);
		Dollar dollar3 = new Dollar();
		// Penny penny = new Penny(10);


		ArrayList<Coins> piggyBank = new ArrayList<>();
		piggyBank.add(quarter);
		piggyBank.add(dime);
		// piggyBank.add(dollar2);
		// piggyBank.add(nickel);
		// piggyBank.add(dime2);
		piggyBank.add(dollar3);
		// piggyBank.add(penny);

		piggyBank.sort((a1, a2) -> a2.getCount().compareTo(a1.getCount()));
		piggyBank.forEach((a) -> System.out.println(a.getCount()));
	}
}