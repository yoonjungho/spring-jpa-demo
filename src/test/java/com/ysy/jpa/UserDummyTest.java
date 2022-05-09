package com.ysy.jpa;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ysy.jpa.entity.YsyGrp;
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
//		System.out.println("1234556~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		YsyUser user = YsyUser.builder()
//				  .username("yjh")
//				  .password("1234")
//				  .email("asdasdasdsad@naver.com")              
//	              .name("ddd")
//	              .phone("12345")
//	              .grp(GrpEnum.USER_GROUP.toString())
//	              .build();
//		System.out.println(user);
//		YsyUser tmp = ysyUserRepository.save(user);
		
		List<Object[]> temp = ysyUserRepository.getUserInfo();
		System.out.println("1234");
		
	}
	
	@Test
	void addGrp() {
		System.out.println("1234556~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		YsyGrp grp = YsyGrp.builder().useYn("Y").grpNm("default 그룹").grpId("USER_GRP").build();
		ysyGrpRepository.save(grp);  
		
		IntStream.rangeClosed(0, 10).forEach(i->{
			System.out.println("==========="+i);
		});
		   
	}
}
