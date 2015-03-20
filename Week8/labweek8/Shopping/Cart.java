package labweek3.Shopping;

import java.util.*;

public class Cart {

	protected Collection<CartItem> cartItems = new ArrayList<CartItem>();


	public Cart(int no_of_items) {
		// TODO - implement Cart.Cart
		//throw new UnsupportedOperationException();
		for(int i = 0; i < no_of_items; i++) {
			CartItem ci = new CartItem("Test " + i);			
			cartItems.add(ci);
			System.out.println("Blank cart Created");
		}
		System.out.println(no_of_items + " blank carts created");
	}

	public Cart() {
		System.out.println("Blank cart Created");
	}

	/**
	 * 
	 * @param item
	 */
	public void addCartItem(CartItem item) {
		// TODO - implement Cart.addCartItem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public void deleteItem(int id) {
		// TODO - implement Cart.deleteItem
		//throw new UnsupportedOperationException();	
	}
}
