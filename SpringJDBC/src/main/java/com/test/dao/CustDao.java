package com.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.test.model.Customer;

public class CustDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void createCustomer(Customer cst) {
		String sql = "insert into customer(cst_name, cst_type) values('"+cst.getName()+"', '"+cst.getType()+"')";
		
		jdbcTemplate.execute(sql);
	}
	
	public void updateCustomer(Customer cst) {
		String sql = "update customer set cst_name = '"+cst.getName()+"', cst_type = '"+cst.getType()
				+ "' WHERE id =" + cst.getId();
		jdbcTemplate.execute(sql);
	}
}
