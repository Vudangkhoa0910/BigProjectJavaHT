
package vn.edu.phenikaauni.qlks1.Entity;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerXML {
    private List<Customer> customerXML;

    public CustomerXML() {
    }

    public CustomerXML(List<Customer> customerXML) {
        this.customerXML = customerXML;
    }

    public List<Customer> getCustomerXML() {
        return customerXML;
    }

    public void setCustomerXML(List<Customer> customerXML) {
        this.customerXML = customerXML;
    }
    
}
