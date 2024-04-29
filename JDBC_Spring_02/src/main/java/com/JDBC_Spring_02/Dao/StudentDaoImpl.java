 package com.JDBC_Spring_02.Dao;

import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.jdbc.core.JdbcTemplate;

import com.JDBC_Spring_02.Model.Student;

public class StudentDaoImpl  implements StudentDao{
	

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public int insert(Student studetn) {
		String sql = "INSERT INTO jdbc_spring(ID, email, password) VALUES (?, ?, ?)";
        int i = jdbcTemplate.update(sql, studetn.getId(), studetn.getEmail(), studetn.getPassword());
        System.out.print(i);
        return i;
		
	}

	@Override
	public int UpdateDetail(Student student) {
		String sql = "UPDATE jdbc_spring SET email=?, password=? WHERE ID=?";
        int i = jdbcTemplate.update(sql, student.getEmail(), student.getPassword(), student.getId());
        return i;
	}

	@Override
	public int Delete(int id) {
		String sql = "DELETE FROM jdbc_spring WHERE ID=?";
        int i = jdbcTemplate.update(sql, id);
        return i;
	}

	@Override
	public int getDataById(int id) {
		String sql = "select * from student where id=?";
		RowMapper rowMapper = new RowMapper() {

			@Override
			public int[] getRowsForPaths(TreePath[] path) {
				// TODO Auto-generated method stub
				return null;
			}
			
		};
			
		return 0;
	}

	@Override
	public List<Student> getAllList() {
		// TODO Auto-generated method stub
		return null;
	}

}
