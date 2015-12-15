<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="wabacus" prefix="wx"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<h3>${titleName} 当页总数：${size}</h3>
	<wx:searchbox/>
	<wx:title/>
	<wx:data/>
	<wx:navigate/>
</body>
</html>