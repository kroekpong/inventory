package th.co.baiwa.framework.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonCtrl {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/welcome.htm")
	public ModelAndView welcome(HttpServletRequest httpRequest) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");
		return mav;
	}
	
	@RequestMapping(value = "/signin.htm")
	public ModelAndView signin(HttpServletRequest httpRequest) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("signin");
		return mav;
	}
	
	@RequestMapping(value = "/signout.htm" )
	public ModelAndView signout(HttpServletRequest httpRequest) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("signin");
		return mav;
	}
	
	@RequestMapping("/error404.htm")
	public ModelAndView erorr404() {
		// logger.info(" ### in error404");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("error404");
		return mav;
	}
	
	@RequestMapping("/error500.htm")
	public ModelAndView erorr500() {
		logger.info(" ### in error500");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("error500");
		return mav;
	}

}
