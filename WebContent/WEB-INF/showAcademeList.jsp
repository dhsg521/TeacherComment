<%@page contentType="text/html; charset=utf-8"
 pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
	<title>学院列表</title>
	</head>
	<body>
		<table border="1" width="60%">
			<tr>
				<td>Id</td>
				<td>学院名称</td>
			</tr>
			<c:forEach items="${academeList}" var="academe" varStatus="i">
				<tr>
					<td>${academe.academe_id}</td>
					<td><a href="../teacher/showList.do?academeId=${academe.academe_id}">${academe.academe_name}</a></td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>