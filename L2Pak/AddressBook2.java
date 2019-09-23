package L2Pak;

import java.util.ArrayList;

public class AddressBook2 {
	
	private ArrayList<BuddyInfo2> list;
	
	public AddressBook2() {
		this.list = new ArrayList<BuddyInfo2>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		BuddyInfo2 person = new BuddyInfo2("Tom", "613", "Carleton");
		AddressBook2 AB = new AddressBook2();
		AB.addBuddy(person);
		AB.removeBuddy(person);
		System.out.println("Hello commitment");
	}
	
	public void addBuddy(BuddyInfo2 person) {
		this.list.add(person);
	}
	
	public void removeBuddy(BuddyInfo2 person) {
		this.list.remove(person);
	}
	
	public String toString() {
		String s = new String();
		for (BuddyInfo2 b : list) {
			s += b.getName();
		}
		return s;
	}

}
