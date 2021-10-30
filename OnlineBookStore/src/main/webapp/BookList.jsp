<%@page import="com.moses.Models.Book"%>
<%@page import="java.util.List"%>
<%@page import="com.moses.Dao.BookDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>LIST OF ALL THE BOOKS</h1>
<a href="/OnlineBookStore/HomeBook.jsp">Add New</a>
<br>
<br>
<%
List<Book> bookList=BookDao.getAllBooks();
%>
<table>
<thead>
<tr>
<th>ISBN</th>
<th>Title</th>
<th>Author</th>
<th>Publication Year</th>
<th>Category</th>
<th>Purchase Price</th>
<th>Sell Price</th>
<th>Record Date</th>
</tr>
</thead>
<tbody>
<%
for (Book book:bookList){ %>
<tr>
<td><%=book.getISBN() %></td>
<td><%=book.getTitle() %></td>
<td><%=book.getAuthors() %></td>
<td><%=book.getPublicationYear() %></td>
<td><%=book.getCategory() %></td>
<td><%=book.getPurchasingPrice() %></td>
<td><%=book.getSellingPrice() %></td>
<td><%=book.getRecordindDate() %></td>
</tr>

<% } %>
</tbody>



</table>
</body>
</html>