<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>회원가입</title>
</head>
<body>
<form method=get>
	이름 : <input type=text name=realname><br>
	ID : <input type=text name=userid><br>
	PW : <input type=password name=passcode1><br>
	PW check : <input type=password name=passcode2><br>
	<input type=submit value="회원가입">
</form>
</body>
</html>
