public class Nurse extends Doctor{
    public Nurse(String name, String specialization) {
        super(name, specialization);
    }

    private static void injectio(Animal animal) {
        System.out.printf("Nurse  is injecting %s %n", animal.getName());
    }

    private static void dressing(Animal animal) {
        System.out.printf("Nurse  is dressing %s %n",animal.getName());
    }

    private static void returnToOwner(Animal animal) {
        System.out.printf("Nurse  is returning %s to owner %s %n", animal.getName(), animal.getOwner());
    }

    public static void treatment(Animal animal) {
        injectio(animal);
        dressing(animal);
        returnToOwner(animal);

    }
}
