package org.sci.books.entity;

import javax.persistence.*;

@Entity(name = "TASKS")
public class TasksDao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name="TASK_NAME")
    private String taskName;

    @Column(name="TASK_DESC")
    private String taskDesc;

    @Column(name="TASK_FILE")
    private String taskF;

    @ManyToOne
    @JoinColumn(name = "user_ID")
    private ManagementDao mg;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public String getTaskF() {
        return taskF;
    }

    public void setTaskF(String taskF) {
        this.taskF = taskF;
    }

    public ManagementDao getMg() {
        return mg;
    }

    public void setMg(ManagementDao mg) {
        this.mg = mg;
    }
}
