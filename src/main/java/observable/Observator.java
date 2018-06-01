package observable;

import javafx.beans.value.ObservableValue;

import java.util.Observable;
import java.util.Observer;

public class Observator implements Observer {


    private ObservableObject obsValue;

    public Observator(ObservableObject obsValue) {
        this.obsValue = obsValue;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o == obsValue)
            System.out.println(obsValue.getValue());
    }
}
