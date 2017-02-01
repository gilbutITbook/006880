package com.devchronicale.di;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class User11 {

    private String fullName;
    
    public String getFullName(){
        return this.fullName;
    }
    
// 기타 메서드는 편의상 생략합니다.
}
