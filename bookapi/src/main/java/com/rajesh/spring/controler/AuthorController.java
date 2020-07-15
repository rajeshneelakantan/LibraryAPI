//package com.rajesh.spring.controler;
/*
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.rajesh.spring.model.AuthorDetails;
import com.rajesh.spring.service.AuthorService;*/
/*import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rajesh.spring.model.AuthorDetails;
import com.rajesh.spring.service.AuthorService;
//import com.rajesh.spring.service.AuthorService;

@Controller
public class AuthorController {

	 @Autowired
	    private AuthorService authorservice;
	 
	

	    @RequestMapping(value="/list",method=RequestMethod.GET)
	  
	        public ModelAndView index() {
	    	    // List<Author> listCustomer = AuthorService.list();
	    		 System.out.println("Inside Author controller list start");
	    	    List<AuthorDetails> listAuthor=authorservice.list();
	    	     ModelAndView mav = new ModelAndView("Author");
	    	     mav.addObject("listAuthor", listAuthor);
	    	     System.out.println("Inside Author controller before throwinng model view object");
	    	     return mav;
	    }
		   // ---Update a book by id---

		   @PutMapping("/list/{name}")
		    
		   public ResponseEntity<?> update(@PathVariable("name") String name, @RequestBody AuthorDetails authorDetails) {
			   System.out.println("Inside AuthorController PutMapping name by id");
		
			   authorservice.update(name, authorDetails);
		      System.out.println("Inside AuthorController PutMapping name by id after service call");
		      return ResponseEntity.ok().body("name has been updated successfully.");
		   }*/
/*
	    @GetMapping("/showForm")
	    public String showFormForAdd(Model theModel) {
	        
	        Customer theCustomer = new Customer();
	        theModel.addAttribute("customer", theCustomer);
	        return "customer-form";
	    }

	    @PostMapping("/saveCustomer")
	    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
	        customerService.saveCustomer(theCustomer);
	        return "redirect:/customer/list";
	    }

	    @GetMapping("/updateForm")
	    public String showFormForUpdate(@RequestParam("customerId") int theId,
	        Model theModel) throws ResourceNotFoundException {
	        Customer theCustomer = customerService.getCustomer(theId);
	        theModel.addAttribute("customer", theCustomer);
	        return "customer-form";
	    }

	    @GetMapping("/delete")
	    public String deleteCustomer(@RequestParam("customerId") int theId) throws ResourceNotFoundException {
	        customerService.deleteCustomer(theId);
	        return "redirect:/customer/list";
	    }
	}
	
*/	
	/* @Autowired
	    private AuthorService authorService;
	 @RequestMapping("/")
	 public ModelAndView index() {
	    // List<Author> listCustomer = AuthorService.list();
		 System.out.println("Inside Author controller");
	    List<AuthorDetails> listAuthor=authorService.list();
	     ModelAndView mav = new ModelAndView("Author");
	     mav.addObject("listAuthor", listAuthor);
	     System.out.println("Inside Author controller before throwinng model view object");
	     return mav;
	 }
	 @RequestMapping("/new")
	 public String newAuthorForm(Map<String, Object> model) {
		 System.out.println("Inside Author controller newAuthorForm ");
		    AuthorDetails author = new AuthorDetails();   
		    model.put("author", author);
		    System.out.println("Inside Author controller newAuthorForm after put method ");
		    return "new_author";
		}
	 @RequestMapping(value = "/save", method = RequestMethod.POST)
	 public String saveCustomer(@ModelAttribute("author") AuthorDetails author) {
		 authorService.save(author);
	     return "redirect:/";
	 }
	 @RequestMapping("/edit")
	 public ModelAndView editCustomerForm(@RequestParam long id) {
	     ModelAndView mav = new ModelAndView("edit_author");
	     AuthorDetails author = authorService.get(id);
	     mav.addObject("author", author);
	  
	     return mav;
	 }
	 @RequestMapping("/delete")
	 public String deleteCustomerForm(@RequestParam long id) {
		 authorService.delete(id);
	     return "redirect:/";       
	 }
	 
	 
	 @RequestMapping("/search")
	 public ModelAndView search(@RequestParam String keyword) {
		 List<AuthorDetails> result = authorService.search(keyword);
		 ModelAndView mav=new ModelAndView("search");
		 return mav.addObject("result",result);
		 
	 }*/

