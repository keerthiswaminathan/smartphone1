package com.niit.smartphoneworld.dao;

import java.util.List;

import com.niit.smartphoneworld.model.Cart;
import com.niit.smartphoneworld.model.Product;
import com.niit.smartphoneworld.model.UserDetails;

@SuppressWarnings("unused")
public interface UserDAO {
public boolean save(UserDetails userDetails);
	
	public boolean update(UserDetails userDetails);
		
		public boolean delete(UserDetails userDetails);
		
		
		public List<UserDetails> list();
				
		public boolean isValidUser(String username, String password);

		public UserDetails get(String username);
		 UserDetails getCustomerByUsername (String username);
		
	
}


