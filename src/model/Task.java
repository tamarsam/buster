/**
 * 
 */
package model;

import java.util.Date;
import java.util.LinkedList;

/**
 * @author user
 *
 */
public class Task {
    
    public class TaskSettings {
        
    }
    
    private class RepeatSettings {
        
    }
    
    private String name;
    private String location;
    private Date length; //TODO: figure how to represent a time period
    private LinkedList<String> tags;
    private LinkedList<Task> dependencies;
    private LinkedList<Task> triggers;
    private int importance;
    private int urgency;
    private int fun;
    private int points;
    private Date due;
    private RepeatSettings repeat;
    private TaskSettings settings;
    
    public int run(){
        return 0;
    }
}
