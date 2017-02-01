package com.devchronicles.mvc.plain;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListUsersAction implements Action {
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        List<String> userList = new ArrayList<>();
        userList.add("이일웅");
        userList.add("이상윤");
        userList.add("이제이");
        userList.add("이솔이");
        request.setAttribute("listusers", userList);
        return "/WEB-INF/pages/listusers.jsp";
    }
}
