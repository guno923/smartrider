package com.smart.rider.spend.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.smart.rider.spend.dto.UtilityDTO;
import com.smart.rider.spend.dto.UtilityPay;
import com.smart.rider.spend.service.UtilityService;
import com.smart.rider.subject.dto.SubjectDTO;

@Controller
public class UtilityController {
	
	@Autowired
	private UtilityService utilityService;
	
	// 지출 화면
	@GetMapping("/spend")
	public String spendUtility(Model model, HttpSession session ,@RequestParam(value = "utilityYear", required = false, defaultValue = "2019") String utilityYear){
		
		String contractShopCode = (String)session.getAttribute("SCODE");
		//System.out.println(contractShopCode + " <-- contractShopCode spendUtility UtilityController.java");
		
		// 지출_공과금 최근 등록내역
		List<UtilityDTO> utilityList = utilityService.utilityList(contractShopCode); 
		model.addAttribute("utilityList", utilityList);
		
		// 지출_공과금 등록 계정과목 select box 리스트
		List<SubjectDTO> subjectList = utilityService.subjectSelectBox();
		model.addAttribute("subjectSelectBox", subjectList);
		
		// 년도에 따른 월별 공과금 지출 금액 
		List<UtilityPay> list = utilityService.utilityPayCheck(utilityYear, contractShopCode);
		//System.out.println(list + " <-- list spendUtility UtilityController.java");
		
		// 년도에 따른 월별 공과금 지출 금액 유무, 값이 없을 시 0원으로 보냄
		for(int i=0; i<12; i++) {
			if(i==0) {
				if(list.get(i) == null) {
					model.addAttribute("utilityJanuary", 0);
				} else {
					model.addAttribute("utilityJanuary", list.get(i).getSumUtility());
				}
			} else if(i==1) {
				if(list.get(i) == null) {
					model.addAttribute("utilityFebruary", 0);
				} else {
					model.addAttribute("utilityFebruary", list.get(i).getSumUtility());
				}
			} else if(i==2) {
				if(list.get(i) == null) {
					model.addAttribute("utilityMarch", 0);
				} else {
					model.addAttribute("utilityMarch", list.get(i).getSumUtility());
				}
			} else if(i==3) {
				if(list.get(i) == null) {
					model.addAttribute("utilityApril", 0);
				} else {
					model.addAttribute("utilityApril", list.get(i).getSumUtility());
				}
			} else if(i==4) {
				if(list.get(i) == null) {
					model.addAttribute("utilityMay", 0);
				} else {
					model.addAttribute("utilityMay", list.get(i).getSumUtility());
				}
			} else if(i==5) {
				if(list.get(i) == null) {
					model.addAttribute("utilityJune", 0);
				} else {
					model.addAttribute("utilityJune", list.get(i).getSumUtility());
				}
			} else if(i==6) {
				if(list.get(i) == null) {
					model.addAttribute("utilityJuly", 0);
				} else {
					model.addAttribute("utilityJuly", list.get(i).getSumUtility());
				}
			} else if(i==7) {
				if(list.get(i) == null) {
					model.addAttribute("utilityAugust", 0);
				} else {
					model.addAttribute("utilityAugust", list.get(i).getSumUtility());
				}
			} else if(i==8) {
				if(list.get(i) == null) {
					model.addAttribute("utilitySeptember", 0);
				} else {
					model.addAttribute("utilitySeptember", list.get(i).getSumUtility());
				}
			} else if(i==9) {
				if(list.get(i) == null) {
					model.addAttribute("utilityOctober", 0);
				} else {
					model.addAttribute("utilityOctober", list.get(i).getSumUtility());
				}
			} else if(i==10) {
				if(list.get(i) == null) {
					model.addAttribute("utilityNovember", 0);
				} else {
					model.addAttribute("utilityNovember", list.get(i).getSumUtility());
				}
			} else if(i==11) {
				if(list.get(i) == null) {
					model.addAttribute("utilityDecember", 0);
				} else {
					model.addAttribute("utilityDecember", list.get(i).getSumUtility());
				}
			}
			
		}
		
		List<UtilityPay> payMax = utilityService.utilityPayMax(utilityYear, contractShopCode);
		model.addAttribute("payMax", payMax.get(0).getSumUtility());
		
		return "spend/spend";
	}
	
	// 지출_공과금 내역 등록
	@PostMapping("/utilityInsert")
	public String utilityInsert(@RequestParam(value = "subjectCode") String subjectCode ,UtilityDTO utilityDTO, HttpSession session) {
		String contractShopCode = (String)session.getAttribute("SCODE");
		//System.out.println(subjectCode + " <-- subjectCode utilityInsert UtilityController.java");
		//System.out.println(utilityDTO.getSpendUtilityPay() + " <-- getSpendUtilityPay() utilityInsert UtilityController.java");
		//System.out.println(utilityDTO.getSpendUtilityContents() + " <-- getSpendUtilityContents() utilityInsert UtilityController.java");
		utilityService.utilityInsert(utilityDTO, contractShopCode);

		return "redirect:/spend";
	}

}
