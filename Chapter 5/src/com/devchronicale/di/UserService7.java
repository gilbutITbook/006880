package com.devchronicale.di;

import javax.inject.Inject;

class UserService7 {

    @Inject
    private UserDataRepository udr;

    public void persistUser(User user) {
        udr.save(user);
    }
}
