package com.ysy.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ysy.jpa.entity.YsyUser;
import com.ysy.jpa.repository.YsyUserRepository;

@RestController
@RequestMapping("/auth")
public class YsyUserController {

	@Autowired
	private YsyUserRepository ysyUserRepository;
	
	@GetMapping("/join")
	public String joinTest() {
		System.out.println("joinTest start");
		YsyUser user = YsyUser.builder()
	              .username("1234")
	              .email("eee@naver.com")
	              .password("1234")
	              .name("ddd")
	              .phone("12345")
	              .grp("gfgggg")
	              .build();
		ysyUserRepository.save(user);
		System.out.println("end");
		return "join ~~~~~~~~~~~~~~~";
	}
	
}
