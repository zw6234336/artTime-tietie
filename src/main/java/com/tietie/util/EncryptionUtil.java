package com.tietie.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;

/**
 * 
 * 加密模块
 * 
 * @author zhangwei
 *
 *         2016年12月21日
 */
public class EncryptionUtil {

	/**
	 * 根据密码加用户名，实现密码加盐操作
	 * 
	 * @param pwd
	 * @param userCode
	 * @return
	 */
	public static String encryptionUserPwd(String pwd, String userCode) {
		String result = "";
		try {
			result = encoderByMd5(pwd + userCode);
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 利用MD5进行加密
	 * 
	 * @param str
	 *            待加密的字符串
	 * @return 加密后的字符串
	 * @throws NoSuchAlgorithmException
	 *             没有这种产生消息摘要的算法
	 * @throws UnsupportedEncodingException
	 */
	public static String encoderByMd5(String str)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// 确定计算方法
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		Base64 base64en = new Base64();
		// 加密后的字符串
		String newstr = base64en.encodeAsString(md5.digest(str
				.getBytes("utf-8")));
		return newstr;
	}
	
//	public static void main(String[] args) {
//		String pwd = "123456";
//		String userCode = "zhangwei";
//		String result = encryptionUserPwd(pwd,userCode);
//		System.out.println(result);
//		
//		String result1 = encryptionUserPwd(pwd,"");
//		System.out.println(result1);
//	}
}
