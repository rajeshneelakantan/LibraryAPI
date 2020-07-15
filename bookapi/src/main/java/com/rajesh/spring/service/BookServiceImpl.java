package com.rajesh.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rajesh.spring.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rajesh.spring.dao.BookDAO;
//import com.rajesh.spring.model.Book;

@Service
@Transactional(readOnly = true)

public class BookServiceImpl implements BookService {

	@Autowired
	   private BookDAO bookDao;

	   @Transactional
	   @Override
	   public long save(Book book) {
		   System.out.println("Inside BookServiceImpl save method");
	      return bookDao.save(book);
	   }

	   @Override
	   @Transactional
	   public Book get(long id) {
		   System.out.println("Inside BookServiceImpl get method");
	      return bookDao.get(id);
	   }

	   @Override
	   @Transactional
	   public List<Book> list() {
		   System.out.println("Inside BookServiceImpl list method");
	      return bookDao.list();
	   }

	   @Transactional
	   @Override
	   public void update(long id, Book book) {
		   System.out.println("Inside BookServiceImpl update method");
	      bookDao.update(id, book);
	   }

	   @Transactional
	   @Override
	   public void delete(long id) {
		   System.out.println("Inside BookServiceImpl delete method");
	      bookDao.delete(id);
	   }
}
