package com.smart.rider.goods.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smart.rider.goods.dto.GoodsdbDTO;
import com.smart.rider.goods.mapper.GoodsdbMapper;



@Service
@Transactional
public class GoodsdbService {
	@Autowired
	private GoodsdbMapper goodsdbmapper;
	
	//상품DB상세조회 위해 코드가져오기위한 메서드
	public GoodsdbDTO getGoodsDbCode(String goodsDbCode) {
		
		return goodsdbmapper.getGoodsDbCode(goodsDbCode);
	}

	//03 상품DB리스트 조회 메서드선언
	public List<GoodsdbDTO> goodsDbList() {
		
		return goodsdbmapper.goodsDbList();
	}
	
	
	//02
	//코드자동추가메서드를 합하여 상품db등록 메서드선언 
	//dto멤버아이디에 세션 셋팅
	//19-19-10 문영성
	public int goodsDbInsert(GoodsdbDTO goodsdbdto, HttpSession session) { 
		int  max = goodsdbmapper.getGoodsDbCodeMax()+1;
		String tempCode ="goods_database_code";

		goodsdbdto.setMemberId((String) session.getAttribute("SID"));
		goodsdbdto.setGoodsDbCode(tempCode+max);

		return goodsdbmapper.goodsDbInsert(goodsdbdto);

	}

	//01첫번쨰
	// 상품DB등록 확인메서드
	/*
	 * public int goodsDbInsert(GoodsdbDTO goodsdbdto) {
	 * 
	 * return goodsdbmapper.goodsDbInsert(goodsdbdto);
	 * 
	 * }
	 */



}
