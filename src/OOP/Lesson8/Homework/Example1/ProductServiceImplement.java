package OOP.Lesson8.Homework.Example1;

import java.util.Objects;
import java.util.UUID;

public class ProductServiceImplement implements ProductService {
    private Product[] products;

    @Override
    public void displayProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();
    }

    @Override
    public void addProduct(Product product) {
        if (Objects.isNull(products)) {
            Product[] newProducts = new Product[1];
            newProducts[0] = product;
            products = newProducts;
        } else {
            Product[] newProducts = new Product[products.length + 1];
            for (int i = 0; i < products.length; i++) {
                newProducts[i] = products[i];
            }
            newProducts[products.length] = product;
            products = newProducts;
        }
        System.out.println("Product added");
        displayProducts();
    }

    @Override
    public void deleteProduct(Product product) {
        if (Objects.nonNull(products)) {
            UUID uuid = product.getId();
            int index = isHave(uuid);
            if (index != -1) {
                Product[] newProducts = new Product[products.length - 1];
                for (int i = 0; i < products.length; i++) {
                    if (i != index) newProducts[i] = products[i];
                }
                products = newProducts;
                System.out.println("Product deleted");
                displayProducts();
            } else System.err.println("Product not found");
        } else System.err.println("All products are empty");
    }

    @Override
    public void addReview(UUID productID, Review review) {
        int index = isHave(productID);
        if (index != -1) {
            Review[] newReviews = new Review[products[index].getReviews().length + 1];
            for (int i = 0; i < products[index].getReviews().length; i++) {
                newReviews[i] = products[index].getReviews()[i];
            }
            newReviews[newReviews.length - 1] = review;
            products[index].setReviews(newReviews);
            System.out.println("Review added");
            displayProducts();
        } else System.err.println("Review not found");
    }

    private int isHave(UUID uuid) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getId().equals(uuid)) {
                return i;
            }
        }
        return -1;
    }

}
