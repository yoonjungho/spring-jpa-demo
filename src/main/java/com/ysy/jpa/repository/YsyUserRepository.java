package com.ysy.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ysy.jpa.entity.YsyUser;

public interface YsyUserRepository extends JpaRepository<YsyUser, String>{

	@Query("select a from YsyUser a inner join YsyGrp b on a.grpId = b.grpId")
	public List<Object[]> getUserInfo();
}
