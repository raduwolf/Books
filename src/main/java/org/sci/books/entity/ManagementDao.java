package org.sci.books.entity;

import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue(value = "Management")
public class ManagementDao extends UserDao{

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "mg")
    private List<TasksDao> tasks;

    public List<TasksDao> getTasks() {
        return tasks;
    }

    public void setTasks(List<TasksDao> tasks) {
        this.tasks = tasks;
    }
}
