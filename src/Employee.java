
public class Employee extends companyDescription {
	
	public void employee() {
		System.out.println("\nEmployee list: \n");
		System.out.println("Name:" + "\t\t\t\t" + "\t\tContact number:" + "\t\tSalary:(RM)");
		
	String []employee = {"LuqmanHakim \t(Event Manager)\t", "Aiman \t\t(Assistant Manager)", "Salim \t\t(Logistic Manager)", "Dzul \t\t(Marketing Coordinator)", "Faiz \t\t(Game Day Staff)"};
	String []phone = {"012-3456789", "017-4924921", "018-76543219", "014-7598326", "019-3216784", "013-5824967"};
	int []salary = {2500, 2000, 2000, 1800, 1500}; 
	for(int x = 0; x<employee.length; x++) {
		System.out.println(employee[x] + "\t\t" + phone[x] + "\t\t" + salary[x]);
	}
	}
}