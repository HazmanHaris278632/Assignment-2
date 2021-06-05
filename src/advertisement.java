
public abstract class advertisement { //user define class //abstraction
	private int registerPrice = 100;
	
	public  advertisement() {
		System.out.println("\nThe BIGGEST futsal tournament in Jitra is here again. What you waiting for, don't waste your time, register before its too late."
							+ "\nRegistration fee : " + this.registerPrice
							+ "\n1. MEN category"
							+ "\n2. WOMEN category");
	}
	public int getRegisterPrice() {
		return registerPrice;
	}
	public void setRegisterPrice(int registerPrice) {
		this.registerPrice = registerPrice;
	}
}
