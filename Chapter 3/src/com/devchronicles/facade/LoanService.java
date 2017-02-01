package com.devchronicles.facade;

import javax.ejb.Stateless;

@Stateless
public class LoanService {
    public boolean checkCreditRating(long id, double amount) {
        // 고객의 신용 등급이 해당 금액을 대출할 수 있는지 체크합니다.
        return true;
    }
}