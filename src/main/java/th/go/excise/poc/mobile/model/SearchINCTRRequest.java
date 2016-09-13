package th.go.excise.poc.mobile.model;


public class SearchINCTRRequest {
	
	private Integer start;
	private Integer length;
	private String regId;
	private String receiptDateFrom;
	private String receiptDateTo;
	
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getReceiptDateFrom() {
		return receiptDateFrom;
	}
	public void setReceiptDateFrom(String receiptDateFrom) {
		this.receiptDateFrom = receiptDateFrom;
	}
	public String getReceiptDateTo() {
		return receiptDateTo;
	}
	public void setReceiptDateTo(String receiptDateTo) {
		this.receiptDateTo = receiptDateTo;
	}
	
}
