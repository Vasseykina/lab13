
<%@ page import="Notebook.Notebook" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>NOTEBOOK</title>
</head>
<body>
<h1 align="center">Notebook</h1>

<a href="addUser.jsp">
    <button>Add user or number</button>
</a>

<%
    Notebook notebook = new Notebook();
    Notebook.getData();
    String users = Notebook.getUsersForPrint();
%>
<p>
    <%= users %>
</p>
</body>
</html>