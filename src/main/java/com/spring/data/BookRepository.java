package com.spring.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ghazi Naceur on 22/06/2017.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
