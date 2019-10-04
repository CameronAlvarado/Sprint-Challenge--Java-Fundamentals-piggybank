package piggybank;

import java.util.*;
import java.text.DecimalFormat;

public class Main
{
	// public static ArrayList<Coins> filteredList = new ArrayList<>();

	// public static void printCoins(ArrayList<Coins> coins, CheckCoins tester)
	// {

	// }

	public static void main(String[] args)
	{
		DecimalFormat fp = new DecimalFormat("$###,###.00");

		Quarter quarter = new Quarter();
		Dime dime = new Dime();
		Dollar dollar = new Dollar(5);
		Nickel nickel = new Nickel(3);
		Dime dime2 = new Dime(7);
		Dollar dollar2 = new Dollar();
		Penny penny = new Penny(10);


		ArrayList<Coins> piggyBank = new ArrayList<>();
		piggyBank.add(quarter);
		piggyBank.add(dime);
		piggyBank.add(dollar);
		piggyBank.add(nickel);
		piggyBank.add(dime2);
		piggyBank.add(dollar2);
		piggyBank.add(penny);

		// piggyBank.sort((a1, a2) -> a2.getCount().compareTo(a1.getCount()));
		// piggyBank.forEach((a) -> System.out.println(a.getCount()));

		System.out.println("Using For Loop\n ");
		for (int i = 0; i < piggyBank.size();i++) 
		{ 		      
			System.out.println(piggyBank.get(i)); 		
		}

		double total = 0;
        for (int i = 0; i < piggyBank.size(); i++) {
            total += piggyBank.get(i).getTotal();
        }

        System.out.println();
        System.out.println("The piggy bank holds " + fp.format(total));
	}
}