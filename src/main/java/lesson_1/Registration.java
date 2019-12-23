package lesson_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Registration")
public class Registration {
    private Specialist specialist;

    public Specialist getSpecialist(){
        return specialist;
    }

    @Autowired
    @Qualifier("Lor")
    public void SetSpecialist(Specialist specialist){
        this.specialist = specialist;
    }

    public void issueDirect(){
        System.out.println(specialist.getReceipt());

    }
}
