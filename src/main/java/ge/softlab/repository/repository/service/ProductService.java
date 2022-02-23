package ge.softlab.repository.repository.service;

import ge.softlab.repository.repository.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    Product getProduct(Integer type);

    Product addProduct(Product product);

    List<Product> filter(Integer typeId, Integer brandId, Double minPrice, Double maxPrice);
}
