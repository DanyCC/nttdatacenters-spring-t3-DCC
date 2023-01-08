package com.nttdata.springt3.repositories;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;

/**
 * Taller 3 - Spring
 *
 * Clase Customer
 *
 * @author Daniel Alberto Cosa Cosias
 */

@Entity
@Table(name = "CUSTOMERS")
public class Customer implements Serializable {
    /**Serial version*/
    @Serial
    private static final long serialVersionUID = 1L;

    /**ID de cliente (PK)*/
    @Id
    @Column(name = "CUSTOMER_ID")
    private Long customerID;

    /**Nombre*/
    @Column(name = "NAME")
    private String name;

    /**Apellidos*/
    @Column(name = "SURNAMES")
    private String surname;

    /**Fecha de nacimiento*/
    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    /**DNI*/
    @Column(name = "DNI")
    private String dni;

    /**Metodo constructor*/
    public Customer(Long customerID, String name, String surname, Date birthDate, String dni) {
        setCustomerID(customerID);
        setName(name);
        setSurname(surname);
        setBirthDate(birthDate);
        setDni(dni);
    }

    /**Metodo constructor vacio*/
    public Customer() {

    }

    /**
     * @return Long customerID
     */
    public Long getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID Long customerID to set
     */
    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    /**
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name String name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname String surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return Date birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate Date birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return String dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni String dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**Metodo toString*/
    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", dni='" + dni + '\'' +
                '}';
    }
}
