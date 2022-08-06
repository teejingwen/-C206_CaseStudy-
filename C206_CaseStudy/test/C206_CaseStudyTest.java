import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private UserAccount ua1;
	private UserAccount ua2;
	
	private Category ca1;
	private Category ca2;
	private Category ca3;
	
	private Item i1;
	private Item i2;
	
	private Bids b1;
	private Bids b2;
	
	private Deals d1;
	private Deals d2;
	

	
	ArrayList<UserAccount> useraccountList = new ArrayList<UserAccount>();
	ArrayList<Category> categoryList = new ArrayList<Category>();
	ArrayList<Item> itemList = new ArrayList<Item>();
	ArrayList<Bids> bidList = new ArrayList<Bids>();
	ArrayList<Deals> dealList = new ArrayList<Deals>(); 
	
	@Before
	public void setUp() throws Exception {
		//prepare test data
		ua1 = new UserAccount("John", "buyer", "john123@gmail.com", "JoHn543!");
		ua2 = new UserAccount("May", "seller", "may123@gmail.com", "MaY543!");
		
		ca1 = new Category("Electronic Accessories");
		ca2 = new Category("Book");
		ca3 = new Category("CD");
		
		i1 = new Item("Book", "Red Book", 10 , "03/08/2022", "12/08/2022", 1);
		i2 = new Item("Pen", "Blue Pen",1 , "05/08/2022", "20/08/2022", 1); 
		
		b1 = new Bids("B101", "Book", "may123@gmail.com" , "john123@gmail.com", 10);
		b2 = new Bids("B102", "Pen", "may123@gmail.com" , "john123@gmail.com", 1); 
		
		d1 = new Deals("A001", "Book", "sam456@gmail.com" , "amy789@gmail.com", 100, "01/08/2022"); 
		d2 = new Deals("A002", "Pen", "same456@gmail.com" , "amy789@gmail.com", 10, "01/08/2022"); 
		
		
		useraccountList= new ArrayList<UserAccount>();
		categoryList = new ArrayList<Category>();
		itemList = new ArrayList<Item>();
		bidList = new ArrayList<Bids>();
		dealList = new ArrayList<Deals>(); 
	}
	
// ============================ USER ===============================
	@Test
	public void addUserAccount() {
		// Item list is not null, so that can add a new item
		
		assertNotNull("Test if there is valid UserAccount arraylist to add to", useraccountList);
				
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addUserAccount(useraccountList, ua1);		
		assertEquals("Test if that UserAccount arraylist size is 1?", 1, useraccountList.size());
				
		//The item just added is as same as the first item of the list
		assertSame("Test that UserAccount is added same as 1st item of the list?", ua1, useraccountList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addUserAccount(useraccountList, ua1);
		C206_CaseStudy.addUserAccount(useraccountList, ua2);
		assertEquals("Test that UserAccoung arraylist size is 3?", 3, useraccountList.size());
		assertSame("Test that UserAccount is added same as 3rd item of the list?", ua2, useraccountList.get(2));
	}
	
	@Test
	public void viewAllUserAccount() {
		
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid UserAccount arraylist to add to", useraccountList);
		
		//test if the list of camcorders retrieved from the SourceCentre is empty
		String allUserAccount= C206_CaseStudy.retrieveAllUserAccount(useraccountList);
		String testOutput = "";
		assertEquals("Check that viewAllUserAccountList", testOutput, allUserAccount);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addUserAccount(useraccountList, ua1);
		C206_CaseStudy.addUserAccount(useraccountList, ua2);	
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, useraccountList.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		allUserAccount= C206_CaseStudy.retrieveAllUserAccount(useraccountList);

		testOutput = String.format("%-10s %-10s %-10s %13s\n", "John", "buyer",
				"john123@gmail.com", "JoHn543!");
		testOutput += String.format("%-10s %-10s %-10s %13s\n", "May", "seller",
				"may123@gmail.com", "MaY543!");
	
		assertEquals("Check that viewAllUserAccountlist", testOutput, allUserAccount);
		
	}
	
	@Test
	public void deleteUserAccount() { 
		//given an empty list, after adding 2 user, the size of the list is 2
		C206_CaseStudy.addUserAccount(useraccountList, ua1);	
		C206_CaseStudy.addUserAccount(useraccountList, ua2);	
		assertEquals("Test if that user arraylist size is 1?", 2, useraccountList.size());
		
		//The user added is as same as the first item of the list
		assertSame("Test that user is added same as 1st item of the list?", ua1, useraccountList.get(0));
				
		// user list is not null, so that can delete a new user
		assertNotNull("Test if there is valid user arraylist to delete from", useraccountList);
		
	}
	
	// ============================ CATEGORY ===============================
	@Test
	public void addCategory() { 
		// user list is not null, so that can add a new category
		assertNotNull("Test if there is valid Category arraylist to add to", categoryList);
			
		//given an empty list, after adding 1 category, the size of the list is 1
		C206_CaseStudy.addCategory(categoryList, ca1);		
		assertEquals("Test if that user arraylist size is 1?", 1, categoryList.size());
			
		//The user just added is as same as the first category of the list
		assertSame("Test that category is added same as 1st item of the list?", ca1, categoryList.get(0));
			
		//Add another user. Test The size of the list is 3
		C206_CaseStudy.addCategory(categoryList, ca2);
		C206_CaseStudy.addCategory(categoryList, ca3);
		assertEquals("Test that category arraylist size is 3?", 3, categoryList.size());
		assertSame("Test that category is added same as 3rd item of the list?", ca2, categoryList.get(1));	
	}
		
	@Test
	public void viewAllcategory() {
		// test if user list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Category arraylist to add to", categoryList);
			
		//test if the list of user retrieved from the SourceCentre is empty
		String allCategory = C206_CaseStudy.retrieveAllCategory(categoryList);
		String testOutput = "";
		assertEquals("Check view all categoryList", testOutput, allCategory);
					
		//Given an empty list, after adding 2 users, test if the size of the list is 2
		C206_CaseStudy.addCategory(categoryList, ca1);
		C206_CaseStudy.addCategory(categoryList, ca2);
		C206_CaseStudy.addCategory(categoryList, ca3);
		assertEquals("Test if that Category arraylist size is 3?", 3, categoryList.size());
			
		//test if the expected output string same as the list of user retrieved from the SourceCentre
		allCategory = C206_CaseStudy.retrieveAllCategory(categoryList);
			
		testOutput += String.format("%-30s\n","Electronic Accessories");
		testOutput += String.format("%-30s\n","Book");
		testOutput += String.format("%-30s\n","CD");
		
		assertEquals("Check that viewAllCategorylist", testOutput, allCategory );
	}
		
	@Test
	public void deleteCat() { 
		//given an empty list, after adding 2 Category, the size of the list is 2
		C206_CaseStudy.addCategory(categoryList, ca1);	
		C206_CaseStudy.addCategory(categoryList, ca2);	
		assertEquals("Test if that category arraylist size is 1?", 2, categoryList.size());
			
		//The Category added is as same as the first Category of the list
		assertSame("Test that category is added same as 1st category of the list?", ca1, categoryList.get(0));
					
		// Category list is not null, so that can delete a new Category
		assertNotNull("Test if there is valid category arraylist to delete from", categoryList);

	}
	
	// ============================ ITEMS ===============================
	@Test
	public void addItem() { 
		// user list is not null, so that can add a new item
		assertNotNull("Test if there is valid Item arraylist to add to", itemList);
					
		//given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addItem(itemList, i1);		
		assertEquals("Test if that item arraylist size is 1?", 1, itemList.size());
					
		//The item just added is as same as the first item of the list
		assertSame("Test that item is added same as 1st item of the list?", i1, itemList.get(0));
					
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addItem(itemList, i2);
		assertEquals("Test that item arraylist size is 3?", 2, itemList.size());
		assertSame("Test that item is added same as 3rd item of the list?", i2, itemList.get(1));	
	}
				
	@Test
	public void viewAllItem() {
		// test if item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Item arraylist to add to", itemList);
			
		//test if the list of item retrieved from the SourceCentre is empty
		String allItem = C206_CaseStudy.retrieveAllItems(itemList);			
		String testOutput = "";
		assertEquals("Check view all itemList", testOutput, allItem);
								
		//Given an empty list, after adding 2 item, test if the size of the list is 2
		C206_CaseStudy.addItem(itemList, i1);
		assertEquals("Test if that item arraylist size is 2?", 1, itemList.size());
						
		//test if the expected output string same as the list of item retrieved from the SourceCentre
		allItem= C206_CaseStudy.retrieveAllItems(itemList);
						
		testOutput += String.format ("%-10s %-10s %7d %23s %15s %5d\n","Book", "Red Book", 10 , "03/08/2022", "12/08/2022", 1); 
		assertEquals("Check that viewAllItem", testOutput, allItem );
	}
				
	@Test
	public void deleteItem() { 
		//given an empty list, after adding 2 item, the size of the list is 2
		C206_CaseStudy.addItem(itemList, i1);	
		C206_CaseStudy.addItem(itemList, i2);	
		assertEquals("Test if that item arraylist size is 1?", 2, itemList.size());
					
		//The user added is as same as the first item of the list
		assertSame("Test that item is added same as 1st category of the list?", i1, itemList.get(0));
							
		// user list is not null, so that can delete a new item
		assertNotNull("Test if there is valid item arraylist to delete from", itemList);
					
	}
	
	// ============================ BID ===============================
	@Test
	public void addBid() { 
		// user list is not null, so that can add a new bid
		assertNotNull("Test if there is valid bid arraylist to add to", bidList);
							
		//given an empty list, after adding 1 bid, the size of the list is 1
		C206_CaseStudy.addBids(bidList, b1);		
		assertEquals("Test if that bid arraylist size is 1?", 1, bidList.size());
						
		//The user just added is as same as the first bid of the list
		assertSame("Test that item is added same as 1st item of the list?", b1, bidList.get(0));
							
		//Add another bid. test The size of the list is 3?
		C206_CaseStudy.addBids(bidList, b1);
		C206_CaseStudy.addBids(bidList, b2);
		assertEquals("Test that bid arraylist size is 3?", 3, bidList.size());
		assertSame("Test that bid is added same as 1nd item of the list?", b1, bidList.get(1));	
	}
						
	@Test
	public void viewAllBid() {
		// test if bid list is not null but empty, so that can add a new bid
		assertNotNull("Test if there is valid Item arraylist to add to", bidList);
						
		//test if the list of bid retrieved from the SourceCentre is empty
		String allBid = C206_CaseStudy.retrieveAllBids(bidList);			
		String testOutput = "";
		assertEquals("Check view all bidList", testOutput, allBid);
											
		//Given an empty list, after adding 2 bid, test if the size of the list is 2
		C206_CaseStudy.addBids(bidList, b1);
		C206_CaseStudy.addBids(bidList, b2);
		assertEquals("Test if that bid arraylist size is 2?", 2, bidList.size());
									
		//test if the expected output string same as the list of bid retrieved from the SourceCentre
		allBid= C206_CaseStudy.retrieveAllBids(bidList);
									
		testOutput += String.format ("%-10s %-10s %-10s %20s %5d\n", "B101", "Book", "may123@gmail.com" , "john123@gmail.com", 10); 
		testOutput += String.format ("%-10s %-10s %-10s %20s %5d\n", "B102", "Pen", "may123@gmail.com" , "john123@gmail.com", 1); 
		assertEquals("Check that viewAllBids", testOutput, allBid );
	}
						
	@Test
	public void deleteBid() { 
		//given an empty list, after adding 2 bid, the size of the list is 2
		C206_CaseStudy.addBids(bidList, b1);	
		C206_CaseStudy.addBids(bidList, b2);	
		assertEquals("Test if that bid arraylist size is 1?", 2, bidList.size());
						
		//The bid added is as same as the first item of the list
		assertSame("Test that bid is added same as 1st category of the list?", b1, bidList.get(0));
									
		// bid list is not null, so that can delete a new bid
		assertNotNull("Test if there is valid bid arraylist to delete from", bidList);
						
	}
	// ============================ DEALS ===============================
	@Test
	public void addDeal() { 

		// deal list is not null, so that can add a new deal
		assertNotNull("Test if there is valid deal arraylist to add to", dealList);
								
		//given an empty list, after adding 1 deal, the size of the list is 1
		C206_CaseStudy.addDeals(dealList, d1);		
		assertEquals("Test if that deal arraylist size is 1?", 1, dealList.size());
							
		//The deal just added is as same as the first user of the list
		assertSame("Test that deal is added same as 1st item of the list?", d1, dealList.get(0));
								
		//Add another deal. test The size of the list is 3?
		C206_CaseStudy.addDeals(dealList, d1);
		C206_CaseStudy.addDeals(dealList, d2);
		assertEquals("Test that deals arraylist size is 3?", 3, dealList.size());
 		assertSame("Test that deals is added same as 2rd item of the list?", d1, dealList.get(1));	
	}
							
	@Test
	public void viewAllDeal() {
		// test if user list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Item arraylist to add to", dealList);
							
		//test if the list of user retrieved from the SourceCentre is empty
		String allDeal = C206_CaseStudy.retrieveAllDeals(dealList);			
		String testOutput = "";
		assertEquals("Check view all dealList", testOutput, allDeal);
												
		//Given an empty list, after adding 2 deals, test if the size of the list is 2
		C206_CaseStudy.addDeals(dealList, d1);
		assertEquals("Test if that item arraylist size is 2?", 1, dealList.size());
										
		//test if the expected output string same as the list of deal retrieved from the SourceCentre
		allDeal= C206_CaseStudy.retrieveAllDeals(dealList);
										
		testOutput += String.format ("%-10s %-10s %-10s %20s %5d\n","A001", "Book", "sam456@gmail.com" , "amy789@gmail.com", 100, "01/08/2022"); 
		assertEquals("Check that viewAllDeals", testOutput, allDeal );
	}
							
	@Test
	public void deleteDeal() { 
		//given an empty list, after adding 2 deal, the size of the list is 2
		C206_CaseStudy.addDeals(dealList, d1);	
		C206_CaseStudy.addDeals(dealList, d2);	
		assertEquals("Test if that deal arraylist size is 1?", 2, dealList.size());
							
		//The deal added is as same as the first deal of the list
		assertSame("Test that deal is added same as 1st category of the list?", d1, dealList.get(0));
										
		// deal list is not null, so that can delete a new deal
		assertNotNull("Test if there is valid deal arraylist to delete from", dealList);
							
	}		
	

	@Test
	public void c206_test() {
		
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	@After
	public void tearDown() throws Exception {

	}

}
