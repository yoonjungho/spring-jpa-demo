package com.ysy.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "YSY_USER_MST")
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class YsyUser extends BaseEntity implements Serializable{
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long id ;
	
	//String username으로 한 이유는 스프링 정책상 변수를 맞춰주기 위해 , 다른걸로 하려면 셋팅을 좀 해야해서 그냥 db컬럼명을 지정해주고 처리함. 패스워드도 동일한 이유임.
	@Id
	@Column(name = "USER_ID" , length = 255 , nullable = false , unique = true)
	private String username;
	@Column(name = "USER_PW" , length = 255 , nullable = false)
	private String password;
	@Column(name = "USER_NM" , length = 255 , nullable = false)
	private String name;
	@Column(name = "USER_EMAIL")
	private String email;
	@Column(name = "USER_PHONE")
	private String phone; 
	@Column(name = "USER_GRP")
	private String grp; 
	
}
