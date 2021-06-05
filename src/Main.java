import java.util.Scanner;
public class Main {
	private static int option;
	private static int choose;
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
	companyDescription cd = new companyDescription();
	while (true) {
	System.out.println("Enter as:"
						+ "\n1. Admin" + "\n2. User");
	option = s.nextInt();
	if(option < 1 || option > 2) {
		System.out.println("Invalid option. Please enter correct option.");
		continue;
	}
	break;
	}
	switch(option) {
	case 1:
		System.out.println("Admin:"
				+ "\n1. Employee" + "\n2. Finance");
		System.out.println("Choose option:");
		choose = s.nextInt();
		
		if(choose == 1) {
			Employee a = new Employee();
			a.employee();
		}
		else if(choose == 2) {
			Finance b = new Finance();
			b.finance();
		}
		break;
	case 2:
		System.out.println("\nHi! Welcome, join our futsal competition. LUCRATIVE PRIZE awaits you!");
		tournamentRegistration c = new tournamentRegistration();
		c.tournamentRegistration();
		System.out.println(c);
		break;
		default:
			System.out.println("Invalid option");
			
		}	
	}
	public int getOption() {
		return option;
	}
	public void setOption(int option) {
		this.option = option;
	}
}





