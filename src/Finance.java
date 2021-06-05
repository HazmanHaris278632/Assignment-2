import java.text.DecimalFormat;
import java.util.Scanner;
public class Finance extends companyDescription implements Tax { //class Finance implements interface Tax
	private double profit;
	private double totalIncome;
	private double incomeWeek1;
	private double incomeWeek2;
	private double incomeWeek3;
	private double incomeWeek4;
	private double tournamentCost;
	private int option;
	private int choose;
	
	Scanner s = new Scanner(System.in);
	public void finance () {
		
			System.out.println("\nEnter income for week 1: ");
			incomeWeek1 = s.nextDouble();
			System.out.println("Enter income for week 2: ");
			incomeWeek2 = s.nextDouble();
			System.out.println("Enter income for week 3: ");
			incomeWeek3 = s.nextDouble();
			System.out.println("Enter income for week 4: ");
			incomeWeek4 = s.nextDouble();
			System.out.println("Enter the operation cost of the tournament: ");
			tournamentCost = s.nextDouble();
			
			netIncome(incomeWeek1,incomeWeek2,incomeWeek3,incomeWeek4);
		}
		public void netIncome(double incomeWeek1, double incomeWeek2, double incomeWeek3, double incomeWeek4) {
			totalIncome = incomeWeek1 + incomeWeek2 + incomeWeek3 + incomeWeek4;
			double tax = totalIncome*rateOfTax();
			profit = totalIncome-tax- tournamentCost;
			
			System.out.printf("Total income for this month \t\t: RM%.2f",totalIncome );
			System.out.printf("\nTotal cost of tournament operation \t: RM%.2f",tournamentCost);
			System.out.printf("\nTax paid \t\t\t\t: RM%.2f",tax);
			System.out.printf("\nTotal profit for this month \t\t: RM%.2f",profit);
		}
		public String toString() { //overriding method
			DecimalFormat format = new DecimalFormat("#0.00");
			
			return "Total income for this month \t\t: RM" + format.format(totalIncome) 
				   + "\nTotal cost of tournament operation \t\t: RM" + format.format(tournamentCost)
				   + "\nTotal profit for this month \t\t: RM" + format.format(profit);
		}
		public double rateOfTax() { //interface method (rateOfTax)
			return 0.20;
		}

	}

