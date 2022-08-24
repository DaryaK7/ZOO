package org.my.All;

public class Birds extends Actions {
    public Birds(String move, String breathe) {
        this.move = move;
        this.breathe = breathe;
    }
//    This is a method override for a class Birds
    @Override
    public void actions() {
        System.out.printf(": I %s, %s and say ", move, breathe);
    }
}


