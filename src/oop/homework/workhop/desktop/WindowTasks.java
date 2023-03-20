package oop.homework.workhop.desktop;

import oop.homework.workhop.FileTypes;
import oop.homework.workhop.Priority;

import javax.swing.*;
import java.util.UUID;

public abstract class WindowTasks {

    private static UUID id;

    public static void Window() {

        final String nameWindow = "Tasks";
        final String[] tableHeader = {"task", "name","deadline"};
        String[][] data = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "},
        };

        JFrame window = new JFrame(nameWindow);
        window.setSize(400,600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JComboBox<Priority> priorityComBox = new JComboBox<>(Priority.values());
        JComboBox<FileTypes> fileTypesComboBox = new JComboBox<>(FileTypes.values());

        JTable taskTable = new JTable(data,tableHeader);
        taskTable.setBounds(10,150,365,440);
        taskTable.setFillsViewportHeight(true);

        JLabel test = new JLabel("qwe");



        window.add(fileTypesComboBox);
        window.add(priorityComBox);
        window.add(taskTable);
        window.add(test);

        priorityComBox.setBounds(10, 10, 120, 20);
        fileTypesComboBox.setBounds(300, 10, 75, 20);
        test.setBounds(50,50,200,100);




        window.setResizable(false);
        window.setLayout(null);
        window.setVisible(true);
    }

}