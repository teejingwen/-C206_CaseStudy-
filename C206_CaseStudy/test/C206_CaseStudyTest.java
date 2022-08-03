import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private UserAccount ua1;
	private UserAccount ua2;

	
	private ArrayList<UserAccount> useraccountList;
	
	public C206_CaseStudyTest() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		//prepare test data
		ua1 = new UserAccount("John", "buyer", "john123@gmail.com", "JoHn543!");
		ua2 = new UserAccount("May", "seller", "may123@gmail.com", "MaY543!");
	}
	
	@Test
	public void testaddUserAccount() {
		// Item list is not null, so that can add a new item
		
		assertNotNull("Test if there is valid UserAccount arraylist to add to", useraccountList);
				
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addUserAccount(useraccountList, ua1);		
		assertEquals("Test if that UserAccount arraylist size is 1?", 1, useraccountList.size());
				
		//The item just added is as same as the first item of the list
		assertSame("Test that UserAccount is added same as 1st item of the list?", ua1, useraccountList.get(0));
				
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addUserAccount(useraccountList, ua2);

		assertEquals("Test that UserAccount arraylist size is 2?", 2, useraccountList.size());
		assertSame("Test that UserAccount is added same as 3rd item of the list?", ua2 , useraccountList.get(2));
		
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}
	
	@Test
	public void testretrieveAllUserAccount() {
		
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

		testOutput = String.format("%-10s %-10s %-10s %-10s\n", "John", "buyer",
				"john123@gmail.com", "JoHn543!");
		testOutput += String.format("%-10s %-10s %-10s %-10s\n", "May", "seller",
				"may123@gmail.com", "MaY543!");
	
		assertEquals("Check that viewAllUserAccountlist", testOutput, allUserAccount);
		
	}


	@After
	public void tearDown() throws Exception {
		ua1 = null;
		ua2 = null;
		useraccountList = null;

	}

	@Test
	public void c206_test() {
		
		fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
