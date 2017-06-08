<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>体测成绩计算器</title>

</head>
<body>
<%
String sex=request.getParameter("selectSex");
String grade=request.getParameter("selectGrade");
if(sex.equals("male")&&(grade.equals("1")))
{	response.sendRedirect("male01.jsp");}
else if(sex.equals("male")&&(grade.equals("2")))
{	response.sendRedirect("male01.jsp");}
else if(sex.equals("male")&&(grade.equals("3")))
{	response.sendRedirect("male02.jsp");}
else if(sex.equals("male")&&(grade.equals("4")))
{	response.sendRedirect("male02.jsp");}
else if(sex.equals("female")&&(grade.equals("1")))
{	response.sendRedirect("female01.jsp");}
else if(sex.equals("female")&&(grade.equals("2")))
{	response.sendRedirect("female01.jsp");}
else if(sex.equals("female")&&(grade.equals("3")))
{	response.sendRedirect("female02.jsp");}
else if(sex.equals("female")&&(grade.equals("4")))
{	response.sendRedirect("female02.jsp");}

%>
</body>
</html>