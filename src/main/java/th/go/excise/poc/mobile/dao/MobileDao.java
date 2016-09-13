package th.go.excise.poc.mobile.dao;

import java.util.List;

import th.go.excise.poc.mobile.model.INCTRGraphInfo;
import th.go.excise.poc.mobile.model.INCTRTableInfo;
import th.go.excise.poc.mobile.model.SearchINCTRRequest;
import th.go.excise.poc.mobile.model.UpdateINCTRRequest;
import th.go.excise.poc.mobile.model.UpdateAmountBalanceBatchRequest;

public interface MobileDao {
	
	public Integer countDataTable(SearchINCTRRequest request);
	
	public List<INCTRTableInfo> getDataTable(SearchINCTRRequest request);
	
	public INCTRGraphInfo getDataGraph(SearchINCTRRequest request);
	
	public void updateData(UpdateINCTRRequest request);
	
	public void updateAmountBalanceBatch(UpdateAmountBalanceBatchRequest request);
}
