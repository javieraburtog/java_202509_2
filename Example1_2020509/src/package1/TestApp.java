package package1;

public class TestApp {

    public static void main(String[] args) {
        Person person = new Person("John", 30);
        System.out.println("Person Name: " + person.getName() + ", Age: " + person.getAge());

        Employee employee = new Employee("Alice", 28, "E123");
        System.out.println("Employee Name: " + employee.getName() + ", Age: " + employee.getAge() + ", Employee ID: " + employee.getEmployeeId());

        Customer customer = new Customer("Bob", 35, "C456");
        System.out.println("Customer Name: " + customer.getName() + ", Age: " + customer.getAge() + ", Customer Number: " + customer.getCustomerNumber());
    }

}
