package com.gl.Assingnment2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.Assingnment2.bean.CompanyShare;


@Repository
public interface CompanyShareRepository  extends JpaRepository<CompanyShare,Long>{

	@Query("select max(companyId) from CompanyShare")
	public Long findMax();
	
}