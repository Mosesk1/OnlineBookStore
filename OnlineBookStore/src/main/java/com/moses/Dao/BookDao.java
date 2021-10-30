package com.moses.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.moses.Controller.DbConnection;
import com.moses.Models.Book;

public class BookDao {

	
	public static void saveBooks(int ISBN, String title,String authors, LocalDate publicationYear,String category, Double purchasingPrice, Double sellingPrice, LocalDate recordindDate) {
		
		try (Connection con=DbConnection.getConnected()){
			String sql_save_book="INSERT INTO books (ISBN,title,authors,publicationYear,category,purchasingPrice,sellingPrice,recordindDate) values (?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement=con.prepareStatement(sql_save_book);
			statement.setInt(1, ISBN);
			statement.setString(2, title);
			statement.setString(3, authors);
			statement.setDate(4, Date.valueOf(publicationYear));
			statement.setString(5, category);
			statement.setDouble(6, purchasingPrice);
			statement.setDouble(7, sellingPrice);
			statement.setDate(8, Date.valueOf(recordindDate));
			statement.execute();
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}
		
		public static List<Book> getAllBooks(){
			List<Book> bookList=new ArrayList<>();
			try (Connection con=DbConnection.getConnected()){
				String sql_get_all_book="SELECT * FROM books";
				
				PreparedStatement statement=con.prepareStatement(sql_get_all_book);
				
				ResultSet rs= statement.executeQuery();
				while(rs.next()) {
					 int ISBN=rs.getInt(1);
					 String title=rs.getString(2);
					 String authors=rs.getString(3);
					 LocalDate publicationYear=rs.getDate(4).toLocalDate();
					 String category=rs.getString(5);
					 Double purchasingPrice=rs.getDouble(6);
					 Double sellingPrice=rs.getDouble(7);
					 LocalDate recordindDate=rs.getDate(8).toLocalDate();
					Book book=new Book(ISBN,title,authors,publicationYear,category,purchasingPrice,sellingPrice,recordindDate);
					bookList.add(book);
				
					
				}
				
			} catch (Exception ex) {
				
				ex.printStackTrace();
			}
		return bookList;
			
		
	}
		
	}
	
