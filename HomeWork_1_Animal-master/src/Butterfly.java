import java.time.LocalDate;
import java.util.List;

public class Butterfly extends Animal implements Flyble {

    public Butterfly(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    public void lifeСycle() {

    }

    @Override
    public double fly() {
        System.out.printf("%s  is flying %n", type);
        return  1.2;
    }
}
