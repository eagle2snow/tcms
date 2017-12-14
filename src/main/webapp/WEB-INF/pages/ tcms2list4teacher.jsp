<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	pageContext.setAttribute("ctp", request.getContextPath());


%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生/班级</title>
<script type="text/javascript" src="${ctp }/scripts/jquery-1.9.1.min.js"></script>
</head>
<body>
	<center>
		<br>
		<br>
		<br>
		<h1>学生/班级列表</h1>
		<table border="1" cellpadding="5" cellspacing="0">
			<tr>
				<th>老师名字</th>
				<th>所属系部</th>
				<th>授课名称</th>
				<th>我想修改</th>
				<th>我想删除</th>
			</tr>
			<c:forEach items="${teachers }" var="teacher">
				<tr>
					<td>${teacher.tname}</td>
					<td>${teacher.depart}</td>
					<td>${teacher.tno}</td>
					<td><a href="${ctp }/upt2cms/${stu.sno }">edit</a></td>
					<td><a href="${ctp }/del2tcms/${stu.sno }" class="delBtn">delete</a></td>
				</tr>
			</c:forEach>
		</table>
		<br>
		<br>
		<a href="${ctp }/to_add_page">添加学生</a> |
		<a href="${ctp }/exportStudentInfo">导出Excel</a>|

		<form id="deleteForm" action="${ctp }/stu/${stu.sno }" method="post">
			<input type="hidden" name="_method" value="DELETE" />
		</form>
		<script type="text/javascript">
			$(function() {
				$(".delBtn").click(function() {
					//0、确认删除？
					//1、改变表单的action指向
					$("#deleteForm").attr("action", this.href);
					//2、提交表单
					$("#deleteForm").submit();
					return false;
				});
			});
		</script>
	</center>
</body>
</html>