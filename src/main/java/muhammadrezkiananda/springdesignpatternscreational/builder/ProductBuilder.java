package muhammadrezkiananda.springdesignpatternscreational.builder;

public class ProductBuilder {
    private String id;
    private String name;
    private String description;
    private Long price;
    private Long discount;
    private Long stock;
    private Long weight;
    private Long height;
    private Long width;
    private Long length;

    private Category category;

    public ProductBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public ProductBuilder setPrice(Long price) {
        this.price = price;
        return this;
    }

    public ProductBuilder setDiscount(Long discount) {
        this.discount = discount;
        return this;
    }

    public ProductBuilder setStock(Long stock) {
        this.stock = stock;
        return this;
    }

    public ProductBuilder setWeight(Long weight) {
        this.weight = weight;
        return this;
    }

    public ProductBuilder setHeight(Long height) {
        this.height = height;
        return this;
    }

    public ProductBuilder setWidth(Long width) {
        this.width = width;
        return this;
    }

    public ProductBuilder setLength(Long length) {
        this.length = length;
        return this;
    }

    public ProductBuilder setCategory(Category category) {
        this.category = category;
        return this;
    }

    public Product build() {
        return new Product(id, name, description, price, discount, stock, weight, height, width, length, category);
    }
}
