import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Flyble, Goable {//extends обозначает наследование от какого-то класса


    public Eagle(String name, LocalDate birthDay,
                 List<String> vaccinations, String illness, String owner) {
        super(name, birthDay, vaccinations, illness, owner);

    }

    @Override
    public void lifeСycle() {

    }

    @Override
    public double fly() {

        System.out.printf("%s  is flying %n", type);
        return 20.0;
    }
    @Override
    public double run() {
        System.out.printf("%s is running%n", type);
        return 2.0 ;
    }
}
