package customersInterfaces;

import java.util.List;

import com.s2p.FCT.entity.Customers;

public interface CustomerService {
	
	   Customers createCustomer(Customers customers);
	    Customers getCustomerById(Long id);
	    List<Customers> getAllCustomers();
	    Customers updateCustomer(Long id, Customers customers);
	    void deleteCustomer(Long id);

}
