package L2Pak;

import java.util.ArrayList;

public class AddressBook2 {
	
	private ArrayList<BuddyInfo2> list;
	
	public AddressBook2() {
		this.list = new ArrayList<BuddyInfo2>();
	}

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		BuddyInfo2 person = new BuddyInfo2("Sandeep", "613-979-8000", "12 Liberty Court");
		BuddyInfo2 person2 = new BuddyInfo2("John", "647-400-3780", "57 Theodore Drive");
		BuddyInfo2 person3 = new BuddyInfo2("Sandeep", "613-979-8000", "12 Liberty Court");
		AddressBook2 buddy = new AddressBook2();
		buddy.addBuddy(person);
		buddy.addBuddy(person2);
		buddy.removeBuddy(person3);
		System.out.println(buddy.toString());
		*/
		
		BuddyInfo2 person = new BuddyInfo2("Tom", "613", "Carleton");
		AddressBook2 AB = new AddressBook2();
		AB.addBuddy(person);
		AB.removeBuddy(person);
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
