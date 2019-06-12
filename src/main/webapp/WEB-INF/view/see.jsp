<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
	
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/index2.css">
</head>
<body>
		<form action="list" method="post">
			影片名称<input type = "text" name="mname" >
			上映时间<input type = "text" name="beginTime" onclick="WdatePicker()" >--<input type = "text" name="endTime" onclick="WdatePicker()"><br><br>
			导演&nbsp;&nbsp;<input type = "text" name="editor" >
			&nbsp;&nbsp;&nbsp;&nbsp;
			价格<input type = "text" name="minPrice" >--<input type = "text" name="maxPrice" ><br><br>
			电影年代<select name="year">
				<option value="0">请选择</option>
				<option value="2017">2017</option>
				<option value="2018">2018</option>
				<option value="2019">2019</option>
				<option value="2020">2020</option>
			</select>
			电影时长<input type = "text" name="minTime" >--<input type = "text" name="maxTime" ><br><br>
			<input type = "submit" value="查询"><input type = "reset">
		</form>
</body>
</html>



