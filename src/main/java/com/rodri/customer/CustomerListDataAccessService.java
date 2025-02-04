package com.rodri.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("list")
public class CustomerListDataAccessService implements CustomerDao {
  // db
  private static final List<Customer> customers;

  static {
    customers = new ArrayList<>();

    final Customer alex = new Customer(1, "alex", "alex@gmail.com", 21);

    customers.add(alex);

    final Customer jamila = new Customer(2, "Jamila", "jamila@gmail.com", 19);

    customers.add(jamila);
  }

  @Override
  public List<Customer> selectAllCustomers() {
    return customers;
  }

  @Override
  public Optional<Customer> selectCustomerById(final int id) {
    return customers.stream().filter(c -> c.getId().equals(id)).findFirst();
  }

  @Override
  public void insertCustomer(final Customer customer) {
    customers.add(customer);
  }

  @Override
  public boolean existsPersonWithEmail(final String email) {
    return customers.stream().anyMatch(c -> c.getEmail().equals(email));
  }

  @Override
  public boolean existsPersonWithId(Integer id) {
    return customers.stream().anyMatch(c -> c.getId().equals(id));
  }

  @Override
  public void deleteCustomerById(Integer id) {
    customers.stream().filter(c -> c.getId().equals(id)).findFirst().ifPresent(customers::remove);
  }

  @Override
  public void updateCustomer(Customer update) {
    customers.add(update);
  }
}
