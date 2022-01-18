package com.github.gdpl2112.cabs.step0.entity;

/**
 * @author github-kloping
 */
public class SevenWeather {
	private String msg;
	private String update_time;
	private Number code;
	private Data[] data;
	private String city;
	private String cityid;

	public String getMsg(){
		return this.msg;
	}

	public SevenWeather setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	public String getUpdate_time(){
		return this.update_time;
	}

	public SevenWeather setUpdate_time(String update_time) {
		this.update_time = update_time;
		return this;
	}

	public Number getCode(){
		return this.code;
	}

	public SevenWeather setCode(Number code) {
		this.code = code;
		return this;
	}

	public Data[] getData(){
		return this.data;
	}

	public SevenWeather setData(Data[] data) {
		this.data = data;
		return this;
	}

	public String getCity(){
		return this.city;
	}

	public SevenWeather setCity(String city) {
		this.city = city;
		return this;
	}

	public String getCityid(){
		return this.cityid;
	}

	public SevenWeather setCityid(String cityid) {
		this.cityid = cityid;
		return this;
	}
}