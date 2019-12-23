package lesson_1;

import org.springframework.stereotype.Component;

@Component("Therapy")
public class Therapy implements Specialist {
    @Override
    public String getReceipt() {
        return "Рецепт выписан от терапевта";
    }
}
