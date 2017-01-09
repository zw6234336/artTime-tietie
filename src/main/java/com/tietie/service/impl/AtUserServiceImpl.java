package com.tietie.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tietie.bean.CommonReturnBean;
import com.tietie.dao.AtUserMapper;
import com.tietie.enumm.SystemCodeEnum;
import com.tietie.model.AtUser;
import com.tietie.service.AtUserService;
import com.tietie.util.EncryptionUtil;

@Service
public class AtUserServiceImpl implements AtUserService {

	@Resource
	private AtUserMapper userDao;

	@Override
	@Transactional
	public CommonReturnBean userRegist(AtUser userModel) {
		CommonReturnBean result = new CommonReturnBean();

		// action校验参数

		// Set<ConstraintViolation<AtUser>> constraintViolations =
		// ValidationUtil.getValidation().validate(userModel);
		// if (constraintViolations.size() == 0) {
		// } else {
		// result.setCode(SystemCodeEnum.PARAMETER_ERROR.getc);
		// for (ConstraintViolation<AtUser> constraintViolation :
		// constraintViolations) {
		// System.out.println(constraintViolation.getMessage());
		// result.setMessage(constraintViolation.getMessage());
		// }
		// }
		try {

			// 加密操作
			userModel
					.setPwd(encodePwd(userModel.getPwd(), userModel.getCode()));
			userDao.insert(userModel);
			result.setCode(SystemCodeEnum.SUCCESS.getCode());
		} catch (Exception e) {
			result.setCode(SystemCodeEnum.DATABASE_ERROR.getCode());
			e.printStackTrace();
		}

		return result;
	}

	private String encodePwd(String pwd, String code) {
		return EncryptionUtil.encryptionUserPwd(pwd, code);
	}

	@Override
	public CommonReturnBean userLogin(String userCode, String pwd) {
		CommonReturnBean result = new CommonReturnBean();
		String newPwd = encodePwd(pwd, userCode);
		Map<String, String> param = new HashMap<String, String>();
		param.put("code", userCode);
		param.put("pwd", newPwd);
		Map<String,Integer> tempResult = userDao.selectByCodePwd(param);
		if (tempResult.get("id")!=null) {
			result.setCode(SystemCodeEnum.SUCCESS.getCode());
			
			Map<String,Object> tempMap = new HashMap<String, Object>();
			tempMap.put("id", tempResult.get("id"));
			result.setCommonEntity(tempMap);
		} else {
			result.setCode(SystemCodeEnum.PARAMETER_ERROR.getCode());
		}

		return result;
	}

	@Override
	public CommonReturnBean userCancelled(String userCode, String pwd) {
		CommonReturnBean result = new CommonReturnBean();
		Map<String, String> param = new HashMap<String, String>();
		param.put("code", userCode);
		param.put("pwd", pwd);
		int tempResult = userDao.updateByCodePwd(param);
		if (tempResult == 1) {
			result.setCode(SystemCodeEnum.SUCCESS.getCode());
		} else {
			result.setCode(SystemCodeEnum.PARAMETER_ERROR.getCode());
		}
		return null;
	}
}
