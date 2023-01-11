package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.servlet.ModelAndView;

public interface MyRepository extends CrudRepository<Emp, Integer>{

	public Emp findByName(String name);
	
	@Query("from Emp where sal>?1 ")
	public List<Emp> findEmpBySalGt(int sal);
}
