package lesson_2.repository;

public class Product {
    private Integer id;
    private String title;
    private Double cost;

    public Product(Integer id, String name, Double cost) {
        this.id = id;
        this.title = name;
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }
}