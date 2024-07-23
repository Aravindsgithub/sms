package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import models.student;

public class studentservice {

	private Connection conn;

	public studentservice(Connection conn){
		super();
		this.conn = conn;
	}
	
	public boolean addstu(student stu) {
		
		//default boolean value 
		boolean b = false;
		
		try {
			
			//sql query
			String sql = "insert into stu(name,branch,email,phno) values(?,?,?,?)";
			
			//creating prepared statement
			PreparedStatement pmst = conn.prepareStatement(sql);
			
			//dyanamic data insertion
			pmst.setString(1, stu.getName());
			
			pmst.setString(2, stu.getBranch());
			
			pmst.setString(3, stu.getEmail());
			
			pmst.setLong(4, stu.getPhno());
			
			//statement execution
			int i = pmst.executeUpdate();
			
			if(i==1) {
				
				//if data inserted successfully boolean value change to true
				b = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//returning boolean value 
		return b;
		
	}
	
	public List<student> fetchall(){
		List<student> li = new ArrayList<student>();
		student s = null;
		try {
			
			String sql = "select * from stu";
			
			PreparedStatement pmst = conn.prepareStatement(sql);
			
			ResultSet rs = pmst.executeQuery();
			
			while (rs.next()) {
				s = new student();
				
				s.setId(rs.getInt(1));
				
				s.setName(rs.getString(2));
				
				s.setBranch(rs.getString(3));
				
				s.setEmail(rs.getString(4));
				
				s.setPhno(rs.getLong(5));
				
				li.add(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return li;
				
	}
	
	public student getbyid(int id) {
		
		student s = null;
		
		try {

			String sql = "select * from stu where id=?";
			
			PreparedStatement pmst = conn.prepareStatement(sql);
			
			pmst.setInt(1, id);
			
			ResultSet rs = pmst.executeQuery();
			
			while (rs.next()) {
				s = new student();
				
				s.setId(rs.getInt(1));
				
				s.setName(rs.getString(2));
				
				s.setBranch(rs.getString(3));
				
				s.setEmail(rs.getString(4));
				
				s.setPhno(rs.getLong(5));
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return s;
	}
	
	public boolean delbyid(int id) {
		
		boolean f = false;
		
		try {
			
			String sql = "delete from stu where id=?";
			
			PreparedStatement pmst = conn.prepareStatement(sql);
			
			pmst.setInt(1, id);
			
			int i = pmst.executeUpdate();
			
			if(i>0) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
	public boolean updatestu(student st) {
		
		boolean f = false;
		
		try {
			
			String sql = "update stu set name=?,branch=?,email=?,phno=? where id=?";
			
			PreparedStatement pmst = conn.prepareStatement(sql);
			
			pmst.setString(1, st.getName());
			
			pmst.setString(2, st.getBranch());
			
			pmst.setString(3, st.getEmail());
			
			pmst.setLong(4, st.getPhno());
			
			pmst.setInt(5, st.getId());
			
			int i = pmst.executeUpdate();
			
			if(i>0) {
				f = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}
	
}
