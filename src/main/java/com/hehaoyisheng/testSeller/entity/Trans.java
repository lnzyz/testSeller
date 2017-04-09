package com.hehaoyisheng.testSeller.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("trans")
@Scope("prototype")
@Entity
@Table(name = "trans")
public class Trans {
	private Integer id;
	private String message_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage_id() {
		return message_id;
	}

	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}

	public Trans(Integer id, String message_id) {
		super();
		this.id = id;
		this.message_id = message_id;
	}

	public Trans() {
		super();
	}
}
