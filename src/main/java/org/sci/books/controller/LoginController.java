package org.sci.books.controller;

import org.sci.books.entity.BillInfoDao;
import org.sci.books.entity.ClientDao;
import org.sci.books.entity.ManagementDao;
import org.sci.books.entity.TasksDao;
import org.sci.books.repository.impl.UserRepositoryBean;
import org.sci.books.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserServiceImpl service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome() {
        System.out.println(getClass() + "- Welcome page is invoked.");

        ModelAndView mav = new ModelAndView();
        mav.addObject("mymsg", "Hello world from me!");
        mav.setViewName("homePage");

        service.createManager();
        service.createClient();

        return mav;
    }
}
