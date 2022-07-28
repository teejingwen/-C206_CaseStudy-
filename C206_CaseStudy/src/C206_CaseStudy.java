import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		
//		================================= ArrayList for useraccount ====================================
		
		ArrayList<UserAccount> useraccountList = new ArrayList<UserAccount>();
		useraccountList.add(new UserAccount("John", "buyer", "john123@gmail.com", "JoHn543!"));
		useraccountList.add(new UserAccount("May", "seller", "may123@gmail.com", "MaY543!"));
		
		int option = 0;
		
		while (option != 6) {
			
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			int option1 = 0;
			if(option == 1) {
				
				C206_CaseStudy.menu1();
				option1 = Helper.readInt("Enter an option > ");
				
				if (option1 == 1) {
					UserAccount au = inputUserAccount();
					C206_CaseStudy.addUserAccount(useraccountList, au);
					System.out.println("New user added");
				}else if(option == 2) {
					C206_CaseStudy.viewAllUserAccount(useraccountList);
				}else if (option == 3) {
					
				}
			}
			
			
		}
	}
	
	public static void menu() {
		C206_CaseStudy.setHeader("RP ONLINE AUCTION SYSTEM");
		System.out.println("1. Manage User Account");
		System.out.println("2. Manage Category");
		System.out.println("3. Manage Item");
		System.out.println("4. Manage Bid");
		System.out.println("5. Manage Deal");
		System.out.println("6. Quit");
		Helper.line(80, "-");
	}

	private static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
		
	}
	
	public static void menu1() {
		System.out.println("1. Add user account");
		System.out.println("2. View all users");
		System.out.println("3. Delete user based on email");
		System.out.println("4. Quit");
		Helper.line(80, "-");
		
	}
	//================================= Option 1 Add user account ====================================

	public static UserAccount inputUserAccount() {
		
		String name = Helper.readString("Enter user name > ");
		String role = Helper.readString("Enter user role > ");
		String email = Helper.readString("Enter user email > ");
		String password = Helper.readString("Enter user password > ");

		UserAccount ua = new UserAccount(name, role, email, password);
		
		return ua;	
	}
	public static void addUserAccount(ArrayList<UserAccount> UserAccountList, UserAccount ua) {
		
		UserAccountList.add(ua);
		
	}
	
	//================================= Option 2 View user account ====================================
	public static String retrieveAllUserAccount(ArrayList<UserAccount> useraccountList) {
		String output = "";

		for (int i = 0; i < useraccountList.size(); i++) {

			output += String.format("%-10s %-10s %-10s %-10s\n", useraccountList.get(i).getName(),
					useraccountList.get(i).getRole(), 
					useraccountList.get(i).getEmail(), useraccountList.get(i).getPassword());
		}
		return output;
	}
	
	public static void viewAllUserAccount(ArrayList<UserAccount> useraccountList) {
		C206_CaseStudy.setHeader("USER ACCOUNT LIST");
		String output = String.format("%-10s %-10s %-10s %-10s\n", "NAME", "ROLE",
				"EMAIL", "PASSWORD");
		 output += retrieveAllUserAccount(useraccountList);	
		System.out.println(output);
	}
	//================================= Option 3 Delete user based on email ====================================
	public static boolean doReturnCamcorder(ArrayList<UserAccount> useraccountList, String mail) {
		boolean isReturned = false;

		for (int i = 0; i < useraccountList.size(); i++) {
			if (mail.equalsIgnoreCase(useraccountList.get(i).getEmail()) == false) {
				isReturned = true;
				
			}
		}
		return isReturned;
		
	}
	
}
