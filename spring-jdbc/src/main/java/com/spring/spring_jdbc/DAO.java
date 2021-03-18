package com.spring.spring_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class DAO implements employeedaointer
{
	private JdbcTemplate jdbctemp;
	public void setJdbctemp(JdbcTemplate jdbctemp)
	{
		this.jdbctemp=jdbctemp;
	}
	public int save(employee e) 
	{
		String query="insert into employee values("+e.getEmpno()+","+"'"+e.getEmpname()+"'"+")";
		return jdbctemp.update(query);
	}
	public List<employee> getallemployee() 
	{
		String query="select * from employee";
		return jdbctemp.query(query,new ResultSetExtractor<List<employee>>()
				{

					public List<employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
						List<employee> lst=new ArrayList<employee>();
						while(rs.next())
						{
							employee e=new employee();
							e.setEmpno(rs.getInt(1));
							e.setEmpname(rs.getString(2));
							lst.add(e);
						}
						return lst;
					}
			
				});
	}
	

}
