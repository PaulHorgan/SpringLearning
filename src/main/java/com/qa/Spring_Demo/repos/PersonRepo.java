package com.qa.Spring_Demo.repos;

import com.qa.Spring_Demo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Integer> {
}
