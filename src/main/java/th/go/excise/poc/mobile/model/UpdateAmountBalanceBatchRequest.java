package th.go.excise.poc.mobile.model;

import java.util.List;

public class UpdateAmountBalanceBatchRequest {
	private List<UpdateAmountBalanceRequest> list;

	public List<UpdateAmountBalanceRequest> getList() {
		return list;
	}

	public void setList(List<UpdateAmountBalanceRequest> list) {
		this.list = list;
	}
	
}
