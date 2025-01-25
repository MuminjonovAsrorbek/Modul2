package OOP.Lesson8.Homework.Example1;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Review review = new Review(UUID.randomUUID(), "Telefon zo'r chiqdi rahmat !", 5, "Alisher");
        Product product = new Product(UUID.randomUUID(), "Samsung S24", "About of phone", 1200, review);

        ProductService productServiceImplement = new ProductServiceImplement();

        productServiceImplement.deleteProduct(product);

        productServiceImplement.addProduct(product);

        Product product1 = new Product(UUID.randomUUID(), "iPhone 14", "About of Phone", 1000,
                new Review(UUID.randomUUID(), "Good", 4.9, "Javohir"));

        productServiceImplement.addProduct(product1);

//        productServiceImplement.deleteProduct(product1);

        Review review1 = new Review(UUID.randomUUID(), "Not good", 1, "John Snow");

        productServiceImplement.addReview(product1.getId(), review1);
    }
}
