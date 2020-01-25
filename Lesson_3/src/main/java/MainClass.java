import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        session.beginTransaction();
        User buyer = session.get(User.class, 1);
        List<Product> buyersProducts = buyer.getProductList();
        System.out.println(buyersProducts);

        Product product = session.get(Product.class, 3);
        List<User> productBuyers = product.getBuyersList();
        System.out.println(productBuyers);

        Product p = session.get(Product.class, 2);
        session.delete(p);

        session.getTransaction().commit();
        session.close();
    }
}