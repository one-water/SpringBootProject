package com.offcn.dao;

import com.offcn.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long>  {
}
