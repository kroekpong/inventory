package th.co.saic.inventory.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import th.co.baiwa.common.ApplicationCache;

@RestController
@RequestMapping("/history")
public class InventoryHistoryCtrl {

	@RequestMapping("/asset.htm")
	public ModelAndView searchByRegId(HttpServletRequest httpRequest) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("asset_history");
		Gson gson = new Gson();
		
		mav.addObject("LOV_ASSET_TYPE", gson.toJson(ApplicationCache.getLovByType("ASSET_TYPE")));
		mav.addObject("LOV_GENDER", gson.toJson(ApplicationCache.getLovByType("GENDER")));
		mav.addObject("LOV_OWNER_TYPE", gson.toJson(ApplicationCache.getLovByType("OWNER_TYPE")));
		
		return mav;
	}

	@RequestMapping("/claim.htm")
	public ModelAndView searchByDate(HttpServletRequest httpRequest) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("claim_history");
		return mav;
	}

	// @RequestMapping("/list")
	// public ModelAndView list(HttpServletRequest httpRequest) {
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("list");
	// return mav;
	// }

	// @RequestMapping("/detail")
	// public ModelAndView detail(HttpServletRequest httpRequest) {
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("detail");
	// return mav;
	// }
	//
	// @RequestMapping("/report")
	// public ModelAndView report(HttpServletRequest httpRequest) {
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("report");
	// return mav;
	// }

}
