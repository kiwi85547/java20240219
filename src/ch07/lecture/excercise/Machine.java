package ch07.lecture.excercise;

public abstract class Machine {
    public void PowerOn() {
    }

    public abstract void work();
}

class Computer extends Machine {
    @Override
    public void work() {
    }
}