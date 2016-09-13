package th.go.excise.poc.mobile.model;


public class UpdateINCTRRequest {

	private String incctlNo;//not null, pk
	private Integer incctlSeq;//not null
	private String trnDate;//not null, dd/mm/yyyy
	private String customerId;// fk of customer table.
	private String regId;
	private String facId;
	private String offcodeRec;//not null
	private String offcodeOwn;//not null
	private String offcode;//not null
	private Integer taxMonth;
	private Integer taxYear;
	private Integer budgetMonth;//not null
	private Integer budgetYear;//not null
	private String incCode;//not null
	private String incType;
	private Double taxAmount;//not null default '0.00'
	private Double reduceAmt;//default '0.00'
	private Double penAmt;//default '0.00'
	private Double addAmt;//default '0.00'
	private Double locAmt;//default '0.00'
	private Double creditEd;//default '0.00'
	private Double creditMoi;//default '0.00'
	private Double nettaxAmt;//not null, default '0.00',
	private Double netlocAmt;//default '0.00',
	private Double paidAmt;//not null default '0.00',
	private Double locRate;
	private Double locothRate;
	private Double locexpRate;
	private Double locothAmt;
	private Double locexpAmt;
	private Double customAmt;//not null default '0.00',
	private Double cashAmt;//not null default '0.00',
	private Double chqAmt;//not null default '0.00',
	private Double chqtAmt;//not null default '0.00',
	private Double noteAmt;//not null default '0.00',
	private Double difAmt;//default '0.00',
	private Integer schNo;
	private Integer cntNum;
	private String formCode;
	private String docctlNo;
	private String closeStatus;//not null
	private String chassisNo;
	private String engineNo;
	private String sysFrom;
	private String docrefNo;
	private Integer seqNo;
	private String receiptNo;
	private String receiptDate;//dd/mm/yyyy
	private String incimpFlag;//not null
	private String chqrtnStatus;//not null
	private String anaDate;//dd/mm/yyyy
	private String cancelStatus;//not null
	private String cancelUserid;
	private String cancelDate;//dd/mm/yyyy
	private String refDate;//dd/mm/yyyy
	private String updUserid;//not null
	private String updDate;//not null, dd/mm/yyyy
	private Double bribeAmt;
	private Double rewardAmt;
	private String remark;
	private String impdocNo;
	private String impdocDate;//dd/mm/yyyy
	private String tariffNo;
	private String tariffDate;//dd/mm/yyyy
	private Double locAmtSys;//default '0.00',
	private String schDate;//dd/mm/yyyy
	private Double prnstampAmt;//default '0.00',
	private String brandName;
	private Double amountBalance;
	public String getIncctlNo() {
		return incctlNo;
	}
	public void setIncctlNo(String incctlNo) {
		this.incctlNo = incctlNo;
	}
	public Integer getIncctlSeq() {
		return incctlSeq;
	}
	public void setIncctlSeq(Integer incctlSeq) {
		this.incctlSeq = incctlSeq;
	}
	public String getTrnDate() {
		return trnDate;
	}
	public void setTrnDate(String trnDate) {
		this.trnDate = trnDate;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
	public String getFacId() {
		return facId;
	}
	public void setFacId(String facId) {
		this.facId = facId;
	}
	public String getOffcodeRec() {
		return offcodeRec;
	}
	public void setOffcodeRec(String offcodeRec) {
		this.offcodeRec = offcodeRec;
	}
	public String getOffcodeOwn() {
		return offcodeOwn;
	}
	public void setOffcodeOwn(String offcodeOwn) {
		this.offcodeOwn = offcodeOwn;
	}
	public String getOffcode() {
		return offcode;
	}
	public void setOffcode(String offcode) {
		this.offcode = offcode;
	}
	public Integer getTaxMonth() {
		return taxMonth;
	}
	public void setTaxMonth(Integer taxMonth) {
		this.taxMonth = taxMonth;
	}
	public Integer getTaxYear() {
		return taxYear;
	}
	public void setTaxYear(Integer taxYear) {
		this.taxYear = taxYear;
	}
	public Integer getBudgetMonth() {
		return budgetMonth;
	}
	public void setBudgetMonth(Integer budgetMonth) {
		this.budgetMonth = budgetMonth;
	}
	public Integer getBudgetYear() {
		return budgetYear;
	}
	public void setBudgetYear(Integer budgetYear) {
		this.budgetYear = budgetYear;
	}
	public String getIncCode() {
		return incCode;
	}
	public void setIncCode(String incCode) {
		this.incCode = incCode;
	}
	public String getIncType() {
		return incType;
	}
	public void setIncType(String incType) {
		this.incType = incType;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Double getReduceAmt() {
		return reduceAmt;
	}
	public void setReduceAmt(Double reduceAmt) {
		this.reduceAmt = reduceAmt;
	}
	public Double getPenAmt() {
		return penAmt;
	}
	public void setPenAmt(Double penAmt) {
		this.penAmt = penAmt;
	}
	public Double getAddAmt() {
		return addAmt;
	}
	public void setAddAmt(Double addAmt) {
		this.addAmt = addAmt;
	}
	public Double getLocAmt() {
		return locAmt;
	}
	public void setLocAmt(Double locAmt) {
		this.locAmt = locAmt;
	}
	public Double getCreditEd() {
		return creditEd;
	}
	public void setCreditEd(Double creditEd) {
		this.creditEd = creditEd;
	}
	public Double getCreditMoi() {
		return creditMoi;
	}
	public void setCreditMoi(Double creditMoi) {
		this.creditMoi = creditMoi;
	}
	public Double getNettaxAmt() {
		return nettaxAmt;
	}
	public void setNettaxAmt(Double nettaxAmt) {
		this.nettaxAmt = nettaxAmt;
	}
	public Double getNetlocAmt() {
		return netlocAmt;
	}
	public void setNetlocAmt(Double netlocAmt) {
		this.netlocAmt = netlocAmt;
	}
	public Double getPaidAmt() {
		return paidAmt;
	}
	public void setPaidAmt(Double paidAmt) {
		this.paidAmt = paidAmt;
	}
	public Double getLocRate() {
		return locRate;
	}
	public void setLocRate(Double locRate) {
		this.locRate = locRate;
	}
	public Double getLocothRate() {
		return locothRate;
	}
	public void setLocothRate(Double locothRate) {
		this.locothRate = locothRate;
	}
	public Double getLocexpRate() {
		return locexpRate;
	}
	public void setLocexpRate(Double locexpRate) {
		this.locexpRate = locexpRate;
	}
	public Double getLocothAmt() {
		return locothAmt;
	}
	public void setLocothAmt(Double locothAmt) {
		this.locothAmt = locothAmt;
	}
	public Double getLocexpAmt() {
		return locexpAmt;
	}
	public void setLocexpAmt(Double locexpAmt) {
		this.locexpAmt = locexpAmt;
	}
	public Double getCustomAmt() {
		return customAmt;
	}
	public void setCustomAmt(Double customAmt) {
		this.customAmt = customAmt;
	}
	public Double getCashAmt() {
		return cashAmt;
	}
	public void setCashAmt(Double cashAmt) {
		this.cashAmt = cashAmt;
	}
	public Double getChqAmt() {
		return chqAmt;
	}
	public void setChqAmt(Double chqAmt) {
		this.chqAmt = chqAmt;
	}
	public Double getChqtAmt() {
		return chqtAmt;
	}
	public void setChqtAmt(Double chqtAmt) {
		this.chqtAmt = chqtAmt;
	}
	public Double getNoteAmt() {
		return noteAmt;
	}
	public void setNoteAmt(Double noteAmt) {
		this.noteAmt = noteAmt;
	}
	public Double getDifAmt() {
		return difAmt;
	}
	public void setDifAmt(Double difAmt) {
		this.difAmt = difAmt;
	}
	public Integer getSchNo() {
		return schNo;
	}
	public void setSchNo(Integer schNo) {
		this.schNo = schNo;
	}
	public Integer getCntNum() {
		return cntNum;
	}
	public void setCntNum(Integer cntNum) {
		this.cntNum = cntNum;
	}
	public String getFormCode() {
		return formCode;
	}
	public void setFormCode(String formCode) {
		this.formCode = formCode;
	}
	public String getDocctlNo() {
		return docctlNo;
	}
	public void setDocctlNo(String docctlNo) {
		this.docctlNo = docctlNo;
	}
	public String getCloseStatus() {
		return closeStatus;
	}
	public void setCloseStatus(String closeStatus) {
		this.closeStatus = closeStatus;
	}
	public String getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	public String getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public String getSysFrom() {
		return sysFrom;
	}
	public void setSysFrom(String sysFrom) {
		this.sysFrom = sysFrom;
	}
	public String getDocrefNo() {
		return docrefNo;
	}
	public void setDocrefNo(String docrefNo) {
		this.docrefNo = docrefNo;
	}
	public Integer getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}
	public String getReceiptNo() {
		return receiptNo;
	}
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	public String getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}
	public String getIncimpFlag() {
		return incimpFlag;
	}
	public void setIncimpFlag(String incimpFlag) {
		this.incimpFlag = incimpFlag;
	}
	public String getChqrtnStatus() {
		return chqrtnStatus;
	}
	public void setChqrtnStatus(String chqrtnStatus) {
		this.chqrtnStatus = chqrtnStatus;
	}
	public String getAnaDate() {
		return anaDate;
	}
	public void setAnaDate(String anaDate) {
		this.anaDate = anaDate;
	}
	public String getCancelStatus() {
		return cancelStatus;
	}
	public void setCancelStatus(String cancelStatus) {
		this.cancelStatus = cancelStatus;
	}
	public String getCancelUserid() {
		return cancelUserid;
	}
	public void setCancelUserid(String cancelUserid) {
		this.cancelUserid = cancelUserid;
	}
	public String getCancelDate() {
		return cancelDate;
	}
	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}
	public String getRefDate() {
		return refDate;
	}
	public void setRefDate(String refDate) {
		this.refDate = refDate;
	}
	public String getUpdUserid() {
		return updUserid;
	}
	public void setUpdUserid(String updUserid) {
		this.updUserid = updUserid;
	}
	public String getUpdDate() {
		return updDate;
	}
	public void setUpdDate(String updDate) {
		this.updDate = updDate;
	}
	public Double getBribeAmt() {
		return bribeAmt;
	}
	public void setBribeAmt(Double bribeAmt) {
		this.bribeAmt = bribeAmt;
	}
	public Double getRewardAmt() {
		return rewardAmt;
	}
	public void setRewardAmt(Double rewardAmt) {
		this.rewardAmt = rewardAmt;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getImpdocNo() {
		return impdocNo;
	}
	public void setImpdocNo(String impdocNo) {
		this.impdocNo = impdocNo;
	}
	public String getImpdocDate() {
		return impdocDate;
	}
	public void setImpdocDate(String impdocDate) {
		this.impdocDate = impdocDate;
	}
	public String getTariffNo() {
		return tariffNo;
	}
	public void setTariffNo(String tariffNo) {
		this.tariffNo = tariffNo;
	}
	public String getTariffDate() {
		return tariffDate;
	}
	public void setTariffDate(String tariffDate) {
		this.tariffDate = tariffDate;
	}
	public Double getLocAmtSys() {
		return locAmtSys;
	}
	public void setLocAmtSys(Double locAmtSys) {
		this.locAmtSys = locAmtSys;
	}
	public String getSchDate() {
		return schDate;
	}
	public void setSchDate(String schDate) {
		this.schDate = schDate;
	}
	public Double getPrnstampAmt() {
		return prnstampAmt;
	}
	public void setPrnstampAmt(Double prnstampAmt) {
		this.prnstampAmt = prnstampAmt;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Double getAmountBalance() {
		return amountBalance;
	}
	public void setAmountBalance(Double amountBalance) {
		this.amountBalance = amountBalance;
	}
}
