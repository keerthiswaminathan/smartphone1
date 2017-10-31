package com.niit.smartphoneworld.dao;

import com.niit.smartphoneworld.model.UserOrder;

public interface OrderDAO {
	void addOrder(UserOrder userOrder);
    double getOrderGrandTotal(int cartId);
}
