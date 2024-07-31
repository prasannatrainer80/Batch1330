package com.java.spr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.java.spr.model.Employ;

public class EmployDaoImpl implements EmployDao {

	private JdbcTemplate jdbcTemplate;
	
	public EmployDaoImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Employ> showEmployDao() {
		 String sql = "SELECT * FROM Employ";
		    List<Employ> listEmploy = jdbcTemplate.query(sql, new RowMapper<Employ>() {
		 
		        @Override
		        public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
		            Employ employ = new Employ();
		 
		            employ.setEmpno(rs.getInt("empno"));
		            employ.setName(rs.getString("name"));
		            employ.setGender(rs.getString("gender"));
		            employ.setDept(rs.getString("dept"));
		            employ.setDesig(rs.getString("desig"));
		            employ.setBasic(rs.getInt("basic"));
		            return employ;
		        }
		    });
		    return listEmploy;
	}

	@Override
	public Employ searchEmploy(int empno) {
		String sql = "select * from Employ where empno = ?";
		List<Employ> employList = jdbcTemplate.query(sql,new Object[] {empno}, new RowMapper<Employ>() {

			@Override
			public Employ mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Employ employ = new Employ();
	   		 
	            employ.setEmpno(rs.getInt("empno"));
	            employ.setName(rs.getString("name"));
	            employ.setGender(rs.getString("gender"));
	            employ.setDept(rs.getString("dept"));
	            employ.setDesig(rs.getString("desig"));
	            employ.setBasic(rs.getInt("basic"));
	            return employ;
			}
		});
		return employList.get(0);
	}

	@Override
	public void updateEmploy(Employ employUpdated) {
		String cmd = "Update Employ Set Name = ?, Gender = ?, Dept = ?, Desig = ?, "
				+ " Basic = ? Where Empno = ?";
		jdbcTemplate.update(cmd, new Object[] {employUpdated.getName(), 
							employUpdated.getGender(),
							employUpdated.getDept(),
							employUpdated.getDesig(),
							employUpdated.getBasic(),
							employUpdated.getEmpno()
					});
		
	}

	@Override
	public void deleteEmploy(int empno) {
		String cmd = "Delete from Employ where empno = ?";
		jdbcTemplate.update(cmd, new Object[] {empno});
	}

	@Override
	public void addEmploy(Employ employNew) {
		String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) values(?,?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[] {
				employNew.getEmpno(),
				employNew.getName(), 
				employNew.getGender(),
				employNew.getDept(),
							employNew.getDesig(),
							employNew.getBasic()
							
					});
		
	}

}
