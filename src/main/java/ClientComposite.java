import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientComposite implements Customer{
    private final List<Customer> children = new ArrayList<>();

    //note: the ellipsis means "zero or more args of this type"
    public ClientComposite(Customer... clients) {
        children.addAll(Arrays.asList(clients));
    }

    @Override
    public double countDebt() {
        return children.stream()
                .mapToDouble(Customer::countDebt)
                .sum();
    }
}