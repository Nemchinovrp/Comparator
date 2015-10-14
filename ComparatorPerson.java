package example.using.comparator;

import java.util.Comparator;

/**
 *
 * @author roman
 */
public class ComparatorPerson implements Comparator<Person> {

//    @Override
//    public int compare(Person p1, Person p2) {
//        int len1 = p1.getName().length();
//        int len2 = p2.getName().length();
//        if (len1 > len2) {
//            return -1;
//        } else if (len1 < len2) {
//            return 1;
//        }
//
//        return 0;
//    }
    @Override
    public int compare(Person p1, Person p2) {
        return -p1.getName().compareTo(p2.getName());
    }

}
