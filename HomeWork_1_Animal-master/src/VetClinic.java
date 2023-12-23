import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VetClinic {
    private List<Animal> patients = new ArrayList<>();

    public void addAnimal(Animal patient) {
        patients.add(patient);
    }

    public void addPatients(Animal... animals) {
        Collections.addAll(patients, animals);
    }

    public List<Goable> getGoablse() {
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Goable) result.add((Goable) animal);
        }
        return result;
    }
    public List<Swimble> getSwimble() {
        List<Swimble> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Swimble) result.add((Swimble) animal);
        }
        return result;
    }
    public List<Flyble> getFlyble() {
        List<Flyble> result = new ArrayList<>(patients.size());
        for (Animal animal : patients) {
            if (animal instanceof Flyble) result.add((Flyble) animal);
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }
    public void doctorVisit(Animal animal) {
        Doctor.treatment(animal);
    }

}
