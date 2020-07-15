/*package com.rajesh.spring.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rajesh.spring.model.AuthorDetails;

@Repository
public interface AuthorDAO extends JpaRepository<AuthorDetails, Long>{

List<AuthorDetails> findAll();
@Modifying(clearAutomatically = true)
@Query("UPDATE Author a SET a.address = :address and a.email= :email  WHERE a.name = :name")
//@Query("UPDATE Company c SET c.address = :address WHERE c.id = :companyId")
int update(@Param("name") String name );

//void update(String name, AuthorDetails author);
}
	  /* //save the record
		long save(AuthorDetails author);
		//long save(Book book);
	//get a single record
		AuthorDetails get(long id);
	//get all records
	   List<AuthorDetails> list();
	//update a record 
	   void update(long id, AuthorDetails author);
	//delet a record
	   void delete(long id);
	   List<AuthorDetails> search(String keyword);
	  	    	}
*/