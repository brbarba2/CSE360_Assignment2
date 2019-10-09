package cse360assign2;
/**
 * 
 * @author Briana Barba
 * ID: 1212543681
 * Assignment: 2
 *
 *This represents a simple calculator that adds and subtracts and returns the total
 */
public class AddingMachine {

	private int total;
	private int storedValue = 0;
	
	/**
	 * This initializes the total to 0
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		storedValue = total;
		toString();
	}
	/**
	 * This method returns the current total value
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * This method adds a value to the current total value.
	 * calls toString method to print the value being added.
	 * @param value
	 */
	public void add (int value) {
		storedValue = value;
		if (total == 0) {
		System.out.print(total);
	}
		System.out.print(" + "+ toString());
		total = total + value;
		
		
	}
	
	/**
	 * This method subtracts a value from the current total value.
	 * Calls toString method to print the value being added.
	 * @param value
	 */
	public void subtract (int value) {
		storedValue = value;
		if (total == 0) {
		System.out.print(total);
	}
		System.out.print(" - "+ toString());
		total = total - value;
		
		
	}
		
	/**
	 * prints the operations being performed to create the final total
	 */
	public String toString () {
		
		String stringValue = storedValue + "";
		return stringValue;
	}

	public void clear() {
	
	}
}
