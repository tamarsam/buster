package model;

import java.util.Date;
import java.util.Queue;

import model.Task.TaskSettings;

public class Phase {
    
    public class PhaseSettings {
        private TaskSettings defaultSettings;
    }
    
    private Queue<Task> tasks;
    private Date start;
    private Date end;
    private String location;
    
    public int run() {
        for (Task task : tasks) {
            task.run();
        }
        return 0;
    }

}
