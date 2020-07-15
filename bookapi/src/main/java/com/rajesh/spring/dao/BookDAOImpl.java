package com.rajesh.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.mysql.cj.xdevapi.SessionFactory;
import com.rajesh.spring.model.Book;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.query.Query;

@Repository
public class BookDAOImpl implements BookDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public long save(Book book) {
		System.out.println("inside book save dao");
		sessionFactory.getCurrentSession().save(book);
		System.out.println("inside book save dao -end");
		return book.getId();
		
	}
	@Override
	public Book get(long id) {
		System.out.println("Inside BookDAOImpl get method");
		   return sessionFactory.getCurrentSession().get(Book.class, id);
	}
	@Override
	public List<Book> list() {
		System.out.println("inside book get lis dao");
		List<Book> list = sessionFactory.getCurrentSession().createQuery("from Book").list();
		System.out.println("inside book get list dao -end");
		return list;	
	}
	@Override
	public void update(long id, Book book) {
		 System.out.println("Inside BookDAOImpl update method");
	      Session session =  sessionFactory.getCurrentSession();
	      Book oldBook = session.byId(Book.class).load(id);
	      oldBook.setTitle(book.getTitle());
	      oldBook.setAuthor(book.getAuthor());
	      System.out.println("inside BookDAO after setting author and title");
	      session.flush();
	}

	@Override
	public void delete(long id) {
		   System.out.println("Inside BookDAOImpl delete method");
		      Session session =  sessionFactory.getCurrentSession();
		      Book book = session.byId(Book.class).load(id);
		      System.out.println("Inside BookDAOImpl delete method -end");
		      session.delete(book);
		
	}
}
	/*@Autowired
	private SessionFactory sessionFactory;
	   //private SessionFactory sessionFactory;
	 @Override
	   public long save(Book book) {
		 System.out.println("Inside BookDAOImpl save method");
	      sessionFactory.getCurrentSession().save(book);
	      //getCurrentSession().save(book);
	      return book.getId();
	   }
	   @Override
	   public Book get(long id) {
		   System.out.println("Inside BookDAOImpl get method");
		   return sessionFactory.getCurrentSession().get(Book.class, id);
	   }
	   @Override
	   public List<Book> list() {
		   System.out.println("Inside BookDAOImpl list method");
	      Session session = sessionFactory.getCurrentSession();
	      CriteriaBuilder cb = session.getCriteriaBuilder();
	      CriteriaQuery<Book> cq = cb.createQuery(Book.class);
	      Root<Book> root = cq.from(Book.class);
	      cq.select(root);
	      Query<Book> query = session.createQuery(cq);
	      return query.getResultList();
	   }

	   @Override
	   public void update(long id, Book book) {
		   System.out.println("Inside BookDAOImpl update method");
	      Session session =  sessionFactory.getCurrentSession();
	      Book book2 = session.byId(Book.class).load(id);
	      book2.setTitle(book.getTitle());
	      book2.setAuthor(book.getAuthor());
	      session.flush();
	   }

	   @Override
	   public void delete(long id) {
		   System.out.println("Inside BookDAOImpl delete method");
	      Session session =  sessionFactory.getCurrentSession();
	      Book book = session.byId(Book.class).load(id);
	      session.delete(book);
	   }*/
