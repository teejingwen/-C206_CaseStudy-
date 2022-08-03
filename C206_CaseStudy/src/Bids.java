
public class Bids {
	private String ID;
	private String name;
	private String smail;
	private String bmail;
	private int bp;
	
	public Bids(String iD, String name, String smail, String bmail, int bp) {
		
		this.ID = iD;
		this.name = name;
		this.smail = smail;
		this.bmail = bmail;
		this.bp = bp;
	}

	public String getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public String getSmail() {
		return smail;
	}

	public String getBmail() {
		return bmail;
	}

	public int getBp() {
		return bp;
	}
	
	
	
	

}
