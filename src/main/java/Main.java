import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Order order1 = new Order("1", new ArrayList<>(), OrderStatus.IN_PROGRESS);

        System.out.println(order1);

        Order copy = new Order(order1.id(), order1.products(), OrderStatus.IN_DELIVERY);


        System.out.println(copy.status().getAbbreviation());

    }
}
