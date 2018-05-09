public class Options {

    public static void main(String args[]){
        Person pesron;
        pesron = new Person.PersonBuilder()
                .age(15)
                .name("Czesiek")
                .build();

        System.out.println(pesron);
        Options o = new Options().elo().end();
        o.elo();
    }

    public Options elo(){
        System.out.println("elo");
        return this;
    }

    public Options end(){
        System.out.println("maskara");
        return this;
    }

}
