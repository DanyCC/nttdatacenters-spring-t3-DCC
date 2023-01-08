package com.nttdata.springt3.services;

import com.nttdata.springt3.repositories.Customer;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * Taller 3 - Spring
 *
 * Interfaz del servicio de clientes
 *
 * @author Daniel Alberto Cosa Cosias
 */

@Service
public interface CustomerManagementServiceI {

    /**
     * Inserta o actualiza un cliente
     *
     * @param customer
     */
    public void insertCustomer(Customer customer);

    /**
     * Borra un cliente
     *
     * @param customer
     */
    public void deleteCustomer(Customer customer);

    /**
     * Devuelve una lista con todos los clientes
     *
     * @return
     */
    public List<Customer> findAll();

    /**
     * Encuentra clientes por nombre y apellido
     *
     * @param name
     * @param surname
     * @return
     */
    @Transactional
    public List<Customer> findByNameAndSurname(final String name, final String surname);

    /**
     * Encuentra clientes por su identificador
     *
     * @param customerID
     * @return
     */
    @Transactional
    public Customer findByCustomerID(final Long customerID);

    /**
     * Encuentra clientes nacidos antes de determinada fecha
     *
     * @param date
     * @return
     */
    @Transactional
    public List<Customer> findByBirthDateBefore(final Date date);

    /**
     * Encuentra clientes nacidos despues de determinada fecha
     *
     * @param date
     * @return
     */
    @Transactional
    public List<Customer> findByBirthDateAfter(final Date date);

    /**
     * Encuentra clientes por su DNI
     *
     * @param dni
     * @return
     */
    @Transactional
    public Customer findByDni(final String dni);

    /**
     * Encuentra clientes por nombre
     *
     * @param name
     * @return
     */
    @Transactional
    public List<Customer> findByName(final String name);
}
