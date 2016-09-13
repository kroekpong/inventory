package th.go.excise.poc.mobile.model;

public class UpdateAmountBalanceRequest {
	
	private String incctlNo;
	private Double amount;
	
	public String getIncctlNo() {
		return incctlNo;
	}
	public void setIncctlNo(String incctlNo) {
		this.incctlNo = incctlNo;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}

}
