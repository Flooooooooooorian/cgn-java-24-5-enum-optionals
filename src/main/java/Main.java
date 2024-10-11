import java.util.ArrayList;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Order order1 = new Order("1", new ArrayList<>(), OrderStatus.IN_PROGRESS);

        System.out.println(order1);

        Order copy = new Order(order1.id(), order1.products(), OrderStatus.IN_DELIVERY);


        System.out.println(copy.status().getAbbreviation());

        System.out.println("--------");

        ProductRepo productRepo = new ProductRepo();
        Product p1 = new Product("1", "Banane");
        productRepo.addProduct(p1);


        Optional<Product> optionalProduct1 = productRepo.getProductById("1");

        System.out.println(optionalProduct1.get().name());

        if (optionalProduct1.isPresent()) {
            System.out.println(optionalProduct1.get().name());
        } else {
            System.out.println("Produkt nicht gefunden!");
        }

//        Product product2 = productRepo.getProductById("2");
//        if (product2 != null) {
//            System.out.println(product2.name());
//        } else {
//            System.out.println("Produkt nicht gefunden!");
//        }


        Optional<Order> optionalOrder = Optional.ofNullable(null);

        if (optionalOrder.isPresent()) {
            System.out.println(optionalOrder.get().status());
        }
    }
}
