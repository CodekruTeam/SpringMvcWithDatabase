package com.codekru.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.codekru.model.Title;

@Repository
public class TitleDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void add(Title title) {
		 String sql = "insert into title (title_name, description) values (?, ?)";
		 jdbcTemplate.update(sql, title.getTitleName(),title.getDescription());
		}
}
