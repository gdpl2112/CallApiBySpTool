package com.github.gdpl2112.cabs.step0.entity;

public class Data {
	private String date;
	private String tem_day;
	private String wea;
	private String wea_img;
	private String tem_night;
	private String win_speed;
	private String win;

	public String getDate(){
		return this.date;
	}

	public Data setDate(String date) {
		this.date = date;
		return this;
	}

	public String getTem_day(){
		return this.tem_day;
	}

	public Data setTem_day(String tem_day) {
		this.tem_day = tem_day;
		return this;
	}

	public String getWea(){
		return this.wea;
	}

	public Data setWea(String wea) {
		this.wea = wea;
		return this;
	}

	public String getWea_img(){
		return this.wea_img;
	}

	public Data setWea_img(String wea_img) {
		this.wea_img = wea_img;
		return this;
	}

	public String getTem_night(){
		return this.tem_night;
	}

	public Data setTem_night(String tem_night) {
		this.tem_night = tem_night;
		return this;
	}

	public String getWin_speed(){
		return this.win_speed;
	}

	public Data setWin_speed(String win_speed) {
		this.win_speed = win_speed;
		return this;
	}

	public String getWin(){
		return this.win;
	}

	public Data setWin(String win) {
		this.win = win;
		return this;
	}
}