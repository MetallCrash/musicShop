package by.tms.musicshop.repository;

import by.tms.musicshop.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository<T extends Product> extends JpaRepository<T, Long> {
    List<T> findAllByModelNameContains(String modelName);
}
