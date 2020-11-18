<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

  
  <body> 
    ${city.cname} ：
    <c:forEach items="${city.users}" var="user">
    ${user.name} &nbsp;&nbsp;
    </c:forEach>
    <hr>
    <c:forEach items="${ulist}" var="user">
    ${user.name}-------${user.city.cname}<br>
    </c:forEach>
  </body>
</html>
