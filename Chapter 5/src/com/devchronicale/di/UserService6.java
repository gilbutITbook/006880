package com.devchronicale.di;

class UserService6 {

    private UserDataRepository udr;

    UserService6(UserDataRepository udr) {
        this.udr = udr;
    }

    public void persistUser(User user) {
        udr.save(user);
    }
}
