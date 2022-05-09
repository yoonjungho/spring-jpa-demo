package com.ysy.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "YSY_GRP_MST")
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class YsyGrp {

	@Id
	@Column(length = 50 , name = "GRP_ID")
	private String grpId;
	@Column(length= 50 , name = "GRP_NM")
	private String grpNm;
	@Column(length = 1 , name = "USE_YN")
	private String useYn;
}
