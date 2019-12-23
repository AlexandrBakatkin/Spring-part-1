package lesson_1;

import org.springframework.stereotype.Component;

@Component("Lor")
public class Lor implements Specialist {

    @Override
    public String getReceipt() {
        return "Рецепт выписан от ЛОР'а";
    }
}
