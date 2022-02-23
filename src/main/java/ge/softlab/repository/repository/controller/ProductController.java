package ge.softlab.repository.repository.controller;

import ge.softlab.repository.repository.model.Product;
import ge.softlab.repository.repository.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    ProductService productService;

    @Autowired
    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProduct();
    }

    @GetMapping("{type}")
    public Product getProduct(@PathVariable Integer type) {
        return productService.getProduct(type);

    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);

    }

    @GetMapping
    public List<Product> filter(@RequestParam(required = false) Integer typeId, @RequestParam(required = false) Integer brandId, @RequestParam(required = false) Double minPrice, @RequestParam(required = false) Double maxPrice) {
        return productService.filter(typeId,brandId,minPrice,maxPrice);
    }

}