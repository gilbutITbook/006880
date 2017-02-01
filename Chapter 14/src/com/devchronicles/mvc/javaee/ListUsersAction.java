package com.devchronicles.mvc.javaee;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class ListUsersAction {

    private List<String> userList = new ArrayList<>();

        public List<String> getUserList() {
        return userList;
    }

    public String execute() {
        userList.add("이일웅");
        userList.add("이상윤");
        userList.add("이제이");
        userList.add("이솔이");
        return "/WEB-INF/pages/listusers.xhtml";
    }
}
