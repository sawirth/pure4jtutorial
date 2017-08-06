import org.pure4j.annotations.immutable.ImmutableValue;

@ImmutableValue
public class Product {
    private long sku;
    private final String description;

    public long getSku() {
        return sku;
    }

    public String getDescription() {
        return description;
    }

    public Product(long sku, String description) {
        super();

        this.sku = sku;
        this.description = description;
    }
}
