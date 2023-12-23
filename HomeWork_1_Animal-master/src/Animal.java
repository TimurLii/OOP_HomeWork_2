import java.util.List;
import java.time.LocalDate;



public abstract class Animal {
    protected String name;
    protected LocalDate birthDay;
    protected List<String> vaccinations;
    protected String illness;
    protected String owner;
    protected  String type;


    public Animal(String name, LocalDate birthDay, List<String> vaccinations, String illness, String owner) {
        this.name = name;
        this.birthDay = birthDay;
        this.vaccinations = vaccinations;
        this.illness = illness;
        this.owner = owner;
        this.type = getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public String getIllness() {
        return illness;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Animal{" +

                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", vaccinations=" + vaccinations +
                ", illness='" + illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }


    private void wakeUp() {
        System.out.println("Animal is wake up");
    }


    private void wakeUp(int time) {
        System.out.println("Animal si wake up in " + time);
    }

    private void eat() {
        System.out.println("Animal ate ");
    }

    private void play() {
        System.out.println("Animal played");
    }

    private void slep() {
        System.out.println("Animal slepping");
    }


//    private void toGo() {
//        System.out.println("Animal is gone");
//    }
//
//    private void fly() {
//        System.out.println("Animal flying");
//    }
//
//    private void swim() {
//        System.out.println("Animal swims");
//    }

//    public void movement(boolean fly, boolean swim, boolean toGo) {
//        if (fly) fly();
//        if (swim) swim();
//        if (toGo) toGo();
//
//    }


    //    public void lifeСycle(boolean fly, boolean swim, boolean toGo) {
//        wakeUp();
//        eat();
//        play();
//        if (fly) fly();
//        if (swim) swim();
//        if (toGo) toGo();
//        slep();
//    }
    public abstract void lifeСycle();
}

