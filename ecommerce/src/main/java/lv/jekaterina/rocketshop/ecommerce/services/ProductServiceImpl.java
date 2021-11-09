package lv.jekaterina.rocketshop.ecommerce.services;

import lv.jekaterina.rocketshop.ecommerce.repositories.Product;
import lv.jekaterina.rocketshop.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    // productRepository constructor injection
    @Autowired
    ProductRepository productRepository;

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id) throws Exception {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new Exception("Product not found"));
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
