package com.org.test;

/*
 * 依赖注入测试类
 */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.entity.Car;
import com.org.entity.CarList;
public class CarTest {
	
		
	@Test
	public void TestThree() {
		String parent = "applicationContext.xml";
		//使用SpringApi进行解耦
		ApplicationContext api = new ClassPathXmlApplicationContext(parent); 
		//注解方式配置的Bean在测试类中需要将类名首字母小写即可获取
		Car car = (Car) api.getBean("car1");
		System.out.println(car);
	}
	
	@Test
	public void TestFour() {
		String parent = "applicationContext.xml";
		//使用SpringApi进行解耦
		ApplicationContext api = new ClassPathXmlApplicationContext(parent); 
		//注解方式配置的Bean在测试类中需要将类名首字母小写即可获取
		CarList car = (CarList) api.getBean("carlist");
		System.out.println(car);
	}
	
}
