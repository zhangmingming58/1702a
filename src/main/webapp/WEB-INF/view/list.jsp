<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	//查询
	function see(){
		location="see.do";
	}
	function add(){
		location="add.jsp";
	}
	//全选
	function selAll(){
		$(":checkbox").attr("checked",true)
	}
	//反选
	function selOver(){
		$(":checkbox").each(function(){
			$(this).attr("checked",!$(this).attr("checked"))
		})
	}
	//批删
	function delAll(){
		var mid = "";
		$(":checkbox:checked").each(function(){
			mid+=","+$(this).val()
		})
		mid=mid.substring(1);
		$.post("delete.do",{mid:mid},function(flag){
			if(flag){
				alert("删除成功")
				location="list"
			}else{
				alert("删除失败")
			}
		},"json")
	}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/index2.css">
</head>
<body>
		<input type = "hidden" name = "mname" value="${mname}">
		<input type = "hidden" name = "editor" value="${editor}">
		<input type = "hidden" name = "year" value="${year}">
		<input type = "hidden" name = "beginTime" value="${beginTime}">
		<input type = "hidden" name = "endTime" value="${endTime}">
		<input type = "hidden" name = "minPrice" value="${minPrice}">
		<input type = "hidden" name = "maxPrice" value="${maxPrice}">
		<input type = "hidden" name = "minTime" value="${minTime}">
		<input type = "hidden" name = "maxTime" value="${maxTime}">
		<input type = "hidden" name = "asc_desc" value="${asc_desc}">
		<button onclick="add()">新增影片</button>
		<button onclick="see()">查询影片</button>
		<button onclick="delAll()">删除影片</button>
	<table>
		<tr>
			<td>
				<button onclick="selAll()">全选</button>
				<button onclick="selOver()">反选</button>
			</td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td><a href="list?asc_desc=${asc_desc=='1'?'2':'1'}">上映时间</a></td>
			<td><a href="list?asc_desc=${asc_desc=='3'?'4':'3'}">时长</a></td>
			<td>类型</td>
			<td><a href="list?asc_desc=${asc_desc=='5'?'6':'5'}">年代</a></td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="m">
			<tr>
				<td><input type = "checkbox" value="${m.mid }"></td>
				<td>${m.mname}</td>
				<td>${m.editor}</td>
				<td>${m.price}</td>
				<td>${m.ontime}</td>
				<td>${m.time}</td>
				<td>${m.type}</td>
				<td>${m.year}</td>
				<td>${m.aera}</td>
				<td>${m.status==0?'已经下架':'正在热映'}</td>
				<td><a href="updateStatus.do?mid=${m.mid}&status=${m.status==0?'1':'0'}">${m.status==0?'上架':'下架'}</a>
				|详情|编辑</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="20">${page}</td>
		</tr>
	</table>
</body>
</html>



