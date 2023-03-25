package com.educandoWeb.course.repositories;

import com.educandoWeb.course.entities.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@ComponentScan
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
