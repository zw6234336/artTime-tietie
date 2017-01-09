package com.tietie.action;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tietie.MyJUnit4ClassRunner;

@RunWith(MyJUnit4ClassRunner.class)
@WebAppConfiguration(value = "src/main/webapp")
@ContextConfiguration(locations = { "classpath:config/spring-config.xml",
		"classpath:config/spring-config-db.xml",
		"classpath:config/spring-mvc-config.xml",
		"classpath:config/sqlMapConfig.xml" })
public class AtUserActionTest {

	private MockHttpServletRequest request;
	private MockHttpServletResponse response;

	@Autowired
	private AtUserAction action;

	@Before
	public void setUp() throws UnsupportedEncodingException {
		request = new MockHttpServletRequest();
		request.setCharacterEncoding("UTF-8");
		response = new MockHttpServletResponse();
	}

	@Test
	public void testLoginRight() throws Exception {
		String username = "zhangwei0404";
		String password = "123456";
		String actual = action.login(request, username, password).getStatus();
		String expected = "ok";
		
		String token = (String) request.getSession().getAttribute("token");
		System.out.println(token);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLoginWrong() throws Exception {
		String username = "zhangwei0404";
		String password = "1234561";
		String actual = action.login(request, username, password).getStatus();
		String expected = "error";
		assertEquals(expected, actual);
	}

}
