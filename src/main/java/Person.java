import java.util.Optional;

public class Person {

    private String name;
    private int age = 0;
    private String gender;

    public Person() {}

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }


    public Person(PersonBuilder pb) {
        this.name = pb.name;
        this.age = pb.age;
        this.gender = pb.gender;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Optional getGender() {
        return Optional.ofNullable(this.gender);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "This is " + Optional.ofNullable(getName()).orElse("nameless")+ " and is " + getAge() + " years old " + getGender().orElse(" and has no genitals");
    }

    public void addYear(){
        this.age++;
    }

    public static class PersonBuilder {

        private String name;
        private Integer age;
        private String gender;


        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }


        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }



        public PersonBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

}
