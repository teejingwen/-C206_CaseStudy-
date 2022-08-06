
public class Deals {
	
	private String dealID; 
	private String name; 
	private String selleremail; 
	private String BuyerEmail; 
	private int Tprice; 
	private String Closedate; 
	  
	public Deals(String dealID, String name, String selleremail, String BuyerEmail, int Tprice, String Closedate) { 
	   
	 this.dealID = dealID; 
	 this.name = name; 
	 this.selleremail = selleremail; 
	 this.BuyerEmail = BuyerEmail; 
	 this.Tprice = Tprice; 
	 this.Closedate = Closedate;
	 } 
	 
	public String getID() { 
	  return dealID; 
	 } 
	 
	public String getName() { 
	  return name; 
	 } 
	 
	public String getselleremail() { 
	  return selleremail; 
	 } 
	 
	public String getBuyeremail() { 
	  return BuyerEmail; 
	 } 
	 
	public int getTprice() { 
	  return Tprice; 
	 } 
	  
	public String getClosedate() { 
	  return Closedate; 
	 } 

}
