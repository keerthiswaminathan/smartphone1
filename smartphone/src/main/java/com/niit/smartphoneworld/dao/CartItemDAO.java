package com.niit.smartphoneworld.dao;

import java.util.List;

import com.niit.smartphoneworld.model.Cart;
import com.niit.smartphoneworld.model.CartItem;



public interface CartItemDAO {
	void addCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByItemId (int itemId);
    
    List<CartItem> getCartItemByItemName (String itemName);

    public List<CartItem> list();
}
