package com.example.stockspring.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.Stock;
import com.example.stockspring.model.User;

/*@Repository
public class CompanyDaoImpl implements CompanyDao{

	
	public void insertCompany(Company company) throws SQLException  {
		
		
		
	}

	


       @Override
	   public List<Company> getCompanyList() throws SQLException, ClassNotFoundException{
		   List <Company> companyList=new ArrayList<Company>();
		   try
		   {
			  
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "root");
           PreparedStatement ps=conn.prepareStatement("select * from company");
           ResultSet rs=  ps.executeQuery();
         
           Company company=null;
           while(rs.next()){
                   company=new Company();
                   int companyId=rs.getInt("company_code");
                   company.setCompanyCode(companyId);;
                   company.setCompanyName(rs.getString("company_name"));
                   company.setCeo(rs.getString("ceo"));
                   company.setTurnOver(rs.getDouble("turnover"));
                   company.setBoardOfDirectors(rs.getString("board_of_directors"));
                   company.setSectorId(rs.getInt("sector_id"));
                   company.setBriefWriteUp(rs.getString("breif_write_up"));
                  
                   
                   companyList.add(company);
           }
		   }
		   catch(SQLException e)
		   {
			   System.out.println(e);
			   throw e;
		   }
           
           return companyList;
    }
       
       
       @Override
	   public List<Stock> getStockList() throws SQLException{
		   List <Stock> stockList=new ArrayList<Stock>();
		   try
		   {
			  
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "root");
           PreparedStatement ps=conn.prepareStatement("select * from stock_exchange");
           ResultSet rs=  ps.executeQuery();
         
           Stock stock=null;
           while(rs.next()){
                   stock=new Stock();
                   int stockExchangeId=rs.getInt("stock_exchange_id");
                   stock.setStockExchangeId(stockExchangeId);
                   stock.setStockExchangeName(rs.getString("stock_exchange_name"));
                   stock.setBrief(rs.getString("brief"));
                   stock.setContactAddress(rs.getString("contact_address"));
                   stock.setRemarks(rs.getString("remarks"));
                  ;
                  
                   
                   stockList.add(stock);
           }
		   }
		   catch(SQLException e)
		   {
			   System.out.println(e);
			   throw e;
		   }
           
           return stockList;
    }
       

	@Override
       public Boolean validateUser(User user) throws SQLException
   	{
		
   		String sql;
   		
   		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "root");
   		Statement stmt=conn.createStatement();
   		ResultSet rs= null;
   		System.out.println(user.getId());
   		System.out.println(user.getPassword());
   		sql = "SELECT * from user WHERE id='" + user.getId() + "' and password='"+user.getPassword()+"'";                                  
   		   rs = stmt.executeQuery(sql);
   		 
   		   if(rs.next()){
   			System.out.println("ssdddsdsfsdf "+user.getId());
   		        return true;
   		   } 
   		   else 
   		   {
   		       return false;
   		   }
   	}
	
	
	
	@Override
	public Company updateCompany(Company company) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String []args) throws Exception{
		CompanyDaoImpl dao=new CompanyDaoImpl();
		//Company compnay=new Company();
		//compnay.setCompanyId(1001);
		//dao.insertCompany(compnay);
		
		System.out.println(dao.getCompanyList());
	}




	@Override
	public User insertUser(User user) throws SQLException {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "root");
		PreparedStatement ps=conn.prepareStatement("insert into user (user_name,password,email,mobile_number) value(?,?,?,?)");
		
		ps.setString(1,user.getUserName());
		ps.setString(2,user.getPassword());
		ps.setString(3,user.getEmail());
		ps.setLong(4,user.getMobile());
		
		
		
		
		ps.executeUpdate();
		conn.close();
		return null;
	}
	
	@Override
	public Stock insertStock(Stock stock) throws SQLException {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "root");
		PreparedStatement ps=conn.prepareStatement("insert into stock_exchange (stock_exchange_name,brief,contact_address,remarks) value(?,?,?,?)");
		
		ps.setString(1,stock.getStockExchangeName());
		ps.setString(2,stock.getBrief());
		ps.setString(3,stock.getContactAddress());
		ps.setString(4,stock.getRemarks());
		
		
		
		
		ps.executeUpdate();
		conn.close();
		return null;
	}

}
*/