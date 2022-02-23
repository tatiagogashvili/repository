package ge.softlab.repository.repository.service;

import ge.softlab.repository.repository.model.Product;
import ge.softlab.repository.repository.repository.jpa.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;
    ProductServiceImpl productServiceImpl;
    @Autowired
    ProductServiceImpl (ProductRepository productRepository){
        this.productRepository=productRepository;

    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Integer id) {
        return productRepository.getById(id);
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
    
    @Override
    public List<Product> filter(Integer typeId, Integer brandId, Double minPrice, Double maxPrice) {
        return productRepository.findAll(((root, query, cb) ->{
            Predicate predicate = cb.conjunction();
            if(typeId!=null){
                predicate=cb.and(predicate,cb.equal(root.get("typeId"),typeId));
            }
            if(brandId!=null){
                predicate=cb.and(predicate,cb.equal(root.get("brandId"),brandId));
            }
            if(minPrice!=null){
                predicate=cb.and(predicate,cb.greaterThan(root.get("minPrice"),minPrice));
            }
            if(maxPrice!=null){
                predicate=cb.and(predicate,cb.lessThan(root.get("maxPrice"),maxPrice));
            }
            return predicate;
        }));
    }
}
