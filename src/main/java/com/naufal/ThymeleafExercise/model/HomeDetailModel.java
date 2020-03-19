package com.naufal.ThymeleafExercise.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = HomeDetailModel.TABLE_NAME)
public class HomeDetailModel {
	
	public static final String TABLE_NAME = "t_home_detail";

	@Id
	@GeneratedValue
	private Long id;
	
	private String alamat;

	private String[] hobi;

	private Date tanggal;

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String[] getHobi() {
		return hobi;
	}

	public void setHobi(String[] hobi) {
		this.hobi = hobi;
	}

	public Date getTanggal() {
		return tanggal;
	}

	public void setTanggal(Date tanggal) {
		this.tanggal = tanggal;
	}

	/*
	 * public HomeDetailModel(String alamat, String hobi) { super(); this.alamat =
	 * alamat; this.hobi = hobi; }
	 */

}
