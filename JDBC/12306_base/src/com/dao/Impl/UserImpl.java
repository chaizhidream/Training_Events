package com.dao.Impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.I.IUser;
import com.db.DBUtil;
import com.model.User;
import com.pages.Register;
import com.tools.Input;



public class UserImpl implements IUser {
static Connection con=null;
static PreparedStatement ps=null;
static ResultSet rs=null;

@Override
public int addUser(User user) throws SQLException {
	//SQL���,����������
			String sql = "INSERT INTO tab_user VALUES (sq1.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
			int row = 0;

			try {
				con=DBUtil.getConnection();
				ps = con.prepareStatement(sql);
				ps.setString(1, user.getUsername());
				ps.setString(2, user.getPsd());
				ps.setInt(3, user.getRu());
				ps.setString(4, user.getRealname());
				ps.setInt(5, user.getSex());
				ps.setString(6, user.getCityname());
				ps.setInt(7, user.getCtypeID());
				ps.setString(8, user.getCert());
				ps.setDate(9,
						new java.sql.Date(user.getBirthday().getTime()));
				ps.setInt(10, user.getUtype());
				ps.setString(11, user.getInformation());
				ps.setInt(12, user.getStatus());
				ps.setString(13, user.getLoginIp());
				ps.setString(14, user.getImagePath());

				row = ps.executeUpdate();
				if (row>0) {
					System.out.println("ע��ɹ���");
				} else {
					System.out.println("ע��ʧ�ܣ�");
				}
			} finally {
				DBUtil.closeConnection(rs, ps, con);
			}
			return row;
}
@SuppressWarnings("deprecation")
@Override
public boolean updateUser() throws SQLException {
	String uname=Input.sc.nextLine();
	System.out.println("�������û���");
//	String uname=Input.sc.nextLine();
	
	if(!Register.checkUsername(uname)){
		
	}else {
		System.out.println("�û��������ڣ�����������");
		updateUser();
		return false;
	}
	String s1;
	//����Ӧ�ü���while ѭ���ж�ѡ�������ݿ����Ƿ��ж�Ӧ��
	while (true) {
		System.out.println("������Ҫ�޸ĵ�ѡ�");
		System.out.println("1:����");
		System.out.println("2:��ʵ����");
		System.out.println("3:�Ա�");
		System.out.println("4:��������");
		System.out.println("5:֤������");
		System.out.println("6:֤����");
		System.out.println("7:����");
		System.out.println("8:�ÿ�����");
		System.out.println("9:��ע��Ϣ");
		System.out.println("10:ͷ���ַ");
		s1=Input.sc.nextLine();
		if (s1.equals("1")||s1.equals("2")||
				s1.equals("3")||s1.equals("4")||
				s1.equals("5")||s1.equals("6")||
				s1.equals("7")||s1.equals("8")||
				s1.equals("9")||s1.equals("10")){
			break;
		}
		System.out.println("����ѡ�ƥ�䣬����������");
	}

		System.out.println("�������޸ĺ��ֵ��");
		String s2=Input.sc.nextLine();
		String sql=null;
	if (s1.equals("1")) {
		sql="update tab_user set psd=? where username=?";
	}
	if (s1.equals("2")) {
		sql="update tab_user set realname=? where username=?";
	}
	if (s1.equals("3")) {
		sql="update tab_user set sex=? where username=?";
	}
	if (s1.equals("4")) {
		sql="update tab_user set cityname=? where username=?";
	}
	if (s1.equals("5")) {
		sql="update tab_user set ctypeid=? where username=?";
	}
	if (s1.equals("6")) {
		sql="update tab_user set cert=? where username=?";
	}
	if (s1.equals("7")) {
		sql="update tab_user set birthday=? where username=?";
	}
	if (s1.equals("8")) {
		sql="update tab_user set utypeid=? where username=?";
	}
	if (s1.equals("9")) {
		sql="update tab_user set information=? where username=?";
	}
	if (s1.equals("10")) {
		sql="update tab_user set image_path=? where username=?";
	}
		
		int row=0;
		try {	
			con=DBUtil.getConnection();
			ps=con.prepareStatement(sql);
			
			if (s1.equals("sex")||s1.equals("ctypeid")||s1.equals("utypeid")) {
				ps.setInt(1,(int)(Integer.valueOf(s2)));
			}else if(s1.equals("birthday")){
				  int year=Integer.valueOf(s2.substring(0, 4));
				    System.out.println(year);
				    int month=Integer.valueOf(s2.substring(5, 7));
				    System.out.println(month);
				    int day=Integer.valueOf(s2.substring(8, 10));
				    System.out.println(day);
				  ps.setDate(1,  new Date(year-1900, month-1, day));
				
			} else {
                ps.setString(1, s2);
			}
				
			ps.setString(2, uname);
		    row=ps.executeUpdate();
			if (row>0) {
				System.out.println("�޸ĳɹ�");
			} else {
				System.out.println("�޸�ʧ��");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeConnection(rs, ps, con);
		}
	
		return row>0;
}
@Override
public List<User> showAll() throws SQLException {
	List<com.model.User> li=new ArrayList<com.model.User>();

		String sql="select * from tab_user";
		
		try {	
			con=DBUtil.getConnection();
			ps=con.prepareStatement(sql);
		    rs=ps.executeQuery();
		    
		   while(rs.next()){
			   User u=new User(rs.getString("username"), rs.getString("psd"),  
					   rs.getString("realname"),  rs.getInt("sex"),  
					   rs.getString("cityname"), rs.getInt("ctypeID") ,  rs.getString("cert"),
					   rs.getDate("birthday"),  rs.getInt("utypeid"), rs.getString("information"));
	u.setId(rs.getInt("id"));
			   li.add(u);
		   }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeConnection(rs, ps, con);
		}
	return li;
}
@Override
public boolean deleteUser(String name) throws SQLException {
	String sql = "delete  tab_user where username=?";
	
	int row = 0;

	try {
		con=DBUtil.getConnection();
		ps = con.prepareStatement(sql);
		ps.setString(1, name);		
		row = ps.executeUpdate();
		if (row>0) {
			System.out.println("ɾ���ɹ���");
		} else {
			System.out.println("ɾ��ʧ�ܣ�");
		}
	} finally {
		DBUtil.closeConnection(rs, ps, con);
	}
	return row>0;
}


@SuppressWarnings("deprecation")
@Override
public  List<com.model.User> select() throws SQLException {

   List<com.model.User> li=new ArrayList<com.model.User>();
	String s1;
	//����Ӧ�ü���while ѭ���ж�ѡ�������ݿ����Ƿ��ж�Ӧ��
	while (true) {
		System.out.println("������Ҫ��ѯ��ѡ�");
		System.out.println("1�û�Ȩ��");
		System.out.println("2:��ʵ����");
		System.out.println("3:�Ա�");
		System.out.println("4:��������");
		System.out.println("5:֤������");
		System.out.println("6:֤����");
		System.out.println("7:����");
		System.out.println("8:�ÿ�����");
		System.out.println("9:��ע��Ϣ");
		System.out.println("10:ͷ���ַ");
		s1=Input.sc.nextLine();
		if (s1.equals("1")||s1.equals("2")||
				s1.equals("3")||s1.equals("4")||
				s1.equals("5")||s1.equals("6")||
				s1.equals("7")||s1.equals("8")||
				s1.equals("9")||s1.equals("10")){
			break;
		}
		System.out.println("����ѡ�ƥ�䣬����������");
	}

		System.out.println("������Ҫ��ѯѡ���ֵ��");
		String s2=Input.sc.nextLine();
		String sql=null;
	if (s1.equals("1")) {
		sql="select * from tab_user where ru=?";
	}
	if (s1.equals("2")) {
		sql="select * from tab_user where realname=?";
	}
	if (s1.equals("3")) {
		sql="select * from tab_user where sex=?";
	}
	if (s1.equals("4")) {
		sql="select * from tab_user where cityname=?";
	}
	if (s1.equals("5")) {
		sql="select * from tab_user where ctypeid=?";
	}
	if (s1.equals("6")) {
		sql="select * from tab_user where cert=?";
	}
	if (s1.equals("7")) {
		sql="select * from tab_user where birthday=?";
	}
	if (s1.equals("8")) {
		sql="select * from tab_user where utypeid=?";
	}
	if (s1.equals("9")) {
		sql="select * from tab_user where information=?";
	}
	if (s1.equals("10")) {
		sql="select * from tab_user where image_path=?";
	}
		try {	
			con=DBUtil.getConnection();
			ps=con.prepareStatement(sql);
			
			if (s1.equals("sex")||s1.equals("ctypeid")||s1.equals("utypeid")) {
				ps.setInt(1,(int)(Integer.valueOf(s2)));
			}else if(s1.equals("birthday")){
				  int year=Integer.valueOf(s2.substring(0, 4));
				    System.out.println(year);
				    int month=Integer.valueOf(s2.substring(5, 7));
				    System.out.println(month);
				    int day=Integer.valueOf(s2.substring(8, 10));
				    System.out.println(day);
				  ps.setDate(1,  new Date(year-1900, month-1, day));
				
			} else {
                ps.setString(1, s2);
			}
			
		    rs=ps.executeQuery();
		//    System.out.println(rs);
		   while(rs.next()){
			   User u=new User(rs.getString("username"), rs.getString("psd"),  
					   rs.getString("realname"),  rs.getInt("sex"),  
					   rs.getString("cityname"), rs.getInt("ctypeID") ,  rs.getString("cert"),
					   rs.getDate("birthday"),  rs.getInt("utypeid"), rs.getString("information"));
	u.setId(rs.getInt("id"));
			   li.add(u);
			    System.out.println(u.toString());
		   }
		//   li.forEach(i -> System.out.println(i.toString()));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeConnection(rs, ps, con);
		}
	return li;
}
@SuppressWarnings("deprecation")
@Override
public boolean updateUser(String name) throws SQLException {
	
	String uname=name;

	String s1;
	//����Ӧ�ü���while ѭ���ж�ѡ�������ݿ����Ƿ��ж�Ӧ��
	while (true) {
		System.out.println("������Ҫ�޸ĵ�ѡ�");
		System.out.println("1:����");
		System.out.println("2:��ʵ����");
		System.out.println("3:�Ա�");
		System.out.println("4:��������");
		System.out.println("5:֤������");
		System.out.println("6:֤����");
		System.out.println("7:����");
		System.out.println("8:�ÿ�����");
		System.out.println("9:��ע��Ϣ");
		System.out.println("10:ͷ���ַ");
		s1=Input.sc.nextLine();
		if (s1.equals("1")||s1.equals("2")||
				s1.equals("3")||s1.equals("4")||
				s1.equals("5")||s1.equals("6")||
				s1.equals("7")||s1.equals("8")||
				s1.equals("9")||s1.equals("10")){
			break;
		}
		System.out.println("����ѡ�ƥ�䣬����������");
	}

		System.out.println("�������޸ĺ��ֵ��");
		String s2=Input.sc.nextLine();
		String sql=null;
	if (s1.equals("1")) {
		sql="update tab_user set psd=? where username=?";
	}
	if (s1.equals("2")) {
		sql="update tab_user set realname=? where username=?";
	}
	if (s1.equals("3")) {
		sql="update tab_user set sex=? where username=?";
	}
	if (s1.equals("4")) {
		sql="update tab_user set cityname=? where username=?";
	}
	if (s1.equals("5")) {
		sql="update tab_user set ctypeid=? where username=?";
	}
	if (s1.equals("6")) {
		sql="update tab_user set cert=? where username=?";
	}
	if (s1.equals("7")) {
		sql="update tab_user set birthday=? where username=?";
	}
	if (s1.equals("8")) {
		sql="update tab_user set utypeid=? where username=?";
	}
	if (s1.equals("9")) {
		sql="update tab_user set information=? where username=?";
	}
	if (s1.equals("10")) {
		sql="update tab_user set image_path=? where username=?";
	}
		
		int row=0;
		try {	
			con=DBUtil.getConnection();
			ps=con.prepareStatement(sql);
			
			if (s1.equals("sex")||s1.equals("ctypeid")||s1.equals("utypeid")) {
				ps.setInt(1,(int)(Integer.valueOf(s2)));
			}else if(s1.equals("birthday")){
				  int year=Integer.valueOf(s2.substring(0, 4));
				    System.out.println(year);
				    int month=Integer.valueOf(s2.substring(5, 7));
				    System.out.println(month);
				    int day=Integer.valueOf(s2.substring(8, 10));
				    System.out.println(day);
				  ps.setDate(1,  new Date(year-1900, month-1, day));
				
			} else {
                ps.setString(1, s2);
			}
				
			ps.setString(2, uname);
		    row=ps.executeUpdate();
			if (row>0) {
				System.out.println("�޸ĳɹ�");
			} else {
				System.out.println("�޸�ʧ��");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeConnection(rs, ps, con);
		}
	
		return row>0;
}
@Override
public void select(String name) throws SQLException {
	
	String sql="select * from tab_user where username=?";
	
	try {	
		con=DBUtil.getConnection();
		ps=con.prepareStatement(sql);
		ps.setString(1, name);
	    rs=ps.executeQuery();
	    
	   while(rs.next()){
		   User u=new User(rs.getString("username"), rs.getString("psd"),  
				   rs.getString("realname"),  rs.getInt("sex"),  
				   rs.getString("cityname"), rs.getInt("ctypeID") ,  rs.getString("cert"),
				   rs.getDate("birthday"),  rs.getInt("utypeid"), rs.getString("information"));
          u.setId(rs.getInt("id"));
		   System.out.println(u.toString());
	   }
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		DBUtil.closeConnection(rs, ps, con);
	}

}



	
}
