package com.naufal.ThymeleafExercise.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = HomeModel.TABLE_NAME)
public class HomeModel {

	public static final String TABLE_NAME = "t_home";

	@Id
	@GeneratedValue
	@Column(name = "id_home")
	private Long id;

	@Column(name = "name_home")
	private String name;

	@Column(name = "email_home")
	private String email;

	@OneToOne
	private HomeDetailModel detailModel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public HomeDetailModel getDetailModel() {
		return detailModel;
	}

	public void setDetailModel(HomeDetailModel detailModel) {
		this.detailModel = detailModel;
	}

}
