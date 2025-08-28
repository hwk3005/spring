package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.dto.Board;

@Repository		// 생략가능(extends 넣을경우)	<Board,Integer>
public interface CustomerRepository extends JpaRepository<Board, Integer>{

	
	
}
