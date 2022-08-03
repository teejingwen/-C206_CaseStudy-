
public class Item {
	
	private String name;
	private String description;
	private int MinBidPrice;
	private String StartDate;
	private String EndDate;
	private int BidIncrement;
	
	public Item(String name, String description, int minBidPrice, String startDate, String endDate, int BidIncrement) {
	
		this.name = name;
		this.description = description;
		this.MinBidPrice = minBidPrice;
		this.StartDate = startDate;
		this.EndDate = endDate;
		this.BidIncrement = BidIncrement;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getMinBidPrice() {
		return MinBidPrice;
	}

	public String getStartDate() {
		return StartDate;
	}

	public String getEndDate() {
		return EndDate;
	}
	
	public int getBidIncrement() {
		return BidIncrement;
	}
	
	
	
	

}
