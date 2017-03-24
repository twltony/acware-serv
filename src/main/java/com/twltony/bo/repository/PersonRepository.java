package com.twltony.bo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.twltony.bo.model.Person;

/**
 *
 * @param 
 * @return 
 * @throw 
 * 
 * @author Tony
 * @date 2017/3/2
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, String> {
    
}
