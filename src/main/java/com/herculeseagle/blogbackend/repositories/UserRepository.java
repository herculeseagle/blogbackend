package com.herculeseagle.blogbackend.repositories;

import com.herculeseagle.blogbackend.domain.User;
import com.herculeseagle.blogbackend.exceptions.EtAuthException;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
