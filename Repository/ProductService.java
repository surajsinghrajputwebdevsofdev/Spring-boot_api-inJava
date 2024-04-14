package org.surajjavaapi.demo.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.surajjavaapi.demo.models.Product;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(String id, Product product) {
        if (productRepository.existsById(id)) {
            product.setid(id);// Assuming setId() method is available in the Product class to set the ID
            return productRepository.save(product);
        } else {
            return null; // Handle appropriately, maybe throw an exception
        }
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
