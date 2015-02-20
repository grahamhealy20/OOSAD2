package labweek3.Shopping;

import java.util.*;

public class Cart {

	public Cart(int no_of_items) {
		// TODO - implement Cart.Cart
		//throw new UnsupportedOperationException();
		for(int i = 0; i < no_of_items; i++) {
			cartItem ci = new CartItem()			
			cartItems.add(ci);
			System.out.println("Blank cart Created");
		}
		System.out.println(no_of_items + " blank carts created");
	}

	public Cart() {
		System.out.println("Blank cart Created");
	}

	protected Collection<CartItem> cartItems;

}
