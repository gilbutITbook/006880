package com.devchronicles.facade;

import javax.ejb.Stateless;

@Stateless
public class CustomerService {
    public long getCustomer(int sessionID) {
        // 로그인한 고객 ID를 조회합니다.
        return 100005L;
    }

    public boolean checkId(long x) {
        // 고객 ID가 올바른지 체크합니다.
        return true;
    }
}
