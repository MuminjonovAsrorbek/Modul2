package OOP.Lesson8.Homework.Example1;

import java.util.Arrays;
import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private String description;
    private double price;
    private Review[] reviews;

    public Product(UUID id, String name, String description, double price, Review review) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.reviews = new Review[]{review};
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", description='" + description + '\'' + ", price=" + price + ", reviews=" + Arrays.toString(reviews) + '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Review[] getReviews() {
        return reviews;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }
}
