package th.co.saic.inventory.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class InventoryHistoryJsonCtrl {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Autowired
//	private MobileService mobileService;
	/*
	@RequestMapping("/getExample.json")
	public LabelValueBean getExample() {
		LabelValueBean lb = new LabelValueBean();
		lb.setLabel("label na ja");
		lb.setValue("value na ja");
		
		return lb;
	}
	
	@RequestMapping(value = "/getDataTable.json", method = RequestMethod.POST)
	public DataTableAjax<INCTRTableInfo> getDataTable(@RequestBody SearchINCTRRequest request) {
		logger.info(" MobileService.getDataTable ");
		logger.info(" request: " + new Gson().toJson(request));
		
		DataTableAjax<INCTRTableInfo> response = mobileService.getDataTable(request);
		logger.info(" response: " + new Gson().toJson(response));
		return response;
	}
	
	@RequestMapping(value = "/getDataGraph.json", method = RequestMethod.POST)
	public INCTRGraphInfo getDataGraph(@RequestBody SearchINCTRRequest request) {
		logger.info(" MobileService.getDataGraph ");
		logger.info(" request: " + new Gson().toJson(request));
		
		INCTRGraphInfo response = mobileService.getDataGraph(request);
		logger.info(" response: " + new Gson().toJson(response));
		return response;
	}
	
	@RequestMapping(value = "/updateData.json", method = RequestMethod.POST)
	public CommonResponse updateData(@RequestBody UpdateINCTRRequest request) {
		logger.info(" MobileService.updateData ");
		logger.info(" request: " + new Gson().toJson(request));
		
		try {
			mobileService.updateData(request);
			CommonResponse res = new CommonResponse();
			res.setCode("S");
			res.setDesc("success");
			logger.info(" response: " + new Gson().toJson(res));
			return res;
		} catch (Exception e) {
			logger.error(e.getMessage());
			CommonResponse response = new CommonResponse();
			response.setCode("E");
			response.setDesc(e.getMessage());
			logger.info(" response: " + new Gson().toJson(response));
			return response;
		}
	}
	
	@RequestMapping(value = "/updateAmountBalanceBatch.json", method = RequestMethod.POST)
	public CommonResponse updateAmountBalanceBatch(@RequestBody UpdateAmountBalanceBatchRequest request) {
		logger.info(" MobileService.updateAmountBalanceBatch ");
		logger.info(" request: " + new Gson().toJson(request));
		
		try {
			mobileService.updateAmountBalanceBatch(request);
			CommonResponse res = new CommonResponse();
			res.setCode("S");
			res.setDesc("success");
			logger.info(" response: " + new Gson().toJson(res));
			return res;
		} catch (Exception e) {
			logger.error(e.getMessage());
			CommonResponse response = new CommonResponse();
			response.setCode("E");
			response.setDesc(e.getMessage());
			logger.info(" response: " + new Gson().toJson(response));
			return response;
		}
	}
	
	@RequestMapping(value = "/updateAmountBalance.json", method = RequestMethod.POST)
	public CommonResponse updateAmountBalance(@RequestBody UpdateAmountBalanceRequest request) {
		logger.info(" MobileService.updateAmountBalance ");
		logger.info(" request: " + new Gson().toJson(request));
		
		try {
			mobileService.updateAmountBalance(request);
			CommonResponse res = new CommonResponse();
			res.setCode("S");
			res.setDesc("success");
			logger.info(" response: " + new Gson().toJson(res));
			return res;
		} catch (Exception e) {
			logger.error(e.getMessage());
			CommonResponse response = new CommonResponse();
			response.setCode("E");
			response.setDesc(e.getMessage());
			logger.info(" response: " + new Gson().toJson(response));
			return response;
		}
	}
	*/
	@RequestMapping(value = "/checkOnlineService.json", method = RequestMethod.GET)
	public Integer checkOnlineService() {
		return 0;
	}
}
