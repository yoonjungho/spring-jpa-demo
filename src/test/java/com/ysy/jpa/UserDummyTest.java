package com.ysy.jpa;

import java.util.Iterator;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ysy.jpa.entity.YsyGrp;
import com.ysy.jpa.entity.YsyUser;
import com.ysy.jpa.repository.YsyGrpRepository;
import com.ysy.jpa.repository.YsyUserRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserDummyTest {

	
	@Autowired
	private YsyUserRepository ysyUserRepository;
	
	@Autowired
	private YsyGrpRepository ysyGrpRepository;
	
	
	@Test
	void addUser() {
		System.out.println("1234556~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		YsyUser user = YsyUser.builder()
				  .email("asdasdasdsad@naver.com")              
				  .username("윤정호1243")
	              .password("1234")
	              .name("ddd")
	              .phone("12345")
	              .grp("YSY_GRP1")
	              .build();
		System.out.println(user);
		YsyUser tmp = ysyUserRepository.save(user);
		
	}
	
	@Test
	void addGrp() {
		System.out.println("1234556~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		YsyGrp grp = YsyGrp.builder().useYn("Y").grpNm("default 그룹").grpId("YSY_GRP1").build();
		ysyGrpRepository.save(grp);    
	
		   
	}
}
