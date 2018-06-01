package observable;

import java.util.Observable;

public class ObservableObject extends Observable {


    private String someText;

    public ObservableObject(String someText){
        this.someText = someText;
    }

    public void setValue(String someText){
        this.someText = someText;
        setChanged();
        notifyObservers();
    }
    public String getValue(){
        return  "changed value " + this.someText;
    }

}
