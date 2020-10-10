package com.zyx.demo.starter;

import com.zyx.demo.beans.TestBean;
import com.zyx.demo.config.MyConfig;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@Configuration
public class TestMain {

	@RequestMapping("/test")
	public String test(){
		return "success";
	}

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext-common.xml");
////		TestBean test = (TestBean) context.getBean(TestBean.class);
//		MyConfig myConfig = (MyConfig) context.getBean(MyConfig.class);
//		System.out.println("123");

//		//创建一个简单注册器
//		BeanDefinitionRegistry register = new SimpleBeanDefinitionRegistry();
////创建bean定义读取器
//		BeanDefinitionReader reader = new XmlBeanDefinitionReader(register);
//// 创建资源读取器
//		DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
//// 获取资源
//		Resource xmlResource = resourceLoader.getResource("appContext-common.xml");
//// 装载Bean的定义
//		reader.loadBeanDefinitions(xmlResource);
//// 打印构建的Bean 名称
//		System.out.println(Arrays.toString(register.getBeanDefinitionNames()));

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		TestBean bean = annotationConfigApplicationContext.getBean(TestBean.class);
		bean.sayHello();
	}
}
