package muhammadrezkiananda.springdesignpatternscreational.builder;

import lombok.Builder;

@Builder
public class Product {
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

    public Product(String id, String name, String description, Long price, Long discount, Long stock, Long weight, Long height, Long width, Long length, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.discount = discount;
        this.stock = stock;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getPrice() {
        return price;
    }

    public Long getDiscount() {
        return discount;
    }

    public Long getStock() {
        return stock;
    }

    public Long getWeight() {
        return weight;
    }

    public Long getHeight() {
        return height;
    }

    public Long getWidth() {
        return width;
    }

    public Long getLength() {
        return length;
    }

    public Category getCategory() {
        return category;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", stock=" + stock +
                ", weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", category=" + category +
                '}';
    }
}
