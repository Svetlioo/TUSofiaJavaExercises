package LU.LU31_10_2023.sedma;

import java.util.ArrayList;

public class Project {
    private ArrayList<Task> tasks;
    private int capacity;

    public Project(int capacity) {
        this.tasks = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addToProject(Task task) {
        try {
            if (tasks.size() >= capacity) {
                throw new ArrayIndexOutOfBoundsException();
            }
            tasks.add(task);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("List is full!");
        }


    }
}
