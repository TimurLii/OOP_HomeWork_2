import java.time.LocalDate;
import java.util.List;

public class Penguin extends Animal implements Goable, Swimble {


    public Penguin(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);

    }

    @Override
    public void lifeСycle() {

    }    @Override
    public double swim() {
        System.out.printf("%s is swimming%n", type);
        return 3;
    }

    @Override
    public double run() {
        System.out.printf("%s is running%n", type);
        return 4;
    }
}
