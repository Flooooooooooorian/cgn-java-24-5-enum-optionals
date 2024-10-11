import java.util.List;
import java.util.Objects;

public record Order(
        String id,
        List<Product> products,
        OrderStatus status
) {

}

