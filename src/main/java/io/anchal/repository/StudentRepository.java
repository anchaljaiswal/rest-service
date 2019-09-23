package io.anchal.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import io.anchal.mapper.StudentRowMapper;
import io.anchal.model.Student;

@Repository
public class StudentRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int writeRecord(Student student) {

		return jdbcTemplate.update("insert into Student(id,name,gender)" + "values(?,?,?)",
				new Object[] { student.getId(), student.getName(), student.getGender() });
	}

	public List<Student> readRecord() {

		return jdbcTemplate.query("select * from student", new StudentRowMapper());
	}

	public int deleteById(int id) {

		return jdbcTemplate.update("delete from student where id=?", new Object[] { id });
	}

	public int updateRecord(Student student) {
		return jdbcTemplate.update("update student " + "set name=?, gender=?" + "where id=?",
				new Object[] { student.getName(), student.getGender(), student.getId() });
	}
}
