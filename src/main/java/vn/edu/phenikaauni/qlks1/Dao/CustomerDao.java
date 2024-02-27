package vn.edu.phenikaauni.qlks1.Dao;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vn.edu.phenikaauni.qlks1.Entity.Customer;
import vn.edu.phenikaauni.qlks1.Entity.CustomerXML;
import vn.edu.phenikaauni.qlks1.Utils.Utils;


public class CustomerDao {
    private static final String CUSTOMER_FILE_NAME = "customer.xml";

    public static void writeCustomerXML(List<Customer> listCustomer) {
        if (!listCustomer.isEmpty()) {
            CustomerXML customerXML = new CustomerXML(listCustomer);
            Utils.writeXMLtoFile(CUSTOMER_FILE_NAME, customerXML);
        }
    }

    public static List<Customer> readCustomerXML() {
        List<Customer> listCustomer = new ArrayList<>();

        try {
            InputStream inputStream = Utils.class.getClassLoader().getResourceAsStream(CUSTOMER_FILE_NAME);

            if (inputStream != null) {
                CustomerXML customerXML = (CustomerXML) Utils.readXMLtoFile(CUSTOMER_FILE_NAME, CustomerXML.class);
                listCustomer = customerXML.getCustomerXML();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listCustomer;
    }

    public static void addCustomer(Customer customer) {
        List<Customer> listCustomer = readCustomerXML();
        listCustomer.add(customer);
        writeCustomerXML(listCustomer);
    }

    public static void sortByCustomerName(List<Customer> customers) {
        Collections.sort(customers, Comparator.comparing(Customer::getName));
    }

    public static void sortByCCCD(List<Customer> customers) {
        Collections.sort(customers, Comparator.comparing(Customer::getCccd));
    }
}