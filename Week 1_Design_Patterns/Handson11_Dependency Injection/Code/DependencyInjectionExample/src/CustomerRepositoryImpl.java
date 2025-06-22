import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<Integer, Customer> customerDB = new HashMap<>();

    public CustomerRepositoryImpl() {
        customerDB.put(1, new Customer(1, "Ram"));
        customerDB.put(2, new Customer(2, "Sneha"));
        customerDB.put(3, new Customer(3, "Amit"));
    }

    @Override
    public Customer findCustomerById(int id) {
        return customerDB.get(id);
    }
}