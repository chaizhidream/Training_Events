package com.test;

import java.sql.Connection;

import com.db.DBUtil;

public class TestConnection {
public static void main(String[] args) {
	Connection con=DBUtil.getConnection();
	System.out.println(con);
	//�������Ƿ����
}
}
