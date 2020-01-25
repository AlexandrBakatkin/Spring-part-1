package lesson_2.repository;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList;

    public ProductRepository(){
        productList = new ArrayList();
    }

    public boolean addProduct(Product product){
        return productList.add(product);
    }

    public Product getProductByID(Integer id){
        for (Product product: productList
             ) {
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }
}