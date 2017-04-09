package com.hehaoyisheng.testSeller.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stock")
@Scope("prototype")
@Entity
@Table(name = "stock")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private int commodity_id;
	private String commodity_name;
	private int commodity_count;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCommodity_id() {
		return commodity_id;
	}

	public void setCommodity_id(int commodity_id) {
		this.commodity_id = commodity_id;
	}

	public String getCommodity_name() {
		return commodity_name;
	}

	public void setCommodity_name(String commodity_name) {
		this.commodity_name = commodity_name;
	}

	public int getCommodity_count() {
		return commodity_count;
	}

	public void setCommodity_count(int commodity_count) {
		this.commodity_count = commodity_count;
	}

	public Stock(Integer id, int commodity_id, String commodity_name,
			int commodity_count) {
		super();
		this.id = id;
		this.commodity_id = commodity_id;
		this.commodity_name = commodity_name;
		this.commodity_count = commodity_count;
	}

	public Stock() {
		super();
	}

}
