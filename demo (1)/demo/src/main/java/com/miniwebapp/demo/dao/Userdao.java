package com.miniwebapp.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.miniwebapp.demo.Rices.Rices;

public interface Userdao extends CrudRepository<Rices,Integer> {
	

}
