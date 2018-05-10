import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparingStuff {

    private List<Person> generatePeople() {

        List<Person> people = new ArrayList<Person>();
        people.add(new Person("a", 55, "e"));
        people.add(new Person("bb", 14, "d"));
        people.add(new Person("cccc", 22, "c"));
        people.add(new Person("qqqw", 33, "c"));
        people.add(new Person("asd", 16, "d"));

        return people;
    }


    public static void main(String args[]) {
        ComparingStuff cf = new ComparingStuff();
        List<Person> list = cf.generatePeople();
//        Comparator<Person> comp = (Person a, Person b) -> {a.getAge() - b.getAge()};
//        Comparator<Person> comp = Comparator.comparing(Person::getAge);
        Comparator<Person> compar = new PersonImpl();

        list.forEach(l -> {
            System.out.println(l);
        });

        System.out.println("------------------");


        list.sort(compar);

        list.forEach(l -> {
            System.out.println(l);
        });


    }
}
