package com.rajesh.spring.dao;

import java.util.List;

import com.rajesh.spring.model.Book;


public interface BookDAO {

   //save the record
	long save(Book book);
	//long save(Book book);
//get a single record
   Book get(long id);
//get all records
   List<Book> list();
//update a record 
   void update(long id, Book book);
//delet a record
   void delete(long id);
}
/*//save the record
	long save(Book book);
	
	
	//get a single record 
	Book get(long id);
	
	//get all record 
	List<Book> list();
	
	//Update the record
	void update(long id, Book book);
	
	//Delete the record 
	void delete(long id);
	*/