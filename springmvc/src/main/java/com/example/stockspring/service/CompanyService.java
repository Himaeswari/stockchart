package com.example.stockspring.service;

import java.sql.SQLException;
import java.util.List;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.Stock;
import com.example.stockspring.model.User;

public interface CompanyService {

	
	  public Company insertCompany(Company company) throws SQLException;
	  /* public Company updateCompany(Company company) throws SQLException;*/
		public List<Company> getCompanyList() throws SQLException, ClassNotFoundException;
		/*public Boolean validateUser(User user) throws SQLException;
		 public User insertUser(User user) throws SQLException;
		 public Stock insertStock(Stock stock) throws SQLException;
		 public List<Stock> getStockList() throws SQLException;
}*/
}
