package package1;

public class Customer extends Person {
    String customerNumber;
    float limit;

    public Customer(String name, int age, String customerNumber) {
        super(name, age);
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

}
