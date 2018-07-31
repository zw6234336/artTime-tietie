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
	public CommonReturnBean userRegist(AtUser userModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommonReturnBean userLogin(String userCode, String pwd) {
		return null;
	}

	@Override
	public CommonReturnBean userCancelled(String userCode, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
