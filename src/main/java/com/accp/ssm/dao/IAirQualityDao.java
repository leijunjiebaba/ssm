package com.accp.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.ssm.pojo.Air_quality_index;

public interface IAirQualityDao {

	List<Air_quality_index> queryAirQuality(@Param("qu")Integer qu);
	
	
	
	
	
	
	
}
