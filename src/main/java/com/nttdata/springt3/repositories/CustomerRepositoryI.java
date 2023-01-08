package com.nttdata.springt3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

/**
 * Taller 3 - Spring
 *
 * Repositorio de customer
 *
 * @author Daniel Alberto Cosa Cosias
 */

@Repository
public interface CustomerRepositoryI extends JpaRepository<Customer, Long>{

    /**
     * Encuentra clientes por nombre y apellido
     *
     * @param name
     * @param surname
     * @return
     */
    public List<Customer> findByNameAndSurname(final String name, final String surname);

    /**
     * Encuentra clientes por su identificador
     *
     * @param customerID
     * @return
     */
    public Customer findByCustomerID(final Long customerID);

    /**
     * Encuentra clientes nacidos antes de determinada fecha
     *
     * @param date
     * @return
     */
    public List<Customer> findByBirthDateBefore(final Date date);

    /**
     * Encuentra clientes nacidos despues de determinada fecha
     *
     * @param date
     * @return
     */
    public List<Customer> findByBirthDateAfter(final Date date);

    /**
     * Encuentra clientes por su DNI
     *
     * @param dni
     * @return
     */
    public Customer findByDni(final String dni);

    /**
     * Encuentra clientes por nombre
     *
     * @param name
     * @return
     */
    public List<Customer> findByName(final String name);
}
