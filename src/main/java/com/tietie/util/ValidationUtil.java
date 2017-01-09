package com.tietie.util;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * 参数校验公共方法
 * 
 * @author zhangwei
 *
 * 2017年1月6日
 */
public class ValidationUtil {

	public static Validator getValidation() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		return validator;
	}
}
