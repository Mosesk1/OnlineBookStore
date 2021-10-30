<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BooksStore</title>
</head>
<body >
<a href="/OnlineBookStore/BookList.jsp">Book List</a>
<h2>Online Book Store Management Information System </h2>

<form action="BookServlet" method="get">
 <label>ISBN </label>
 <input type="text" name="ISBN"  placeholder="Enter your ISBN">
 <br>
 <br>
 <label>TITLE</label>
 <input type="text" name="title"  placeholder="Enter your title">
 <br>
 <br>
 <label>Publication Year</label>
 <input type="date" name="publicationYear"  placeholder="Enter your publicationYear">
 <br>
 <br>
 CATEGORY : <select name="category">
			<option>AUCA</option>
			<option>UoK</option>
			<option>MountK</option>
			
		</select><br><br>

 <label>AUTHOR:</label>
 <input type="text" name="authors"  placeholder="Enter your authors">
 <br>
 <br>
 <label>Purchasing Price</label>
 <input type="text" name="purchasingPrice"  placeholder="Enter your purchasingPrice">
 <br>
 <br>
  <label>Selling Price</label>
 <input type="text" name="sellingPrice"   placeholder="Enter your sellingPrice">
 <br>
 <br>
 <label>Recordind Date</label>
 <input type="date" name="recordindDate"  placeholder="Enter your publicationYear">
 <br>
 <br>
 <input type="submit" value="SAVE">

</form>

</body>
</html>