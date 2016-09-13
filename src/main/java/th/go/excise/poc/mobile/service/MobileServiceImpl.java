package th.go.excise.poc.mobile.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import th.co.baiwa.framework.common.bean.DataTableAjax;
import th.go.excise.poc.mobile.dao.MobileDao;
import th.go.excise.poc.mobile.model.INCTRGraphInfo;
import th.go.excise.poc.mobile.model.INCTRTableInfo;
import th.go.excise.poc.mobile.model.SearchINCTRRequest;
import th.go.excise.poc.mobile.model.UpdateINCTRRequest;
import th.go.excise.poc.mobile.model.UpdateAmountBalanceBatchRequest;
import th.go.excise.poc.mobile.model.UpdateAmountBalanceRequest;

@Service("mobileService")
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	private MobileDao mobileDao;

	@Override
	public DataTableAjax<INCTRTableInfo> getDataTable(SearchINCTRRequest request) {

		DataTableAjax<INCTRTableInfo> dataTable = new DataTableAjax<INCTRTableInfo>();
		List<INCTRTableInfo> dataInfos = mobileDao.getDataTable(request);
		Integer recordsTotal = mobileDao.countDataTable(request);
		
		dataTable.setData(dataInfos);
		dataTable.setRecordsTotal(recordsTotal);
		
		return dataTable;
	}

	@Override
	public INCTRGraphInfo getDataGraph(SearchINCTRRequest request) {
		return mobileDao.getDataGraph(request);
	}

	@Override
	public void updateData(UpdateINCTRRequest request) {
		mobileDao.updateData(request);
	}

	@Override
	public void updateAmountBalanceBatch(UpdateAmountBalanceBatchRequest request) {
		mobileDao.updateAmountBalanceBatch(request);
	}
	
	@Override
	public void updateAmountBalance(UpdateAmountBalanceRequest request) {
		
		UpdateAmountBalanceBatchRequest r = new UpdateAmountBalanceBatchRequest();
		List<UpdateAmountBalanceRequest> list = new ArrayList<UpdateAmountBalanceRequest>();
		list.add(request);
		r.setList(list);
		
		mobileDao.updateAmountBalanceBatch(r);
	}
}
