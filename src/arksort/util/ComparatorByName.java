package arksort.util;

import arksort.entity.Person;
import java.util.*;


public class ComparatorByName  implements Comparator<Person>{


    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
