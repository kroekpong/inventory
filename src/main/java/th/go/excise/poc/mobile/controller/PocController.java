package th.go.excise.poc.mobile.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/poc")
public class PocController {
	
//	@Autowired
//	private PocService pocService;
	
	@RequestMapping("/searchByRegId")
	public ModelAndView searchByRegId(HttpServletRequest httpRequest) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("searchByRegId");
		return mav;
	}
	
	@RequestMapping("/searchByDate")
	public ModelAndView searchByDate(HttpServletRequest httpRequest) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("searchByDate");
		return mav;
	}
	
	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest httpRequest) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("list");
		return mav;
	}
	
	@RequestMapping("/detail")
	public ModelAndView detail(HttpServletRequest httpRequest) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("detail");
		return mav;
	}
	
	@RequestMapping("/report")
	public ModelAndView report(HttpServletRequest httpRequest) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("report");
		return mav;
	}
	
}
