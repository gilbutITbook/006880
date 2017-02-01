package com.devchronicles.forum;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@Path("users")
public class Users1 extends Application {
    @GET
    public String getUsers() {
        return "전체 유저를 나타낸 표현형을 반환합니다.";
    }
}