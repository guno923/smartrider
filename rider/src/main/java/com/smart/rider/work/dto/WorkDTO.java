package com.smart.rider.work.dto;

import com.smart.rider.member.dto.MemberDTO;

public class WorkDTO extends MemberDTO{
	
	private String workCode;
	private String contractShopCode;
	private String memberId;
	private String workStart;
	private String workFinish;
	private String workOver;
	private String workTotal;
	private String workRest;
	private String workDate;
	public String getWorkCode() {
		return workCode;
	}
	public void setWorkCode(String workCode) {
		this.workCode = workCode;
	}
	public String getContractShopCode() {
		return contractShopCode;
	}
	public void setContractShopCode(String contractShopCode) {
		this.contractShopCode = contractShopCode;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getWorkStart() {
		return workStart;
	}
	public void setWorkStart(String workStart) {
		this.workStart = workStart;
	}
	public String getWorkFinish() {
		return workFinish;
	}
	public void setWorkFinish(String workFinish) {
		this.workFinish = workFinish;
	}
	public String getWorkOver() {
		return workOver;
	}
	public void setWorkOver(String workOver) {
		this.workOver = workOver;
	}
	public String getWorkTotal() {
		return workTotal;
	}
	public void setWorkTotal(String workTotal) {
		this.workTotal = workTotal;
	}
	public String getWorkRest() {
		return workRest;
	}
	public void setWorkRest(String workRest) {
		this.workRest = workRest;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	@Override
	public String toString() {
		return "WorkDTO [workCode=" + workCode + ", contractShopCode=" + contractShopCode + ", memberId=" + memberId
				+ ", workStart=" + workStart + ", workFinish=" + workFinish + ", workOver=" + workOver + ", workTotal="
				+ workTotal + ", workRest=" + workRest + ", workDate=" + workDate + "]";
	}
	
}
