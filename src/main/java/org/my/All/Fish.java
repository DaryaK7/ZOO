package org.my.All;

public class Fish extends Actions {
    public Fish(String move, String breathe) {
        this.move = move;
        this.breathe = breathe;
    }
//    This is a method override for a class Fish
    @Override
    public void actions() {
        System.out.printf(": I %s, %s and ", move, breathe);
    }
}

