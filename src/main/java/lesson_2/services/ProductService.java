package lesson_2.services;

import lesson_2.repository.Product;
import lesson_2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductService (ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product getProductById(int id){
        return productRepository.getProductByID(id);
    }

    public List<Product> getAllProducts (){
        return productRepository.getProductList();
    }

    public boolean addProduct (Product product){
        return productRepository.addProduct(product);
    }
}
