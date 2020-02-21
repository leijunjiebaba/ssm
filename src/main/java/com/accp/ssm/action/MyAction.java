package com.accp.ssm.action;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.ssm.biz.AirQualityBiz;
import com.accp.ssm.pojo.Air_quality_index;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/AirQuality")
@SuppressWarnings("all")
public class MyAction {

	@Resource
	private AirQualityBiz biz;
	
	@GetMapping("/{num}/{size}/{qu}")
	public PageInfo<Air_quality_index> getAirQualityListByPage(@PathVariable Integer num,@PathVariable Integer size,@PathVariable Integer qu) {
		return biz.getAirQualityListByPage(num, size, qu);
	}
	
	
	
}
