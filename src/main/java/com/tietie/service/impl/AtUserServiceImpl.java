package com.tietie.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tietie.bean.CommonReturnBean;
import com.tietie.dao.AtUserMapper;
import com.tietie.model.AtUser;
import com.tietie.service.AtUserService;

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
