package com.margaritasosnovskaya.MyLocation.repositories;

import com.margaritasosnovskaya.MyLocation.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);
}
