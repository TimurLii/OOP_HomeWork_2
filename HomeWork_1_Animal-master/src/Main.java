
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class  Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(2023, 12, 11),
                new ArrayList<>(), "Hcumka", "Biss", 4);

        Eagle eagle = new Eagle("Don", LocalDate.of(2021, 9, 12),
                new ArrayList<>(), "Hcumka", "Anton");

        Crocodile Dandi = new Crocodile("Dandi", LocalDate.of(2023, 11, 15)
                , new ArrayList<>(), "Hcumka", "Jon");

        Penguin penguin = new Penguin("Peny", LocalDate.of(2022, 12, 16),
                new ArrayList<>(), "Hcumka", "Arnton");
        Butterfly Butterfly = new Butterfly("Butterfly", LocalDate.of(2022,6,12),
                new ArrayList<>(), "Hcumka", "Jim");
//        Fish Nemo = new Fish("Fish", LocalDate.of(2022, 1,11),
//                new ArrayList<>(), "Hcumka", "Arnton");

        //Создание объекта)
        VetClinic vetClinic = new VetClinic();

        vetClinic.addPatients(barsik, eagle, Dandi, penguin, Butterfly, new Fish("Fish", LocalDate.of(2022, 1,11),
                new ArrayList<>(), "Hcumka", "Arnton"));
//        System.out.println(vetClinic.getPatients());
//        System.out.println(vetClinic.getGoablse());
//        System.out.println(vetClinic.getFlyble());
//        System.out.println(vetClinic.getSwimble());
        Doctor Doc = new Doctor("Ivanov.A.A" , "Surgeon" );
        Nurse Nurse = new Nurse("Petrova.S.A.", "Nurse");




//        vetClinic.doctorVisit(barsik);

        //Проблемой при таком программировании является то, что в каждом классе наследнике
        // необходимо прописать свойства (умет ли животное летать, плавать,ходить).
    }
}
