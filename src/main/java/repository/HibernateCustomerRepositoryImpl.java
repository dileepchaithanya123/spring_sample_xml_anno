package repository;

import model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){

        List<Customer> customers = new ArrayList<>();

       /* Customer customer = new Customer();
        customer.setFirstname("Dileep");
        customer.setLastname("Ponnuru");*/

        customers.add(new Customer("Chaithanya", "Roy"));
        customers.add(new Customer("Dileep", "Roy"));

        return customers;
    }
}
