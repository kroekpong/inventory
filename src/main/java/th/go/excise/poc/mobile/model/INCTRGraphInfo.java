package th.go.excise.poc.mobile.model;

import java.util.List;


public class INCTRGraphInfo {
	
	private List<String> monthEN;
	private List<String> monthTH;
	private List<Double> sumAmount;
	
	public List<String> getMonthEN() {
		return monthEN;
	}
	public void setMonthEN(List<String> monthEN) {
		this.monthEN = monthEN;
	}
	public List<String> getMonthTH() {
		return monthTH;
	}
	public void setMonthTH(List<String> monthTH) {
		this.monthTH = monthTH;
	}
	public List<Double> getSumAmount() {
		return sumAmount;
	}
	public void setSumAmount(List<Double> sumAmount) {
		this.sumAmount = sumAmount;
	}
	
}
