package com.zyx.demo.starter;

import com.zyx.demo.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Configuration
public class TestMain {

	@RequestMapping("/test")
	public String test(){
		return "success";
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext-common.xml");
//		TestMain test = (TestMain) context.getBean("test");
	}
}
