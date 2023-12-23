import java.time.LocalDate;
import java.util.List;

public class Fish extends Animal implements Swimble {


    public Fish(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);
    }

    @Override
    public void lifeСycle() {

    }
    @Override
    public double swim() {
        System.out.printf("%s is swimming%n", type);
        return 2;
    }
}
