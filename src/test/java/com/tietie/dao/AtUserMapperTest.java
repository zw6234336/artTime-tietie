package com.tietie.dao;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tietie.MyJUnit4ClassRunner;
import com.tietie.model.AtUser;


@RunWith(MyJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration(locations = { "classpath:config/spring-config.xml",
		"classpath:config/spring-config-db.xml",
		"classpath:config/spring-mvc-config.xml",
		"classpath:config/sqlMapConfig.xml" })
public class AtUserMapperTest {

	@Autowired
	private AtUserMapper dao;
	
	
	@Test
    public void selectByPrimaryKey(){
		AtUser result = dao.selectByPrimaryKey(2);
		String expected ="";
		String actual = result.getName();
		Assert.assertEquals(expected, actual);
    	
    }
	
	@Test
    public void selectByCodePwd(){
		Map<String,String> param = new HashMap<String, String>();
		param.put("code", "zhangwei0404");
		param.put("pwd", "PjqFfeTJC0YcA+bHSghJSw==");
		Map<String,Integer> result = dao.selectByCodePwd(param);
		int expected =6;
		int actual = result.get("id");
		Assert.assertEquals(expected, actual);
    	
    }

}