package com.rajesh.spring.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.spring.model.Book;
import com.rajesh.spring.service.BookService;

@CrossOrigin(origins = "*")
@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	//Get All books
	@GetMapping("/book")
	public ResponseEntity<List<Book>> list(){
System.out.println("Inside BookController");
		List<Book> list = bookService.list();
		System.out.println("Inside BookController- after service call");
		return ResponseEntity.ok().body(list);	
	}
	
	   //---Add new book---
	 @PostMapping("/api/book")
	   public ResponseEntity<?> save(@RequestBody Book book) {
		   System.out.println("Inside BookController PostMapping Book");
		  System.out.println("the json value of book is :::::: "+book);
	      long id = bookService.save(book);
	      System.out.println("Inside BookController PostMapping Book after service call");
	      return ResponseEntity.ok().body("New Book has been saved with ID:" + id);
	   }
	   
	  // ---Get a book by id---
	   @GetMapping("/book/{id}")
	   public ResponseEntity<Book> get(@PathVariable("id") long id) {
		   System.out.println("Inside BookController GetMapping book/id");
	      Book book = bookService.get(id);
	      System.out.println("Inside BookController GetMapping Book by ID after service call");
	      return ResponseEntity.ok().body(book);
	   }

	   // ---Update a book by id---
	   @PutMapping("/book/{id}")
	   public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Book book) {
		   System.out.println("Inside BookController PutMapping Book by id");
	      bookService.update(id, book);
	      System.out.println("Inside BookController PutMapping Book by id after service call");
	      return ResponseEntity.ok().body("Book has been updated successfully.");
	   }
	   @DeleteMapping("/book/{id}")
	   public ResponseEntity<?> delete(@PathVariable("id") long id) {
		   System.out.println("Inside BookController DeleteMapping Book by id");
	      bookService.delete(id);
	      System.out.println("Inside BookController DeleteMapping Book by id after service call");
	      return ResponseEntity.ok().body("Book has been deleted successfully.");
	   }
}
	   
	 /*  //---get all books---
	   @RequestMapping(value="/book", method=RequestMethod.GET)
	 //  @GetMapping("/book")
	   public ResponseEntity<List<Book>> list() {
		   System.out.println("Inside BookController GetMapping api/book");
		   System.out.println("Inside get books api ");
	      List<Book> books = bookService.list();
	      return ResponseEntity.ok().body(books);
	   }

	 

	   //---Delete a book by id---
	   @DeleteMapping("/book/{id}")
	   public ResponseEntity<?> delete(@PathVariable("id") long id) {
		   System.out.println("Inside BookController DeleteMapping Book/id");
	      bookService.delete(id);
	      return ResponseEntity.ok().body("Book has been deleted successfully.");
	   }*/
	

