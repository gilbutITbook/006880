package com.devchronicles.facade;

import javax.ejb.Stateless;

@Stateless
public class AccountService {
    public boolean getLoan(double amount) {
        // 계좌 잔액이 충분한지 확인합니다.
        return true;
    }

    public boolean setCustomerBalance(long id, double amount) {
        // 계좌 잔액을 업데이트합니다.
        return true;
    }
}
