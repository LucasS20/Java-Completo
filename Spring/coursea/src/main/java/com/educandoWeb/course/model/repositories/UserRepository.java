package com.educandoWeb.course.model.repositories;

import com.educandoWeb.course.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {

}
