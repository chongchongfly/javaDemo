package com.accp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accp.Printer;

public class Test {

	public static void main(String[] args) {
		// 启动Spring容器
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		//得到 打印机
		Printer printer=(Printer)act.getBean("printer");
		//打印功能
		printer.print("测试。。。。。");

	}

}
