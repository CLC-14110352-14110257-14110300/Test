package com.group7;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface DaoTin extends JpaRepository<ModelTin, Integer>{
	
}

