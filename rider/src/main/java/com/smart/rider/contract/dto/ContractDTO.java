package com.smart.rider.contract.dto;

public class ContractDTO {

	private String contractCode;
	private String contractUnitCode;
	private String memberId;
	private String contractStart;
	private String contractFinish;
	private String contractValidDate;
	private String contractState;
	private int contractPay;
	private String contractMethod;
	private int contractAmount;
	private int contractUnpaid;
	private String contractInformation;
	private String contractDate;
	
	public String getContractCode() {
		return contractCode;
	}
	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}
	public String getContractUnitCode() {
		return contractUnitCode;
	}
	public void setContractUnitCode(String contractUnitCode) {
		this.contractUnitCode = contractUnitCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getContractStart() {
		return contractStart;
	}
	public void setContractStart(String contractStart) {
		this.contractStart = contractStart;
	}
	public String getContractFinish() {
		return contractFinish;
	}
	public void setContractFinish(String contractFinish) {
		this.contractFinish = contractFinish;
	}
	public String getContractValidDate() {
		return contractValidDate;
	}
	public void setContractValidDate(String contractValid_date) {
		this.contractValidDate = contractValid_date;
	}
	public String getContractState() {
		return contractState;
	}
	public void setContractState(String contractState) {
		this.contractState = contractState;
	}
	public int getContractPay() {
		return contractPay;
	}
	public void setContractPay(int contractPay) {
		this.contractPay = contractPay;
	}
	public String getContractMethod() {
		return contractMethod;
	}
	public void setContractMethod(String contractMethod) {
		this.contractMethod = contractMethod;
	}
	public int getContractAmount() {
		return contractAmount;
	}
	public void setContractAmount(int contractAmount) {
		this.contractAmount = contractAmount;
	}
	public int getContractUnpaid() {
		return contractUnpaid;
	}
	public void setContractUnpaid(int contractUnpaid) {
		this.contractUnpaid = contractUnpaid;
	}

	public String getContractInformation() {
		return contractInformation;
	}
	public void setContractInformation(String contractInformation) {
		this.contractInformation = contractInformation;
	}
	public String getContractDate() {
		return contractDate;
	}
	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}
	@Override
	public String toString() {
		return "ContractDTO [contractCode=" + contractCode + ", contractUnitCode=" + contractUnitCode + ", memberId="
				+ memberId + ", contractStart=" + contractStart + ", contractFinish=" + contractFinish
				+ ", contractValid_date=" + contractValidDate + ", contractState=" + contractState + ", contractPay="
				+ contractPay + ", contractMethod=" + contractMethod + ", contractAmount=" + contractAmount
				+ ", contractUnpaid=" + contractUnpaid + ", contractInformation=" + contractInformation + ", contractDate=" + contractDate + "]";
	}
	
	
	
}
