package com.people23.person.repository;

import com.people23.person.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by gmartinezramirez on 01/03/18.
 * This use JpaRepository that extends the PagingAndSortingRepository that extends CRUDRepository.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}
