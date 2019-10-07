package com.smart.rider.spend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smart.rider.spend.dto.SpendAdminDTO;

@Mapper
public interface SpendMapper {
	
	/**** 191004 재욱, Read : 관리자 확인 카운트, 2일 때 관리자 비밀번호와 점주 생년월일 일치 ****/
	public int spendAdminCheck(String contractShopCode, String memberBirth, String adminPw);
	
	/**** 191004 재욱, Read : 계약된 매장 리스트 상세보기 ****/
	public List<SpendAdminDTO> spendAdminDetails(String contractShopCode);
	
	/**** 191004 재욱, Read : 계약된 매장 리스트  ****/
	public List<SpendAdminDTO> spendAdmin();

}
