package oop.homework.workhop;

import java.util.ArrayList;
import java.util.HashMap;

public class ListOfTask implements FileLoader,FileSaver {

    private HashMap<String,ArrayList<String>> tasks = new HashMap<>();
    private ArrayList<ArrayList<String>> listTasks = new ArrayList<>();

    public ArrayList<String> getTasks(String key) {
        return tasks.get(key);
    }

    public void setTasks(String nameTask,String task) {
//        this.tasks.put(nameTask,listTasks.add(new ArrayList<String>(task)));
    }

    @Override
    public void loadFile(String fileName, String fileType) {

    }

    @Override
    public void saveFile(String fileName, String fileType) {

    }
}
