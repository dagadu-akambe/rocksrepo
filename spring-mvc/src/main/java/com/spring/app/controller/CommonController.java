package com.spring.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.app.bean.Book;
import com.spring.app.bean.User;


@Controller
public class CommonController {
	
	
	@RequestMapping("/welcomePage")
	public ModelAndView welcomePage() {
		return new ModelAndView("welcome-template");
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "/signUp", method=RequestMethod.GET)
	public String signUp(Model model) {
		model.addAttribute("user", new User());
		return "user";
	}
	
	@RequestMapping(value = "/addUser", method=RequestMethod.POST)
	public @ResponseBody String addUser(@ModelAttribute("user") User user, Model model) {
		System.out.println("User Information : " + user.getFirstName());
		System.out.println("User Information : " + user.getLastName());
		return "User is added successfully";
	}
	
	@RequestMapping(value="/logMeIn", method=RequestMethod.POST)
	public @ResponseBody String logMeIn(@ModelAttribute("username") String userName, @ModelAttribute("password") String password) {
		System.out.println("In Log me In....hh.."+userName+" L "+password);
		if(!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(password) 
				&& userName.equalsIgnoreCase("ganesh") && password.equals("ganesh")) {
			return "Login successfull.";
		}
		return "Wrong username or password.";
	}
	
	 /**
     * Handle request to the default page
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String viewHome() {
        return "home";
    }
 
    /**
     * Handle request to download an Excel document
     */
    @RequestMapping(value = "/downloadExcel", method = RequestMethod.GET)
    public ModelAndView downloadExcel() {
        // create some sample data
        List<Book> listBooks = new ArrayList<Book>();
        listBooks.add(new Book("Effective Java", "Joshua Bloch", "0321356683", "38.11F"));
        listBooks.add(new Book("Head First Java", "Kathy Sierra & Bert Bates", "0596009208", "30.80F"));
        listBooks.add(new Book("Java Generics and Collections", "Philip Wadler", "0596009208", "29.52F"));
        listBooks.add(new Book("Thinking in Java", "Bruce Eckel", "0596527756", "43.97F"));
        listBooks.add(new Book("Spring in Action", "Craig Walls", "1935182358", "31.98F"));
 
        // return a view which will be resolved by an excel view resolver
        return new ModelAndView("excelView", "listBooks", listBooks);
    }
}

