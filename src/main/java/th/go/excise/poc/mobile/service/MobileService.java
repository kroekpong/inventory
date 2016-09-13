package th.go.excise.poc.mobile.service;

import th.co.baiwa.framework.common.bean.DataTableAjax;
import th.go.excise.poc.mobile.model.INCTRGraphInfo;
import th.go.excise.poc.mobile.model.INCTRTableInfo;
import th.go.excise.poc.mobile.model.SearchINCTRRequest;
import th.go.excise.poc.mobile.model.UpdateINCTRRequest;
import th.go.excise.poc.mobile.model.UpdateAmountBalanceBatchRequest;
import th.go.excise.poc.mobile.model.UpdateAmountBalanceRequest;

public interface MobileService {
	
	public DataTableAjax<INCTRTableInfo> getDataTable(SearchINCTRRequest request);
	
	public INCTRGraphInfo getDataGraph(SearchINCTRRequest request);
	
	public void updateData(UpdateINCTRRequest request);
	
	public void updateAmountBalanceBatch(UpdateAmountBalanceBatchRequest request);
	
	public void updateAmountBalance(UpdateAmountBalanceRequest request);
	
}
