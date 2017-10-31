package com.niit.smartphoneworld.dao;

import com.niit.smartphoneworld.model.BillingAddress;

public interface BillingAddressDAO {
	void saveOrUpdate(BillingAddress billingAddress);
 void deleteBillingAddress(String billingAddressId);
BillingAddress getBillingAddress(String billingAddressId);

}


