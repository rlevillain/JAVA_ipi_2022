package main.beans;

import java.util.Random;

public class DiceBean {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void roll(){
       value = (new Random().nextInt(1,7));
    }



}
