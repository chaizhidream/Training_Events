<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"/>
<title>体测成绩计算器</title>
<style type="text/css">

*{
	margin: 0;
	padding: 0;
}
	form{
		width: 96%;
		margin: 0 auto;
		
	}
	form>div{
		display: flex;
		margin-top: 15px;
	}
	label{
		width: 100px;
		font-size: 14px;
		text-align: right;
		margin-right: 20px;

	}
	form>div input{
		width: 150px;
		font-size: 14px;
		padding: 3px ;
		line-height: 20px;
		border: 0;
		border-radius: 3px;
		background: lightblue;
		outline-color: #fff;

	}
	.bot{
		display: flex;
		margin:30px 0 0 70px;
	}
	.bot input{
		width: 50px;
		background:teal;
		color: #fff;
		margin-right:70px;
	}
</style>
</head>
<body>

<form id="form01" name="form01" action="CalculatorMale01" method="post"> 
	<div>
	<p>请输入不带单位的正整数<p>
	</div>
	<div>
		<label for="height">身高<br/>(单位：cm):</label>
		<input name="height" id="height" type="text">
	</div>
	<div>
		<label for="weight">体重<br/>(单位：kg):</label>
		<input name="weight" id="weight" type="text">
	</div>
	<div>
		<label for="vital_capacity">肺活量<br/>(单位：ml):</label>
		<input name="vital_capacity" id="vital_capacity" type="text">
	</div>
	<div>
		<label for="standing_long_jump">立定跳远<br/>(单位：cm):</label>
		<input name="standing_long_jump" id="standing_long_jump" type="text">
	</div>
	<div>
		<label for="seat_flexion">坐位体前屈<br/>(单位：cm):</label>
		<input name="seat_flexion" id="seat_flexion" type="text">
	</div>
	<div>
		<label for="pull_up">引体向上<br/>(单位：个):</label>
		<input name="pull_up" id="pull_up" type="text">
	</div>
	<div>
		<label for="run_50">50米跑<br/>(单位：ms):</label>
		<input name="run_50" id="run_50" type="text">
	</div>
	<div>
		<label for="run_1000">1000米跑<br/>(单位：s):</label>
		<input name="run_1000" id="run_1000" type="text">
	</div>
	<div class="bot">
		<input type="submit" name="Submit1" value="提交"/>
		<input type="reset" name="Submit2" value="重置"/>
	</div>
</form>
</body>
</html>