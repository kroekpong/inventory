package th.co.saic.inventory.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/maintain")
public class MaintenanceCtrl {
	
	@RequestMapping("/asset.htm")
	public ModelAndView searchByRegId(HttpServletRequest httpRequest) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("asset_history");
		return mav;
	}
	
	@RequestMapping("/themes_setting.htm")
	public ModelAndView searchByDate(HttpServletRequest httpRequest) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("themes_setting");
		return mav;
	}
	
//	@RequestMapping("/list")
//	public ModelAndView list(HttpServletRequest httpRequest) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("list");
//		return mav;
//	}
	
//	@RequestMapping("/detail")
//	public ModelAndView detail(HttpServletRequest httpRequest) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("detail");
//		return mav;
//	}
//	
//	@RequestMapping("/report")
//	public ModelAndView report(HttpServletRequest httpRequest) {
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("report");
//		return mav;
//	}
	
}
