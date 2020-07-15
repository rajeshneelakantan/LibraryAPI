/*package com.rajesh.spring.service;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajesh.spring.dao.AuthorDAO;
import com.rajesh.spring.model.AuthorDetails;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

	@Autowired
    private AuthorDAO authorDAO;
	
	@Override
	public List<AuthorDetails> list() {
		// TODO Auto-generated method stub
		return authorDAO.findAll();
	}
	@Override
	public void update(String name, AuthorDetails author) {
		
		
		System.out.println("Inside AuthorServiceImpl update method");
		authorDAO.update(name);
		/*AuthorDetails oldAuthor=
		author.setName(name);
		authorDAO.save(author);
		//sa(name, author);
		public void update(long id, Book book) {
			 System.out.println("Inside BookDAOImpl update method");
		      Session session =  sessionFactory.getCurrentSession();
		  Book oldBook = session.byId(Book.class).load(id);
	      oldBook.setTitle(book.getTitle());
	      oldBook.setAuthor(book.getAuthor());
	      System.out.println("inside BookDAO after setting author and title");
	      session.flush();
}
}*/
	/*@Override
	public void save(AuthorDetails author) {
		// TODO Auto-generated method stub
		
		 authorJPARepository.save(author);
	}
	@Override
	public AuthorDetails get(int id) {
		// TODO Auto-generated method stub
		return null;//authorJPARepository.findById(id);
		
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		authorJPARepository.deleteById(id);	
	}

}
*/

	
/*
 * 
 * 
	@Autowired
	   private AuthorDAO authorDao;
	
	@Override
	public long save(AuthorDetails author) {
		   System.out.println("Inside AuthorServiceImpl save method");
		return authorDao.save(author);
	}

	@Override
	public AuthorDetails get(long id) {
		System.out.println("Inside AuthorServiceImpl get method");
	      return authorDao.get(id);
	}

	@Override
	public List<AuthorDetails> list() {
		System.out.println("Inside AuthorServiceImpl list method");
	      return authorDao.list();
	}

	@Override
	public void update(long id, AuthorDetails author) {
		System.out.println("Inside AuthorServiceImpl update method");
		authorDao.update(id, author);
		
	}

	@Override
	public void delete(long id) {
		   System.out.println("Inside AuthorServiceImpl delete method");
		   authorDao.delete(id);
		
	}
	@Override
	
	public List<AuthorDetails> search(String keyword) {
		return authorDao.search(keyword);
	}*/
	

