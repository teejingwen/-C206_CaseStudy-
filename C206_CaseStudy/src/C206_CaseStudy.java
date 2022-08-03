import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		
//		================================= ArrayList for useraccount ====================================
		
		ArrayList<UserAccount> useraccountList = new ArrayList<UserAccount>();
		useraccountList.add(new UserAccount("John", "buyer", "john123@gmail.com", "JoHn543!"));
		useraccountList.add(new UserAccount("May", "seller", "may123@gmail.com", "MaY543!"));
		
//		================================= ArrayList for Category ========================================
		
		ArrayList<Category> categoryList = new ArrayList<Category>();
		categoryList.add(new Category("Electronic Accessories"));
		categoryList.add(new Category("Book"));
		categoryList.add(new Category("CD"));
		
//		================================= ArrayList for Item ========================================
		ArrayList<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item("Book", "Red Book", 10 , "03/08/2022", "12/08/2022", 1));
		itemList.add(new Item("Pen", "Blue Pen", 1 , "05/08/2022", "20/08/2022", 1)); 
		
//		================================= ArrayList for Bid ========================================
		ArrayList<Bids> bidList = new ArrayList<Bids>();
		bidList.add(new Bids("B101", "Book", "may123@gmail.com" , "john123@gmail.com", 10));
		bidList.add(new Bids("B102", "Pen", "may123@gmail.com" , "john123@gmail.com", 1)); 
				
		
		int option = 0;
		
		while (option != 6) {
			
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			int option1 = 0;
			int option2 = 0;
			int option3 = 0;
			int option4 = 0;
			
			if(option == 1) {
				
				C206_CaseStudy.menu1();
				option1 = Helper.readInt("Enter an option > ");
				
				if (option1 == 1) {
					UserAccount au = inputUserAccount();
					C206_CaseStudy.addUserAccount(useraccountList, au);
					System.out.println("New user added!");
					
				}else if(option1 == 2) {
		
					C206_CaseStudy.viewAllUserAccount(useraccountList);
					
				}else if (option1 == 3) {
					C206_CaseStudy.deleteUserAccount(useraccountList);
				}else if (option1 == 4) {
					System.out.println("Thank you for using our service!");
				}
				
				
			}else if(option == 2) {
				
				C206_CaseStudy.menu2();
				option2 = Helper.readInt("Enter an option > ");
				
				if (option2 == 1) {
					Category ca = inputCategory();
					C206_CaseStudy.addCategory(categoryList, ca);
					System.out.println("New category added!");
					
				}else if(option2 == 2) {
					C206_CaseStudy.viewAllCategories(categoryList);
					
				}else if (option2 == 3) {
					C206_CaseStudy.deleteCategory(categoryList);
					
				}else if (option2 == 4) {
					System.out.println("Thank you for using our service!");
				}
				
			} else if (option == 3) {
				C206_CaseStudy.menu3();
				option3 = Helper.readInt("Enter an option > ");
				
				if (option3 == 1) {
					Item i = inputItem();
					C206_CaseStudy.addItem(itemList, i);
					System.out.println("New item added!");
					
				}else if(option3 == 2) {
					C206_CaseStudy.viewAllItems(itemList);
					
				}else if (option3 == 3) {
					C206_CaseStudy.deleteItem(itemList);
					
				}else if (option3 == 4) {
					System.out.println("Thank you for using our service!");
				}
					
			
			} else if (option == 4) {
				C206_CaseStudy.menu4();
				option4 = Helper.readInt("Enter an option > ");
			
				if (option4 == 1) {
					
					Bids b = inputBids();
					C206_CaseStudy.addBids(bidList, b);
					System.out.println("New item added!");
				
				}else if(option4 == 2) {
					C206_CaseStudy.viewAllBids(bidList);
				
				}else if (option4 == 3) {
					C206_CaseStudy.deleteBids(bidList);
				
				}else if (option4 == 4) {
					System.out.println("Thank you for using our service!");
				}
				
				
			}
		}
			
		}

//	==============================================================================================	

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

	public static void menu2() {
		System.out.println("1. Add category");
		System.out.println("2. View all categories");
		System.out.println("3. Delete category based on name");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}

	public static void menu3() {
		System.out.println("1. Add item");
		System.out.println("2. View all items");
		System.out.println("3. Delete item based on name");
		System.out.println("4. Quit");
		Helper.line(80, "-");
	}
	public static void menu4() {
		System.out.println("1. Add Bids");
		System.out.println("2. View all Bids");
		System.out.println("3. Delete Bids based on Bid ID");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}

	// ================================= MENU 1 Option 1 Add user account
	// ====================================
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

	// ================================= MENU 1 Option 2 View all
	// user====================================
	public static String retrieveAllUserAccount(ArrayList<UserAccount> useraccountList) {
		String output = "";

		for (int i = 0; i < useraccountList.size(); i++) {

			output += String.format("%-10s %-10s %-10s %13s\n", useraccountList.get(i).getName(),
					useraccountList.get(i).getRole(), useraccountList.get(i).getEmail(),
					useraccountList.get(i).getPassword());
		}
		return output;
	}

	public static void viewAllUserAccount(ArrayList<UserAccount> useraccountList) {
		C206_CaseStudy.setHeader("USER ACCOUNT LIST");
		String output = String.format("%-10s %-10s %-10s %20s\n", "NAME", "ROLE", "EMAIL", "PASSWORD");
		output += retrieveAllUserAccount(useraccountList);
		System.out.println(output);
	}

	// ================================= MENU 1 Option 3 Delete user based on email
	// ====================================
	public static void deleteUserAccount(ArrayList<UserAccount> useraccountList) {

		C206_CaseStudy.viewAllUserAccount(useraccountList);

		String emailD = Helper.readString("Enter user email to delete > ");
		for (int i = 0; i < useraccountList.size(); i++) {

			if (useraccountList.get(i).getEmail().equals(emailD)) {
				useraccountList.remove(i);

			}

			C206_CaseStudy.viewAllUserAccount(useraccountList);

		}

	}
	// ================================= MENU 2 Option 1 Add Category
	// ====================================

	public static Category inputCategory() {

		String name = Helper.readString("Enter category name > ");

		Category ca = new Category(name);

		return ca;
	}

	public static void addCategory(ArrayList<Category> categoryList, Category ca) {

		categoryList.add(ca);

	}

	// ================================= MENU 2 Option 2 View All Category
	// ====================================

	public static String retrieveAllCategory(ArrayList<Category> categoryList) {
		String output = "";

		for (int i = 0; i < categoryList.size(); i++) {

			output += String.format("%-30s\n", categoryList.get(i).getName());

		}
		return output;
	}

	public static void viewAllCategories(ArrayList<Category> categoryList) {

		C206_CaseStudy.setHeader("CATEGORY LIST");
		// String output = String.format("%-30S\n", "NAME");
		String output = retrieveAllCategory(categoryList);
		System.out.println(output);

	}

	// ================================= MENU 2 Option 3 Delete Category
	// ====================================

	public static void deleteCategory(ArrayList<Category> categoryList) {

		C206_CaseStudy.viewAllCategories(categoryList);

		String name = Helper.readString("Enter category name to delete > ");

		for (int i = 0; i < categoryList.size(); i++) {

			if (categoryList.get(i).getName().equals(name)) {
				categoryList.remove(i);

			}

			C206_CaseStudy.viewAllCategories(categoryList);

		}

	}

	// ================================= MENU 3 Option 1 Add Item
	// ====================================
	public static Item inputItem() {

		C206_CaseStudy.setHeader("ITEM LIST");
		String name = Helper.readString("Enter item name > ");
		String description = Helper.readString("Enter description > ");
		int minBidPrice = Helper.readInt("Enter minimum bid price > $");
		String StartDate = Helper.readString("Enter start date > ");
		String EndDate = Helper.readString("Enter end date > ");
		int BidIncrement = Helper.readInt("Enter bid increment > ");

		Item i = new Item(name, description, minBidPrice, StartDate, EndDate, BidIncrement);

		return i;
	}

	public static void addItem(ArrayList<Item> itemList, Item i) {

		itemList.add(i);

	}
	// ================================= MENU 3 Option 2 View All Item
	// ====================================

	public static String retrieveAllItems(ArrayList<Item> itemList) {
		String output = "";

		for (int i = 0; i < itemList.size(); i++) {

			output += String.format("%-10s %-10s %7d %17s %15s %10d\n", itemList.get(i).getName(),
					itemList.get(i).getDescription(), itemList.get(i).getMinBidPrice(), itemList.get(i).getStartDate(),
					itemList.get(i).getEndDate(), itemList.get(i).getBidIncrement());

		}
		return output;
	}

	public static void viewAllItems(ArrayList<Item> itemList) {

		C206_CaseStudy.setHeader("ITEM LIST");
		String output = String.format("%-10s %-10s %13s %12s %15s %20s\n", "NAME", "DESCRIPTION", "MINBIDPRICE",
				"STARTDATE", "ENDDATE", "BID INCREMENT");
		// String output = String.format("%-30S\n", "NAME");
		output += retrieveAllItems(itemList);
		System.out.println(output);

	}
	// ================================= MENU 3 Option 3 Delete Item
	// ====================================

	public static void deleteItem(ArrayList<Item> itemList) {

		C206_CaseStudy.viewAllItems(itemList);

		String name = Helper.readString("Enter item name to delete > ");

		for (int i = 0; i < itemList.size(); i++) {

			if (itemList.get(i).getName().equals(name)) {
				itemList.remove(i);

			}

			C206_CaseStudy.viewAllItems(itemList);

		}

	}
// ================================= MENU 4 Option 1 Add user account
// ====================================
	public static Bids inputBids() {
		
		String ID = Helper.readString("Enter Bid ID > ");
		String name = Helper.readString("Enter user name > ");
		String smail = Helper.readString("Enter Seller Email > ");
		String bmail = Helper.readString("Enter Buyer Email > ");
		int bp = Helper.readInt("Enter Bid Price > ");
		
		Bids b = new Bids(ID, name, smail, bmail, bp); 
			
		return b;
		}
	public static void addBids(ArrayList<Bids> bidList, Bids b) {

		bidList.add(b);

	}
//================================= MENU 1 Option 2 View all
	// user====================================
	public static String retrieveAllBids(ArrayList<Bids> bidList) {
		String output = "";

		for (int i = 0; i < bidList.size(); i++) {
			
			output += String.format("%-10s %-10s %-10s %-10s %-10d\n", bidList.get(i).getID(), bidList.get(i).getName(), bidList.get(i).getSmail(), bidList.get(i).getBmail(), bidList.get(i).getBp());

		}
		return output;
	}

	public static void viewAllBids(ArrayList<Bids> bidList) {
		C206_CaseStudy.setHeader("BID LIST");
		String output = String.format("%-10s %-10s %-10s %-10s %-10s\n", "ID", "NAME", "SELLER EMAIL", "BUYER EMAIL", "BID PRICE");
		output += retrieveAllBids(bidList);
		System.out.println(output);
	}
// ================================= MENU 1 Option 3 Delete user based on email
		// ====================================
		public static void deleteBids(ArrayList<Bids> bidList) {

			C206_CaseStudy.viewAllBids(bidList);

			String DID = Helper.readString("Enter Bid ID to delete > ");
			for (int i = 0; i < bidList.size(); i++) {

				if (bidList.get(i).getID().equals(DID)) {
					bidList.remove(i);

				}

				C206_CaseStudy.viewAllBids(bidList);

			}

		}

	

}
