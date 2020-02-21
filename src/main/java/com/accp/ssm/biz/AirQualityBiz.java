package com.accp.ssm.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.ssm.dao.IAirQualityDao;
import com.accp.ssm.pojo.Air_quality_index;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AirQualityBiz {

	@Resource
	private IAirQualityDao dao;
	
	public PageInfo<Air_quality_index> getAirQualityListByPage(Integer pageNum, Integer pageSize, Integer qu){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Air_quality_index>(dao.queryAirQuality(qu));
	}
	
	//@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	
	
}
