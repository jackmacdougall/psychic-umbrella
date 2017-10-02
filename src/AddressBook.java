
import java.util.ArrayList;
import java.util.List;
public class AddressBook {
	
private List<BuddyInfo> addressBook;
	
	public AddressBook() {
		this.addressBook = new ArrayList<BuddyInfo>();
	}
	
	//adds BuddyInfo object buddy to an AddressBook
	public void addBuddy(BuddyInfo buddy) {
		if(buddy != null) {
			this.addressBook.add(buddy);
		}
	}
	
	//removes BuddyInfo object bud from AddressBook
	public BuddyInfo deleteBuddy(int index) {
		if(index >= 0 && index < this.addressBook.size()) {
			return this.addressBook.remove(index);
		}return null;
	}
	
	//main function
	public static void main(String[] args) {
		BuddyInfo Homer = new BuddyInfo("Homer", "742 Evergreen Terrace", "555-7334");
		AddressBook adBook = new AddressBook();
		adBook.addBuddy(Homer);
		adBook.deleteBuddy(0);
	}
}
