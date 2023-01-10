import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ClientComposite implements Customer, Iterable<Customer>{
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

    @Override
    public Iterator<Customer> iterator() {
        return new Iterator<>() {
            private int index = 0;
            private final List<Customer> childrenList = children.stream().toList();

            @Override
            public boolean hasNext() {
                return index < childrenList.size() && childrenList.get(index) != null;
            }

            @Override
            public Customer next() {
                return childrenList.get(index++);
            }
        };
    }
}