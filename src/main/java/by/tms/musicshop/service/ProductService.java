package by.tms.musicshop.service;

import by.tms.musicshop.entity.product.Product;
import by.tms.musicshop.entity.product.ProductType;
import by.tms.musicshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService <T extends Product> {

    @Autowired
    private ProductRepository<Product> productRepository;

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    public T findProductById(Long id) {
        return (T) productRepository.findById(id).orElse(null);
    }

    public List<T> findProductByModelName(String modelName, ProductType productType) {
                return productRepository.findAllByModelNameContains(modelName).stream()
                        .filter(product -> product.getProduct().equals(productType))
                        .map(product -> (T) product)
                        .collect(Collectors.toList());
    }
}
