package com.tietie.service;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.tietie.MyJUnit4ClassRunner;
import com.tietie.bean.CommonReturnBean;
import com.tietie.model.AtUser;

@RunWith(MyJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration(locations = { "classpath:config/spring-config.xml",
		"classpath:config/spring-config-db.xml",
		"classpath:config/spring-mvc-config.xml",
		"classpath:config/sqlMapConfig.xml" })
public class AtUserServiceTest {

	@Autowired
	private AtUserService service;
	
	
	@Test
	@Transactional
	public void testRegistHandlWrong() {
		AtUser record = new AtUser();
		record.setName("张三400");
		record.setCode("zhangwei0404");
		record.setCreateTime(new Date());
		record.setMail("zhangwei@sina.cn");
		record.setPhone("13426847877");
		record.setSex(1);
		record.setState(1);
		record.setPwd("123");
		CommonReturnBean result = service.userRegist(record);

		int actual = result.getCode();
		int expected = 100400;
		Assert.assertEquals(expected, actual);
		System.out.println("444444444444444444444444444444444444444444444444");
	}

	@Test
	public void testRegistHandlRight() {
		AtUser record = new AtUser();
		record.setCode("zhangwei0404");
		record.setCreateTime(new Date());
		record.setModifyTime(new Date());
		record.setMail("zhangwei@sina.cn");
		record.setPhone("13426847877");
		record.setSex(1);
		record.setState(1);
		record.setPwd("123456");
		CommonReturnBean result = service.userRegist(record);

		int actual = result.getCode();
		int expected = 100200;
		Assert.assertEquals(expected, actual);
		System.out.println("22222222222222222222222222222222222222222222222");

	}

	@Test
	@Transactional
	public void testRegistHandlIdWrong() {
		AtUser record = new AtUser();
		record.setName("张三500");
		record.setCode("zhangwei0404");
		record.setCreateTime(new Date());
		record.setMail("zhangwei@sina.cn");
		record.setPhone("13426847877");
		record.setState(1);
		record.setPwd("123456");
		CommonReturnBean result = service.userRegist(record);

		int actual = result.getCode();
		int expected = 100500;
		Assert.assertEquals(expected, actual);
		System.out
				.println("5555555555555555555555555555555555555555555555555555555555");
	}
	
	
	@Test
	public void testUserLogin(){
		CommonReturnBean result  = service.userLogin("zhangwei0404", "123145678");
		int expected = result.getCode();
		int actual = 100200;
		Assert.assertEquals(expected, actual);
	}
}
