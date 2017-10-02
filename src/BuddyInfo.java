
public class BuddyInfo{
private String name; //name of buddy
private String address; //address of buddy
private String phone_number; //phone number of buddy
    
    /**
     * Constructor for class BuddyInfo
     * @param name, type String
     * @param address, type address
     * @param phone_number, type phone_number
     */
    public BuddyInfo(String name, String address, String phone_number) {
    	setName(name);
    	setAddress(address);
    	setPhone_number(phone_number);
    }
	public static void main(String[] args) {
		BuddyInfo Homer = new BuddyInfo("Homer Simpson", "742 Evergreen Terrace", "555-7334");//creates class object named Homer
		System.out.println("Hello " + Homer.getName());//prints "Hello Homer Simpson"

	}
	/**
	 * Getter for name instance
	 * @return String name
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter for name instance
	 * @param String name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter for address instance
	 * @return String address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * Setter for address instance
	 * @param String address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * Getter for phone_number instance
	 * @return String phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}
	/**
	 * Setter for phone_number instance
	 * @param String phone_number
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
}
