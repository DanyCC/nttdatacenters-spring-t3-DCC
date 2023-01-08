package com.nttdata.springt3;

import com.nttdata.springt3.repositories.Customer;
import com.nttdata.springt3.services.CustomerManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;
import java.util.List;

/**
 * Taller 3 - Spring
 *
 * Clase Main
 *
 * @author Daniel Alberto Cosa Cosias
 */

@SpringBootApplication
public class NttdatacentersSpringt3DccApplication implements CommandLineRunner {

    //Servicio que se consumira
    @Autowired
    private CustomerManagementServiceImpl customerService;

    public static void main(String[] args) {
        SpringApplication.run(NttdatacentersSpringt3DccApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Creacion de clientes
        Customer customer1 = new Customer(1L, "Daniel", "Cosa Cosias", Date.valueOf("2002-12-27"), "23428903J");
        Customer customer2 = new Customer(2L, "Juan Alejandro", "Tellez Rubio", Date.valueOf("1990-2-7"), "48672390D");
        Customer customer3 = new Customer(3L, "Felipe", "Benitez Carrasco", Date.valueOf("2000-9-14"), "60394681G");
        Customer customer4 = new Customer(4L, "Maria del Pilar", "Calleja Bassart", Date.valueOf("1995-7-4"), "29405835S");

        //Insercion de clientes en la bbdd
        customerService.insertCustomer(customer1);
        customerService.insertCustomer(customer2);
        customerService.insertCustomer(customer3);
        customerService.insertCustomer(customer4);

        //Consumicion de los metodos del servicio
        System.out.println("Resultado de findByCustomerID():");
        System.out.println(customerService.findByCustomerID(2L).toString());
        List<Customer> allCustomers = customerService.findAll();
        List<Customer> customersBeforeDate = customerService.findByBirthDateBefore(Date.valueOf("2000-1-1"));
        List<Customer> customersAfterDate = customerService.findByBirthDateAfter(Date.valueOf("2000-1-1"));
        List<Customer> customersByNameAndSurname = customerService.findByNameAndSurname("Maria del Pilar", "Calleja Bassart");
        System.out.println("Resultado de findByDni():");
        System.out.println(customerService.findByDni("23428903J").toString());
        System.out.println("Resultado de findAll(): ");
        for (Customer customer : allCustomers) {
            System.out.println(customer.toString());
        }
        System.out.println("Resultado de findByBirthDateBefore(): ");
        for (Customer customer : customersBeforeDate) {
            System.out.println(customer.toString());
        }
        System.out.println("Resultado de findByBirthDateAfter(): ");
        for (Customer customer : customersAfterDate) {
            System.out.println(customer.toString());
        }
        System.out.println("Resultado de findByNameAndSurname(): ");
        for (Customer customer : customersByNameAndSurname) {
            System.out.println(customer.toString());
        }
    }

}
