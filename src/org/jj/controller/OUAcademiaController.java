package org.jj.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/*
 * This class is the controller class for the SPRING MVC TEMPLATE project
 * There is no database connectivity as of now. 
 * I will be adding the connectivity soon as a singleton implementation. 
 * I dont want to make any change which would disable this application to run on 
 * Google app engine. 
 *  
 *  
 *  08/14/2016 01:09 Modifying Home Controller to learn collaboration
 */
@Controller
public class OUAcademiaController {

	@RequestMapping(value = "/home.do")
	public ModelAndView ouHome(HttpServletRequest req, HttpServletResponse res) {
		/*
		 * Should load home page(home.jsp) with no records. Records will be
		 * populated by a separate call , specifically to fetch data from DB and
		 * populate UI tables. The helps us to block screen when data is being
		 * fetched.
		 */
		ModelAndView model = new ModelAndView("home");
		System.out.println("Initiating Home");
		return model;
	}

	@RequestMapping(value = "/fetchHomePageInfo.do", method = RequestMethod.POST)
	public String fetchHomeInfo(HttpServletRequest req, HttpServletResponse res) {

		System.out.println("Fetching home page info");
		// Logic goes here
		System.out.println("Fetching home page info complete");
		System.out.println("Updating Home to demo collaboration");
		return "success";
	}

	@RequestMapping(value = "/student.do")
	public ModelAndView ouStudent(HttpServletRequest req,
			HttpServletResponse res) {
		/*
		 * Should load student page(student.jsp) with no records. Records will
		 * be populated by a separate call , specifically to fetch data from DB
		 * and populate UI tables. The helps us to block screen when data is
		 * being fetched.
		 */

		ModelAndView model = new ModelAndView("student");
		System.out.println("Initiating Student");
		return model;
	}

	@RequestMapping(value = "/fetchStudentPageInfo.do", method = RequestMethod.POST)
	public String fetchStudentInfo(HttpServletRequest req,
			HttpServletResponse res) {

		System.out.println("Fetching student page info");
		// Logic goes here
		for (int i = 0; i < 100000; i++) {
			for (int j = 0; j < 100000; j++) {
				int k = 0;
			}
		}
		System.out.println("Fetching student page info complete");
		return "success";
	}

	@RequestMapping(value = "/faculty.do")
	public ModelAndView ouFaculty(HttpServletRequest req,
			HttpServletResponse res) {
		/*
		 * Should load faculty page(faculty.jsp) with no records. Records will
		 * be populated by a separate call , specifically to fetch data from DB
		 * and populate UI tables. The helps us to block screen when data is
		 * being fetched.
		 */

		ModelAndView model = new ModelAndView("faculty");
		System.out.println("Initiating Faculty");
		return model;
	}

	@RequestMapping(value = "/fetchFacultyPageInfo.do", method = RequestMethod.POST)
	public String fetchFacultyInfo(HttpServletRequest req,
			HttpServletResponse res) {

		System.out.println("Fetching faculty page info");
		// Logic goes here
		System.out.println("Fetching faculty page info complete");
		return "success";
	}

	@RequestMapping(value = "/admin.do")
	public ModelAndView ouAdmin(HttpServletRequest req, HttpServletResponse res) {
		/*
		 * Should load admin page(admin.jsp) with no records. Records will be
		 * populated by a separate call , specifically to fetch data from DB and
		 * populate UI tables. The helps us to block screen when data is being
		 * fetched.
		 */

		ModelAndView model = new ModelAndView("admin");
		System.out.println("Initiating admin");
		return model;
	}

	@RequestMapping(value = "/fetchAdminPageInfo.do", method = RequestMethod.POST)
	public String fetchAdminInfo(HttpServletRequest req, HttpServletResponse res) {

		System.out.println("Fetching admin page info");
		// Logic goes here
		System.out.println("Fetching admin page info complete");
		return "success";
	}

	@RequestMapping(value = "/test_delay.do", method = RequestMethod.POST)
	public String testBlockUI(HttpServletRequest req, HttpServletResponse res) {
		ModelAndView model = new ModelAndView("student");
		System.out.println("BLOCK UI testing start");
		// Below code is added to display the working of block UI
		for (int i = 0; i < 100000; i++) {
			for (int j = 0; j < 100000; j++) {
				int k = 0;
			}
		}
		System.out.println("BLOCK UI testing end");
		return "success";
	}

}
