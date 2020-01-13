package lesson_2.controller;

import lesson_2.repository.Product;
import lesson_2.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String showMainPage(Model uiModel) {
        return "index";
    }

    @RequestMapping("/allProducts")
    public String showAllProducts(Model uiModel) {
        uiModel.addAttribute("products", productService.getAllProducts());
        return "allProducts";
    }

    @RequestMapping("/showProductById/{sid}")
    public String showStudentById(Model uiModel, @PathVariable("sid") int id) {
        Product product = productService.getProductById(id);
        uiModel.addAttribute("product", product);
        return "product";
    }

    @RequestMapping("/newProduct")
    public String addNewProduct(Model uiModel) {
        uiModel.addAttribute("product", new Product(10, "name", 10.0));
        return "productForm";
    }

    @RequestMapping("/processProductForm")
    public String processProductForm(Model uiModel, @ModelAttribute("product") Product product) {
        uiModel.addAttribute("product", product);
        return "product";
    }
}