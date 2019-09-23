package L2Pak;


public class BuddyInfo2 {
	
	private String name;
	private String number;
	private String address;
	
	public BuddyInfo2(String name, String number, String address) {
		this.name = name;
		this.number = number;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getNumber() {
		return number; 
	}
	
	public void setNumber(String number) {
		this.number= number;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo2 person = new BuddyInfo2("John", "647-405-1817", "165 Charles Drive");
		System.out.println("Hello " + person.getName());
	}

}
