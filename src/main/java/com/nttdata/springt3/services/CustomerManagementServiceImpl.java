package com.nttdata.springt3.services;

import com.nttdata.springt3.repositories.Customer;
import com.nttdata.springt3.repositories.CustomerRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * Taller 3 - Spring
 *
 * Implementacion del servicio de clientes
 *
 * @author Daniel Alberto Cosa Cosias
 */

@Service
public class CustomerManagementServiceImpl implements CustomerManagementServiceI{

    @Autowired
    private CustomerRepositoryI customerRepository;

    @Override
    public void insertCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> findByNameAndSurname(String name, String surname) {
        return customerRepository.findByNameAndSurname(name, surname);
    }

    @Override
    public Customer findByCustomerID(Long customerID) {
        return customerRepository.findByCustomerID(customerID);
    }

    @Override
    public List<Customer> findByBirthDateBefore(Date date) {
        return customerRepository.findByBirthDateBefore(date);
    }

    @Override
    public List<Customer> findByBirthDateAfter(Date date) {
        return customerRepository.findByBirthDateAfter(date);
    }

    @Override
    public Customer findByDni(String dni) {
        return customerRepository.findByDni(dni);
    }

    @Override
    public List<Customer> findByName(String name) {
        return customerRepository.findByName(name);
    }
}
