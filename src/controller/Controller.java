package controller;

import java.util.Queue;

public class Controller extends Thread {
    private static Controller instance;
    private static Queue<Command> commands;
    
    private Controller () {
        commands = new Queue<Command>();   
    }
    
    public void run() {
        while (true) {
            if (!commands.isEmpty()) {
                commands.remove().handle();
            }
            try {
                sleep(10000);
            } catch (InterruptedException e) {}
        }
    }
    
    public int command

}