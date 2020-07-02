package com.luv2code.springdemo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.luv2code.springdemo.entity.Customer;

public class CustomerDao {
	JdbcTemplate template;    
    
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	
	public List<Customer> getEmployees(){    	    
		return template.query("select * from customer", new RowMapper<Customer>(){    
	        public Customer mapRow(ResultSet rs, int row) throws SQLException {    
	        	Customer c = new Customer();    
	            c.setId(rs.getInt(1));    
	            c.setFirstName(rs.getString(2)); 
	            c.setLastName(rs.getString(3));
	            c.setEmail(rs.getString(4));
	            return c;    
	        }    
	    });    
	}  
	
	public Customer getCustomer(int customerId){ 
		String sql="select * from customer where id=?";    
	    return template.queryForObject(sql, new Object[]{customerId}, new BeanPropertyRowMapper<Customer>(Customer.class));	          
	}  
	
	public int save(Customer c){    
	    String sql="insert into customer(first_name, last_name, email) values('"+c.getFirstName()+"','"+c.getLastName()+"','"+c.getEmail()+"')";    
	    return template.update(sql);    
	}

	public int delete(int theId) {
		String sql="delete from customer where  id = " + theId;    
	    return template.update(sql);  		
	}

	public void update(Customer c) {
		 String sql="update customer set  first_name='"+c.getFirstName()+"', last_name='"+c.getLastName()+"', email='"+c.getEmail()+"' where id='"+c.getId()+"'";		    
		 System.out.println(sql);
		 template.update(sql); 
	}

}
