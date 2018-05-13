import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DoubleColon {

    public int addOne(int num){
        return ++num;
    }

    public int addTwo(int a, int b){
        return a+b;
    }

    public static void main(String args[]){

        List<Person> people = new ArrayList<Person>();
        people.add(new Person("bere", 333, "c"));
        people.add(new Person("cccc", 22, "c"));
        people.add(new Person("qqqw", 313, "c"));
        people.add(new Person("a", 55, "e"));
        people.add(new Person("bb", 14, "d"));
        people.add(new Person("asd", 12, "d"));
        people.add(new Person("bob", 16, "d"));
        people.add(new Person("qqqw", 33, "c"));
        people.add(new Person("bob", 83, "2"));
        people.add(new Person("bob", 33, "4"));

        people.add(new Person("qqqw", 33, "c"));
        people.add(new Person("asd", 16, "d"));

//        people.forEach((p)->{
//            System.out.println(p.toString());
//        });
//
//        System.out.println("=======");
//
//        people.forEach(Person::addYear);
//
//        people.forEach((p)->{
//            System.out.println(p.toString());
//        });
//
//
//        DoubleColon dc = new DoubleColon();
//        Function<Integer, Integer> f = dc::addOne;
//
//        int res = f.apply(5);
//        System.out.println(res);
//
//        res = f.apply(8);
//        System.out.println(res);
//
//        BiFunction<Integer, Integer, Integer> addTwo = dc::addTwo;
//        res = addTwo.apply(4,5);
//        System.out.println(res);
//
//
//        people.forEach(p -> {
//            boolean r = p.getName().filter(n -> n == "bb" || n == "cccc").isPresent();
//            System.out.println(p.getName().orElse("dupa")+" - "+r);
//        });


//        List<Person> resList = people.stream().filter(p -> p.getName().equals("bob")).collect(Collectors.toList());
        Optional<Person> resList = people.stream().filter(p -> p.getName().equals("bob")).findAny();
//        Predicate<Person> pred = p -> p.getAge() > 34 &&  p.getAge() < 60;
//        List<Person> c = people.stream().filter(pred).collect(Collectors.toList());
        System.out.println("*******************");
        System.out.println(resList.get());
//        resList.forEach(a -> System.out.println(a));



    }
}
