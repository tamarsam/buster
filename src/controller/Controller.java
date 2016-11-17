package controller;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Controller extends Thread {
    private static Controller instance;
    private static ConcurrentLinkedQueue<Command> commands;
    
    private Controller() {
        commands = new ConcurrentLinkedQueue<Command>();   
    }
    
    public void run() {
        while (true) {
            if (!commands.isEmpty()) {
                commands.remove().handle();
            }
            try {
                sleep(3600000);
            } catch (InterruptedException e) {}
        }
    }
    
    public static void init() {
        if (instance == null) {
            instance = new Controller();
            instance.start();
        }
    }
    
    public static int doCommand(Command command) {
        if (instance == null)
            init();
        instance.addCommand(command);
        instance.interrupt();
        return 0;
    }

    private void addCommand(Command command) {
        // TODO Auto-generated method stub
        
    }

}