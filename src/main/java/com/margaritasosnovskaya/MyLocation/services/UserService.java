package com.margaritasosnovskaya.MyLocation.services;

import com.margaritasosnovskaya.MyLocation.models.User;

public interface UserService {

    User getUser(Long id);

    User getUserByEmail(String email);

    User saveUser(User user);
}
