import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private double price;

    @ManyToMany
    @JoinTable(
            name = "product_buyers",
            joinColumns = @JoinColumn(name = "id_product"),
            inverseJoinColumns = @JoinColumn(name = "id_buyers")
    )
    private List<User> buyersList;

    public int getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<User> getBuyersList (){
        return buyersList;
    }

    @Override
    public String toString() {
        return "Product №" + id + " [" + " " + title + "; price: [" + price + "]";
    }
}