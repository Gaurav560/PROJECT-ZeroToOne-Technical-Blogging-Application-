package com.blog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import com.blog.entities.Cateogry;


public class PostDao {

	
	Connection connection;

	public PostDao(Connection connection) {
		super();
		this.connection = connection;
	}
	
	
	public ArrayList<Cateogry> getCateogries(){
		 ArrayList< Cateogry> aList=new ArrayList<Cateogry>();;
		
		 
		 try {
			 
			 
			 String query="select * from cateogry";
			 PreparedStatement pstmt=connection.prepareStatement(query);
			 ResultSet rsResultset=pstmt.executeQuery();
			 
			 while (rsResultset.next()) {
				 
				
				 int cid=rsResultset.getInt(1);
				 String cname=rsResultset.getString(2);
				 String cdescription=rsResultset.getString(3);
				 Cateogry c=new Cateogry(cid, cname, cdescription);
				 aList.add(c);
			
				
			}
			 
			 
			 
			 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		return aList;
	}
}
