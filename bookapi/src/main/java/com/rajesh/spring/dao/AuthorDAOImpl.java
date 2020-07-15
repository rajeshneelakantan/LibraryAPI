/*package com.rajesh.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rajesh.spring.model.AuthorDetails;
import com.rajesh.spring.model.Book;

@Repository
public class AuthorDAOImpl implements AuthorDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public long save(AuthorDetails author) {
		System.out.println("inside AuthorDAOImpl save method");
		sessionFactory.getCurrentSession().save(author);
		System.out.println("inside AuthorDAOImpl save method -end");
		return author.getId();
	}

	@Override
	public AuthorDetails get(long id) {
		System.out.println("Inside AuthorDAOImpl get method");
		   return sessionFactory.getCurrentSession().get(AuthorDetails.class, id);
	}

	@Override
	public List<AuthorDetails> list() {
		System.out.println("inside AuthorDAOImpl get list ");
		List<AuthorDetails> list = sessionFactory.getCurrentSession().createQuery("from Author").list();
		System.out.println("inside AuthorDAOImpl get list -end");
		return list;
	}

	@Override
	public void update(long id, AuthorDetails author) {
		System.out.println("Inside AuthorDAOImpl update method");
	      Session session =  sessionFactory.getCurrentSession();
	      AuthorDetails oldAuthor = session.byId(AuthorDetails.class).load(id);
	      oldAuthor.setAddress(author.getAddress());
	      oldAuthor.setEmail(author.getEmail());
	      oldAuthor.setName(author.getName());
	      System.out.println("inside AuthorDAOImpl after setting author and title");
	      session.flush();
	}

	@Override
	public void delete(long id) {
		   System.out.println("Inside AuthorDAOImpl delete method");
		      Session session =  sessionFactory.getCurrentSession();
		      AuthorDetails author = session.byId(AuthorDetails.class).load(id);
		      System.out.println("Inside AuthorDAOImpl delete method -end");
		      session.delete(author);
		
	}

	@Override
	public List<AuthorDetails> search(String keyword) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Query q = session.
				createQuery("From Author b where b.name like concat('%',:keyword,'%') or b.address like concat('%',:keyword,'%')");
		q.setParameter("keyword", keyword);
		List<AuthorDetails> list = q.list();
			System.out.println(list);
			return list;
	}

}*/
