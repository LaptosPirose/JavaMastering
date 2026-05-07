package generics;

public class Container<iOne, iTwo> {
	iOne itemOne;
	iTwo itemTwo;

	/**
	 * @param itemOne
	 * @param itemTwo
	 */
	public Container(iOne itemOne, iTwo itemTwo) {
		super();
		this.itemOne = itemOne;
		this.itemTwo = itemTwo;
	}

	/**
	 * @return the itemOne
	 */
	public iOne getItemOne() {
		return itemOne;
	}

	/**
	 * @param itemOne the itemOne to set
	 */
	public void setItemOne(iOne itemOne) {
		this.itemOne = itemOne;
	}

	/**
	 * @return the itemTwo
	 */
	public iTwo getItemTwo() {
		return itemTwo;
	}

	/**
	 * @param itemTwo the itemTwo to set
	 */
	public void setItemTwo(iTwo itemTwo) {
		this.itemTwo = itemTwo;
	}

	public void printItems() {
		System.out.println("Printing contents of container:");
		System.out.println("Item One: " + this.itemOne);
		System.out.println("Item Two: " + this.itemTwo);
	}
}
