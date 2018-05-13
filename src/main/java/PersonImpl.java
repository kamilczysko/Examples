import java.util.Comparator;


public class PersonImpl implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int l1 =(o1.getName()).toString().length();
        int l2 =(o2.getName()).toString().length();
        return l1-l2;
    }


}
