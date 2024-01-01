package com.herculeseagle.blogbackend.services;

import com.herculeseagle.blogbackend.domain.User;
import com.herculeseagle.blogbackend.exceptions.EtAuthException;

public interface UserService {

    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
