package com.dto.classlist;

import org.apache.ibatis.type.Alias;

@Alias("classlistDTO")
public class classlistDTO{
	int classNum;
	String className;
	String userId;
	int price;
	String schedule1;
	String place;
	String subcategory;
	String id;
	String name;
	String classphoto1;
	public classlistDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public classlistDTO(int classNum, String className, String userId, int price, String schedule1, String place,
			String subcategory, String id, String name, String classphoto1) {
		super();
		this.classNum = classNum;
		this.className = className;
		this.userId = userId;
		this.price = price;
		this.schedule1 = schedule1;
		this.place = place;
		this.subcategory = subcategory;
		this.id = id;
		this.name = name;
		this.classphoto1 = classphoto1;
	}
	@Override
	public String toString() {
		return "classlistDTO [classNum=" + classNum + ", className=" + className + ", userId=" + userId + ", price="
				+ price + ", schedule1=" + schedule1 + ", place=" + place + ", subcategory=" + subcategory + ", id="
				+ id + ", name=" + name + ", classphoto1=" + classphoto1 + "]";
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSchedule1() {
		return schedule1;
	}
	public void setSchedule1(String schedule1) {
		this.schedule1 = schedule1;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassphoto1() {
		return classphoto1;
	}
	public void setClassphoto1(String classphoto1) {
		this.classphoto1 = classphoto1;
	}
	
	

	
}//end class