package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.service.TestService;

/**
 * @title 测试使用的controller，查询当前时间
 * @author Administrator
 * @date 2018 12 02
 */
@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/test/queryNow")
	@ResponseBody
	public String testQueryNow() {
		return testService.queryNow();
	}
}
