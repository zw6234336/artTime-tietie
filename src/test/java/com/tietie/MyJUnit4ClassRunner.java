package com.tietie;
import java.io.FileNotFoundException;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

public class MyJUnit4ClassRunner extends SpringJUnit4ClassRunner {
	static {
		try {
			Log4jConfigurer.initLogging("classpath:config/log4j.xml");
		} catch (FileNotFoundException ex) {
			System.err.println("Cannot Initialize log4j");
		}
	}

	public MyJUnit4ClassRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
	}

}
