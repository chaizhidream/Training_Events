<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"/>
<link rel="shortcut icon" href="favicon.ico"> 
<title>体测成绩计算器</title>
<style>
	*{
	margin: 0;
	padding: 0;
}
	form{
		width: 90%;
		margin: 0 auto;
		margin-top: 100px;
		
	}
	p{
		font-size:18px;
		margin: 15px 0;
	}
	label{
		margin-right: 20px;
	}
	.bot{
		display: flex;
		margin-top: 30px;
	}
	.bot input{
		width: 50px;
		background:teal;
		color: #fff;
		margin-right:70px;
		font-size: 14px;
		padding: 3px;
		line-height: 20px;
		border: 0;
		border-radius: 3px;
	}
</style>

</head>
<body>
<form id="form"name="form"action="main.jsp" method="post"> 

<p>您的性别是？</p>
<label><input name="selectSex" type="radio" value="male" checked />男</label> 
<label><input name="selectSex" type="radio" value="female" />女</label> 
<p>您的年级是？</p>
<label><input name="selectGrade" type="radio" value="1" />大一</label> 
<label><input name="selectGrade" type="radio" value="2" />大二</label> 
<label><input name="selectGrade" type="radio" value="3" checked/>大三</label> 
<label><input name="selectGrade" type="radio" value="4" />大四</label> 

<div class="bot">
	<input type="submit"name="Submit1"value="提交"/>
	
</div>
</form> 


</body>
</html>