import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class tournamentRegistration extends advertisement { //subclass for advertisement
	private String teamname;
	private int players =12, choice, quantity, order, category;	
	private double price = 24, payment, balance, packagetotal;
	private double totalPrice, totalAmount;
	String playerlist[];
	
	Scanner s = new Scanner(System.in); //predefine class
	
	public void tournamentRegistration() {
		playerlist = new String[12];
		while(true) {
			System.out.println("Enter category:");
			this.category = s.nextInt();
			s.nextLine();
			if(this.category < 1 || this.category > 2) {
				System.out.println("Invalid category. Please enter correct category.");
				continue;
			}
			break;
			}
	switch(this.category) {
	
	case 1:
		System.out.println("Joining MEN category");
		break;
	
	case 2:
		System.out.println("Joining WOMEN category");
		break;
		default:
			System.out.println("Invalid category");
	}
	teamName("Team name"); 
	playerRegistration();
	}
	
	public void teamName(String gn) { 
		String groupname = gn;
			System.out.println("Enter your team name:");
			this.teamname = s.nextLine();	
		}
	
	public void playerRegistration() {
	System.out.println("Please register your team player name. "
				+ "\nTotal of 12 players only!");
	
		for(int counter = 0; counter < 12; counter++) {
			System.out.println("Enter the name of your team players: " + (counter+1));
			playerlist[counter] = s.nextLine();
			
		}
		energyPackage();
	}
	
	public void energyPackage() { 
	
		System.out.println("We have 1.5L 100 Plus & 1 box (40 packs) Milo Choco Bar for contestants. Do you want to booking for buy? ");
		
		while(true) {
			System.out.println("Enter 1 to buy, if do not want to buy enter 2");
			this.choice = Integer.parseInt(s.nextLine());
			if(this.choice < 1 || this.choice > 2) {
				System.out.println("Invalid choice. Please enter correct choice.");
				continue;
		}
		break;
		}
				System.out.println("Our energy package is 100 Plus & Milo Energy Bar. It is to help your team to increase stamina and maintain energy in order to become a CHAMPION.");
				System.out.println("How many quantity");
				this.quantity = s.nextInt();
				
				if(this.quantity <= 5) {
					totalPrice(); //overloading with no argument
					System.out.println("Buy \t\t: " + this.quantity);
					System.out.printf("\nTotal package price \t: RM%.2f",totalPrice());
					System.out.printf("\nRegistration fee \t: RM%.2f",super.getRegisterPrice());
				}
				else if(this.quantity > 5 && this.quantity <=25) {
					this.price = 20.00; //beli lebih dari 5 kuantiti atau kurang/sama dengan 25 kuantiti, harga RM20.00
					totalPrice(this.price); //overloading with 1 argument
					System.out.println("Buy \t\t: " + this.quantity + " quantity");
					System.out.printf("\nTotal package price \t: RM%.2f",totalPrice(this.price));
					System.out.printf("\nRegistration fee \t: RM%.2f",super.getRegisterPrice());
				}
				else if(this.quantity > 25) {
					this.price = 16; //beli lebih dari 25 kuantiti, harga RM16.00
					double qq = this.quantity;
					totalPrice(this.price,qq); //overloading with 2 arguments
					System.out.println("Buy \t\t: " + this.quantity + " quantity");
					System.out.printf("\nTotal package price \t: RM%.2f",totalPrice(this.price,qq));
					System.out.printf("\nRegistration fee \t: RM%.2f",super.getRegisterPrice());
					
					
				}
				this.totalAmount = super.getRegisterPrice() + totalPrice();
				System.out.printf("\nTotal amount to be paid : RM%.2f",this.totalAmount);
				System.out.println("\nEnter payment:");
				this.payment = s.nextDouble();
				this.balance = this.payment-this.totalAmount;
				System.out.printf("\nBalance \t\t: RM%.2f",this.balance);
	}
		public double totalPrice() {//overloading method
			return this.price*this.quantity;
		}

		public double totalPrice(double pr) {//overloading method with 1 arguments
			return pr*this.quantity;
		}

		public double totalPrice(double pr,double qq) {//overloading method with 2 arguments
			return pr*qq;
		}
		public int getChoice() {
			return choice;
		}
		public void setChoice(int choice) {
			this.choice = choice;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getOrder() {
			return order;
		}
		public void setOrder(int order) {
			this.order = order;
		}
		public double getPayment() {
			return payment;
		}
		public void setPayment(double payment) {
			this.payment = payment;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getTeamName() {
			return teamname;
		}
		public void setTeamName(String teamname) {
			this.teamname = teamname;
		}
		public int getCategory() {
			return category;
		}
		public void setCategory(int category) {
			this.category = category;
		}
		public double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
		public String toString() { //overriding method
			DecimalFormat format = new DecimalFormat("#0.00");
			return "\n========================================================"
					+ "\nTeam name \t\t: " + this.getTeamName() 
					+ "\nPlayer name list \t: " + Arrays.toString(playerlist) 
					+ "\nRegister price \t\t: RM" + format.format(super.getRegisterPrice())
					+ "\nTotal package price \t: RM" + format.format(totalPrice())
					+ "\nTotal price \t\t: RM" + format.format(this.totalAmount)
					+ "\nPaid \t\t\t: RM" + format.format(this.getPayment())
					+ "\nBalance \t\t: RM" + format.format(this.getBalance())
					+ "\nTHANK YOU. GOODLUCK FOR TOURNAMENT!"
					+ "\n=====================================================";
		
	}
}
