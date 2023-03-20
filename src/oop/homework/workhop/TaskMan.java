package oop.homework.workhop;

import java.sql.Time;
import java.util.Date;
import java.util.UUID;

public class TaskMan {
    private UUID id;
    private Date dateMaking;
    private Time timeMaking;
    private Date deadLine;
    private String firstName;
    private String lastName;
    private String post;

    //    id, дату добавления записи, время добавления записи, дедлай задачи, ФИО автора,
    public TaskMan(Date dateMaking, Time timeMaking, Date deadLine, String firstName, String lastName, String post) {
        this.id = UUID.randomUUID();
        this.dateMaking = dateMaking;
        this.timeMaking = timeMaking;
        this.deadLine = deadLine;
        this.firstName = firstName;
        this.lastName = lastName;
        this.post = post;
    }

    public UUID getId() {
        return id;
    }

    public Date getDateMaking() {
        return dateMaking;
    }

    public Time getTimeMaking() {
        return timeMaking;
    }

    public Date getDeadLine() {
        return deadLine;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
