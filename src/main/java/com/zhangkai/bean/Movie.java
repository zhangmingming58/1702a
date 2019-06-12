package com.zhangkai.bean;
/**
 * 
 * @ClassName: Movie 
 * @Description: 实体类
 * @author: ZK
 * @date: 2019年6月11日 上午11:00:05
 */
public class Movie {
	
	private Integer mid;
	private String mname;
	private String editor;
	private double price;
	private String ontime;
	private int time;
	private String type;
	private int year;
	private String aera;
	private int status;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOntime() {
		return ontime;
	}
	public void setOntime(String ontime) {
		this.ontime = ontime;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getAera() {
		return aera;
	}
	public void setAera(String aera) {
		this.aera = aera;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", editor=" + editor + ", price=" + price + ", ontime="
				+ ontime + ", time=" + time + ", type=" + type + ", year=" + year + ", aera=" + aera + ", status="
				+ status + "]";
	}
	
	
}
