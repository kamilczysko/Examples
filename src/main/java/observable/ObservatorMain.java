package observable;

public class ObservatorMain {


    public static void main(String args[]){

        ObservableObject obj = new ObservableObject("test");
        Observator observator = new Observator(obj);
        obj.addObserver(observator);

        obj.setValue("kamil");
        obj.setValue("bamil");

    }
}
