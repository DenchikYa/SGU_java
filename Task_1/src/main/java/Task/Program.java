package Task;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        KitchenTechnique unit1 = new KitchenTechnique("Чайник", false, 70, true);
        CalculatingTechnique unit2 = new CalculatingTechnique("Ноутбук", false, 65, false);
        KitchenTechnique unit3 = new KitchenTechnique("Холодильник", false, 80, true);
        CalculatingTechnique unit4 = new CalculatingTechnique("Смартфон", false, 60, true);
        MeasuringTechnique unit5 = new MeasuringTechnique("Часы", false, 0, false, 0, 0, 0, 12.45);
        MeasuringTechnique unit6 = new MeasuringTechnique("Весы", false, 0, false, 2.5, 0, 100, 0);
        MeasuringTechnique unit7 = new MeasuringTechnique("Термометр", false, 0, false, 25, 0, 0, 0);
        KitchenTechnique unit8 = new KitchenTechnique("Микроволновка", true, 40, true);

        Room room1 = new Room();
        Room room2 = new Room();
        Room room3 = new Room();

        room1.setTechnique(new HashSet<Technique>(Arrays.asList(unit1, unit3, unit8)));
        room2.setTechnique(new HashSet<Technique>(Arrays.asList(unit2, unit4)));
        room3.setTechnique(new HashSet<Technique>(Arrays.asList(unit5, unit6, unit7)));

        Flat flat = new Flat();

        flat.setRooms(new HashSet<>(Arrays.asList(room1, room2, room3)));

        List<Technique> techniques = new ArrayList<>(room1.getTechnique());
        System.out.println(techniques);

        Comparator<Technique> comparator = new Comparator<Technique>() {
            @Override
            public int compare(Technique o1, Technique o2) {
                return o1.getPower() - o2.getPower();
            }
        };

        Collections.sort(techniques, comparator);

        System.out.println(techniques);


        int lowLint = 65;
        int highLint = 90;

        List<Technique> requiredPowerList = findByPower(room1.getTechnique(), lowLint, highLint);

        System.out.println(requiredPowerList);

    }

    public static List<Technique> findByPower(Set<Technique> t, int lowLint, int highLint) {
        List<Technique> result = new ArrayList<Technique>();

        for (Technique technique : t) {
            if (technique.getPower() >= lowLint && technique.getPower() <= highLint) {
                result.add(technique);
            }
        }
        return result;
    }
}

