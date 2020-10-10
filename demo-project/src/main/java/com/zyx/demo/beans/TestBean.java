package com.zyx.demo.beans;

import com.zyx.demo.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TestBean {
	@Value("雕栏玉砌应犹在")
	private String name;
	@Autowired
	private MyConfig myConfig;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyConfig getMyConfig(){
		return this.myConfig;
	}

	public void sayHello(){
		System.out.println("hello C");
	}
}
