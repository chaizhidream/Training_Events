package com.pages;

import com.tools.Input;

public class Main {

public static void main(String[] args) {

	mainPage();
}


public static void mainPage(){
               
	System.out.println("******��ӭ����ģ��12306�û�����ϵͳ******");
	System.out.println("��ѡ��");
	System.out.println("1:ע��");
	System.out.println("2:��¼");
	System.out.println("���������˳�ϵͳ");
	System.out.println("***********************************");
	String s=null;
	 s=Input.sc.next();

	if (s.matches("1")) {
		System.out.println("����ע��ϵͳ");		
	   	Register.userRegister();
	   	Register.userRegisterToMain();
	}else if (s.matches("2")) {
		System.out.println("�����¼ϵͳ");
	     Login.userLogin();
	}else{
        System.out.println("�˳�ϵͳ�ɹ���");		
		System.exit(0);
	}


}
}
