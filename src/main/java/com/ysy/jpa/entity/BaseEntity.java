package com.ysy.jpa.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity  implements Serializable{


	@Column(name="REG_DT" ,updatable = false)
    protected LocalDateTime regDt;
	
	@Column(name="MOD_DT" )
	protected LocalDateTime modDt;
	
//	@Column(name="REG_DT")
//	private Timestamp regDt;
	
	@Column(name="REG_ID")
	public String regId;
	
	
//	@Column(name="MOD_DT")
//	private Timestamp modDt;
	
	@Column(name="MOD_ID")
	protected String modId;
	
	@PrePersist
    public void prePersist() {
        LocalDateTime now = LocalDateTime.now();
        regDt = now;
        modDt = now;
    }
	
	@PreUpdate
    public void preUpdate() {
		modDt = LocalDateTime.now();
    }
}
