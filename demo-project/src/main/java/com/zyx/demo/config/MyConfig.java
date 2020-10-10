package com.zyx.demo.config;

import com.zyx.demo.beans.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.zyx.demo")
@EnableAspectJAutoProxy
public class MyConfig {
//	@Bean
//	public TestBean getTestBean() {
//		return new TestBean();
//	}
	@Autowired
	private TestBean testBean;

	public MyConfig() {
		System.out.println(123);
	}

	public TestBean getTestBean() {
		return testBean;
	}

	public void setTestBean(TestBean testBean) {
		this.testBean = testBean;
	}
}
