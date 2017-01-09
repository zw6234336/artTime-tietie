package com.tietie.action;

import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tietie.bean.ActionReturnBean;
import com.tietie.bean.CommonReturnBean;
import com.tietie.enumm.SystemCodeEnum;
import com.tietie.service.AtUserService;



/**
 * 
 * @author zhangwei
 *
 * 2016年12月30日
 */

@Controller
@RequestMapping( "/user" )
public class AtUserAction {
	
	@Resource
	private AtUserService userService;
	
	
	/**
	 * @param request session
	 * @param code 用户名 
	 * @param pwd 用户密码
	 * @param vCode 验证码 TODO
	 * @return
	 */
	@RequestMapping( name="/login",method=RequestMethod.POST )
	@ResponseBody
	public ActionReturnBean login(HttpServletRequest request,String code,String pwd){
		ActionReturnBean result = new ActionReturnBean();
		HttpSession session = request.getSession();
		
		try {
			CommonReturnBean tempResult = userService.userLogin(code, pwd);
			if(tempResult.getCode()==SystemCodeEnum.SERVER_ERROR.getCode()){
				result.setStatus("error");
				result.setMessage("服务器繁忙请重试");
			}else{
				result.setStatus("ok");
				session.setAttribute("id", tempResult.getCommonEntity().get("id"));
				session.setAttribute("token", UUID.randomUUID().toString());
			}
		} catch (Exception e) {
			result.setStatus("error");
			result.setMessage("服务器繁忙请重试");
		}
		return result;
	}
	

}
