<!doctype html>
<%@page import="java.util.Date"%>
<html lang="en">
<head>
</head>

<body>
<%
Object d1= request.getAttribute("this_time");
%>
    <div><%="hello for jsp :"%>
    <%=d1 %>
    </div>
</body>

</html>
