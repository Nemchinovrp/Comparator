package example.using.comparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author roman
 */
public class Main {

    public static void methodList() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Сталонне");
        list.add("Хит");
        list.add("Грин");
        list.add("Скоромный");
        list.add("Шварц");

        Collections.sort(list, new MyComparator());

        for (String temp : list) {
            System.out.println(temp);
        }
    }

    public static void sortPerson() {
        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person(1, "Валерон"));
        listPerson.add(new Person(2, "Борис"));
        listPerson.add(new Person(3, "Хасан"));
        listPerson.add(new Person(4, "Олег"));
        listPerson.add(new Person(5, "Маркел"));
        Collections.sort(listPerson, new ComparatorPerson());
        System.out.println(listPerson.toString());
    }

    public static void main(String[] args) {
        sortPerson();
    }
}
