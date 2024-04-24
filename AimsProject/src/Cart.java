
public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private int qtyOrdered = 0;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < 20) {
			for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
				if (itemsOrdered[i] == null) {
					itemsOrdered[i] = disc;
					System.out.println("The disc has been added!");
					break;
				}
			}
			qtyOrdered++;
			if(qtyOrdered == 20) System.out.println("The cart is almost full!");
		}
		else System.out.println("The cart is full!");
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered > 0) {
			for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
				if (itemsOrdered[i] == disc) {
					itemsOrdered[i] = null;
					System.out.println("The disc has been removed!");
					break;
				}
			}
			qtyOrdered--;
		}
		else System.out.println("The cart is empty!");
	}
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
			if (itemsOrdered[i] != null) total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
}
