package org.sci.books.services.impl;

import org.sci.books.entity.BillInfoDao;
import org.sci.books.entity.ClientDao;
import org.sci.books.entity.ManagementDao;
import org.sci.books.entity.TasksDao;
import org.sci.books.repository.impl.UserRepositoryBean;
import org.sci.books.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepositoryBean userRepository;

    @Override
    public void createManager() {
        ManagementDao managementDao =new ManagementDao();
        managementDao.setEmail("aaa@bbb.com");
        managementDao.setUserName("ceva");
        List<TasksDao> tsks=new ArrayList<>();
        TasksDao tsk = new TasksDao();
        TasksDao tsk1 = new TasksDao();
        tsk.setTaskName("tsk1");
        tsk.setMg(managementDao);
        tsks.add(tsk);
        tsk1.setTaskName("tsk12");
        tsk1.setMg(managementDao);
        tsks.add(tsk1);

        managementDao.setTasks(tsks);
        userRepository.createManager(managementDao);
    }

    @Override
    public void createClient() {
        ClientDao cl=new ClientDao();
        cl.setEmail("kkk@ggg.com");
        cl.setUserName("ffr");
        cl.setBillInfo(new BillInfoDao());
        userRepository.createClient(cl);
    }
}
