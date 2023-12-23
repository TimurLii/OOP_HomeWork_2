import java.util.List;
import java.time.LocalDate;

public class Cat extends Animal implements Goable {
    private int legsCount;


    public Cat(String name, LocalDate birthDay,
               List<String> vaccinations, String illness, String owner, int legsCount) {
        super(name, birthDay, vaccinations, illness, owner);
        this.legsCount = legsCount;

    }

    public int getLegsCount() {
        return legsCount;
    }
    @Override
    public void lifeСycle() {

    }
    @Override
    public double run() {
        System.out.printf("%s is running%n", type);
        return 12.0;
    }
}