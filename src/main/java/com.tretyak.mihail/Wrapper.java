package com.tretyak.mihail;

public class Wrapper {
    private boolean stop;

    public Wrapper(boolean stop) {
        this.stop = stop;
    }

    public boolean isStop() {
        return stop;
    }

    public void getStopped() {
        System.out.println("getting stopped");
        stop = true;
    }
}
