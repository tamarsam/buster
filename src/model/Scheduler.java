package model;

import java.util.Queue;

public class Scheduler extends Thread {
    private static Scheduler instance;
    
    private Queue<Phase> phases;
    
    private Scheduler() {
        //phases = new Queue<Phase>();
    }
    
    public static Scheduler getInstance() {
        return instance;
    }
    
    @Override
    public void run() {
        for (Phase phase : phases) {
            phase.run();
        }
    }

}
