package OOP.Lesson8.Homework.Example1;

import java.util.UUID;

public interface ProductService {
    void displayProducts();

    void addProduct(Product product);

    void deleteProduct(Product product);

    void addReview(UUID productID, Review review);
}
