package com.pages;

import com.tools.Input;

public class Main {

public static void main(String[] args) {

	mainPage();
}


public static void mainPage(){
               
	System.out.println("******欢迎进入模拟12306用户管理系统******");
	System.out.println("请选择：");
	System.out.println("1:注册");
	System.out.println("2:登录");
	System.out.println("按其他键退出系统");
	System.out.println("***********************************");
	String s=null;
	 s=Input.sc.next();

	if (s.matches("1")) {
		System.out.println("进入注册系统");		
	   	Register.userRegister();
	   	Register.userRegisterToMain();
	}else if (s.matches("2")) {
		System.out.println("进入登录系统");
	     Login.userLogin();
	}else{
        System.out.println("退出系统成功！");		
		System.exit(0);
	}


}
}
