public class Doctor {
    protected static String name;
    private String specialization;



    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public static String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Doctor{" + "name='" + name + '\'' + ", specialization='" + specialization + '\'' + '}';
    }

    private static void inspection() {
        System.out.printf("Doctor  is inspecting %n");
    }

    private static void diagnosis() {
        System.out.printf("Doctor is diagnosing %n");
    }

    private static void treatment() {
        System.out.printf("The doctor prescribed treatment %n");
    }

    public static void treatment(Animal animal) {
        System.out.printf("At the doctor's examination %s named %s %n", animal.type, animal.name);
        inspection();
        diagnosis();
        treatment();
        Nurse.treatment(animal);
    }
}