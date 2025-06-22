public class DIExample {
    public static void main(String[] args) {
        System.out.println();
        // Manually inject dependency
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        // Test
        service.displayCustomer(1);
        service.displayCustomer(4);
    }
}
