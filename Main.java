package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Nootbook nootbook1 = new Nootbook("16", "256", "MacOS", "black");
        Nootbook nootbook2 = new Nootbook("16", "512", "MacOS", "white");
        Nootbook nootbook3 = new Nootbook("32", "1024", "Windows", "red");
        Nootbook nootbook4 = new Nootbook("8", "256", "Windows", "black");
        Nootbook nootbook5 = new Nootbook("8", "512", "Linux", "green");

        Set<Nootbook> set = new HashSet<>();
        set.add(nootbook1);
        set.add(nootbook2);
        set.add(nootbook3);
        set.add(nootbook4);
        set.add(nootbook5);

        Map<String,String> filter = filter();
        sort(filter,set);
    }


    public static Map<String, String> filter() {
        Map<String, String> filter = new HashMap<>();
        while (true) {
            System.out.println("Вы хотите выбрать критерий? Если да введите 'y', если нет введите 'n'");
            String question = scanner();
            if (question.equals("n")){
                break;
            } else {

                System.out.println("Введите цифру соответствующую критерию фильтрации: \n 1 - Оперативная память \n 2 - Жесткий диск" +
                        "\n 3- Операционная система \n 4 - Цвет");
                String key = scanner();
                System.out.println("Введите значение для выбранного критерия: ");
                String value = scanner();
                filter.put(key, value);
            }
        }
        return filter;
    }
    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }
    public static void sort (Map<String, String> filter, Set<Nootbook> set) {
        Set<Nootbook> temp = new HashSet<>(set);
        for (Nootbook nootbook : set) {
            for (Object pair : filter.keySet()) {
                if (pair.equals("1") && !nootbook.getRam().equals(filter.get(pair))) {
                    temp.remove(nootbook);
                }
                for (Object pair1 : filter.keySet()) {
                    if (pair1.equals("2") && !nootbook.getHdvalue().equals(filter.get(pair1))) {
                        temp.remove(nootbook);
                    }

                    for (Object pair2 : filter.keySet()) {
                        if (pair2.equals("3") && !nootbook.getOs().equals(filter.get(pair2))) {
                            temp.remove(nootbook);
                        }

                        for (Object pair3 : filter.keySet()) {
                            if (pair3.equals("4") && !nootbook.getColor().equals(filter.get(pair3))) {
                                temp.remove(nootbook);
                            }
                        }
                    }
                }
            }
        }
        if (temp.isEmpty()) {
            System.out.println("По введенным критериям ничего не найдено!");
        } else {
            System.out.println("Вот что мы можем предложить: \n" + temp.toString());
        }
    }
}