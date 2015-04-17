package multiplicity;

import java.util.ArrayList;

/**
 * Created by Kola on 17.04.15.
 */
public class multiplicity {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();
        ArrayList<String> list4 = new ArrayList<String>();
        // Наполняем коллекции элементами
        list1.add("Анна");
        list1.add("Вова");
        list1.add("Петя");
        list1.add("Оля");
        list1.add("Рома");
        list1.add("Маша");
        list1.add("Гена");
        list1.add("Лена");
        list1.add("Миша");
        list2.add("Саша");
        list2.add("Гена");
        list2.add("Ира");
        list2.add("Вова");
        list2.add("Катя");
        list2.add("Миша");
        list2.add("Анна");
        list2.add("Коля");
        list2.add("Оля");
        list2.add("Юля");
        // Собираем коллекцию уникальных имен
        list3.add(list1.get(0));
        for (int i = 0; i < list1.size(); i++) {
            boolean add = true;
            for (int j = 0; j < list3.size(); j++) {
                if (list3.get(j).equals(list1.get(i))) add = false;
            }
            if (add) list3.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            boolean add = true;
            for (int j = 0; j < list3.size(); j++) {
                if (list3.get(j).equals(list2.get(i))) add = false;
            }
            if (add) list3.add(list2.get(i));
        }
        // Собираем коллекцию дублирующихся имен
        for (int i = 0; i < list1.size(); i++) {
            boolean add = false;
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) add = true;
            }
            if (add) list4.add(list1.get(i));
        }
        // Выводим множества на экран
        System.out.println("Множество 1:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        System.out.println("Множество 2:");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
        System.out.println("Множество уникальных имен:");
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }
        System.out.println();
        System.out.println("Множество дублирующихся имен:");
        for (int i = 0; i < list4.size(); i++) {
            System.out.print(list4.get(i) + " ");
        }
    }
}
