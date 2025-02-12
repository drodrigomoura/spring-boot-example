package com.rodri.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
  List<Customer> selectAllCustomers();

  Optional<Customer> selectCustomerById(int id);

  void insertCustomer(Customer customer);

  boolean existsPersonWithEmail(String email);

  boolean existsPersonWithId(Integer id);

  void deleteCustomerById(Integer id);

  void updateCustomer(Customer update);
}
