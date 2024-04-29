import java.util.Scanner;

public class pizzaParty {

	public static void main(String[] args) {
		
	 Scanner scnr = new Scanner(System.in);
	 
	 int numPeople;
	 int numPizzas;
	 double cost;
	 
	 System.out.print(">Enter the number of people attending the party:\n");
	 numPeople = scnr.nextInt();
	 
	 numPizzas = (int) Math.ceil((numPeople * 2.0) / 12);
	 cost = numPizzas * 14.95;
	 
	 System.out.printf("People atttending: %d\n", numPeople);	 	 
	 System.out.printf("Pizza(s)needed: %d\n", numPizzas);	 
	 System.out.printf("Cost for %d pizza(s): $%.2f\n", numPizzas, cost); 
	 
	 scnr.close();
	}

}
