package pharmacy;

import java.util.*;

public class PharmacyMain {
    public static void main(String[] args) {
        Component Pinicilin = new Component("Pinicilin", "10mg", 100);
        Component Salt = new Component("Salt", "4mg", 30);
        Component Sugar = new Component("Sugar", "12mg", 123);

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.addComponents(Pinicilin, Sugar);

        Pharmacy pharmacy1 = new Pharmacy();
        pharmacy1.addComponents(Pinicilin, Sugar);

        Pharmacy pharmacy2 = new Pharmacy();
        pharmacy2.addComponents(Salt, Sugar);

        Pharmacy pharmacy3 = new Pharmacy();
        pharmacy3.addComponents(Salt, Pinicilin);

        Set<Pharmacy> result1 = new HashSet<>();
        result1.add(pharmacy);
        result1.add(pharmacy1);
        result1.add(pharmacy2);
        result1.add(pharmacy3);
        System.out.println(result1.size());


        IterablePharmacy pharmacy4 = new IterablePharmacy();
        pharmacy4.addComponents(Pinicilin, Salt);

        IterablePharmacy pharmacy5 = new IterablePharmacy();
        pharmacy5.addComponents(Pinicilin, Salt);

        IterablePharmacy pharmacy6 = new IterablePharmacy();
        pharmacy6.addComponents(Salt, Sugar);

        IterablePharmacy pharmacy7 = new IterablePharmacy();
        pharmacy7.addComponents(Salt, Pinicilin);

        Set<IterablePharmacy> result = new HashSet<>();
        result.add(pharmacy4);
        result.add(pharmacy5);
        result.add(pharmacy6);
        result.add(pharmacy7);
        System.out.println(result.size());
        System.out.println(pharmacy5.compareTo(pharmacy1));
//        int result2 = 0;

//        for (Component c : pharmacy5) {
//            System.out.println(result2 += c.getPower());
//        }
//        Iterator<Component> iterator = pharmacy ;
//        while (iterator.hasNext()) System.out.println(iterator.next());
//        List<Component> list = new ArrayList<>();
//        list.add(Salt);
//        list.add(Sugar);
//        list.add(Pinicilin);
//        Collections.sort(list);
//        System.out.println(list);
    }
}
