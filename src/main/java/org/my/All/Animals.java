package org.my.All;

public class Animals extends Actions {
    public Animals(String move, String breathe) {
        this.move = move;
        this.breathe = breathe;
    }
    @Override
    public void actions() {
        System.out.printf(": I %s, %s and say ", move, breathe);
    }
}



