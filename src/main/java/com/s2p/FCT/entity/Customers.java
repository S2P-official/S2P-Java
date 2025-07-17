package com.s2p.FCT.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customers {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String firstName;
	    private String lastName;
	    private String email;
	    private String password;
	    private long phoneNumber;

	    @OneToMany(mappedBy = "customers", cascade = CascadeType.ALL)
	    private List<Order> orders;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public long getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public List<Order> getOrders() {
			return orders;
		}

		public void setOrders(List<Order> orders) {
			this.orders = orders;
		}

		public Object getAddress() {
			// TODO Auto-generated method stub
			return null;
		}

		public void setAddress(Object address) {
			// TODO Auto-generated method stub
			
		}
		
	

}
