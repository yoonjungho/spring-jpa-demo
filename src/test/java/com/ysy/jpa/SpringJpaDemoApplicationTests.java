package com.ysy.jpa;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ysy.jpa.entity.YsyUser;
import com.ysy.jpa.repository.YsyUserRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
class SpringJpaDemoApplicationTests {

	@Autowired
	private YsyUserRepository ysyUserRepository;
	
	
	@Test
	void contextLoads() {
		System.out.println("1234556~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		YsyUser user = YsyUser.builder()
				              .username("222")
				              .email("eee@naver.com")
				              .password("1234")
				              .name("ddd")
				              .phone("12345")
				              .grp("gfgggg")
				              .build();
		System.out.println(user);
		YsyUser tmp = ysyUserRepository.save(user);
		
		System.out.println("temp = " + tmp);
	}

}
