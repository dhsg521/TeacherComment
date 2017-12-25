<%@page contentType="text/html; charset=utf-8"
 pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
	<title>老师列表</title>
	</head>
	<body>
		<table border="1" width="60%">
			<tr>
				<td>Id</td>
				<td>教师名字</td>
				<td>职 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;称</td>
				<td>研究方向</td>
			</tr>
			<c:forEach items="${teacherList}" var="teacher" varStatus="i">
				<tr>
					<td>${teacher.teacher_id}</td>
					<td><a href="showTeacher.do?teacherId=${teacher.teacher_id}">${teacher.teacher_name}</a></td>
					<td>${teacher.academic_title}</td>
					<td>${teacher.research_area}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>