/**  
 * house_news  
 * @author Doc.zhen
 *  
 */
package com.bdqn.entity;
import java.util.Date;
public class HouseNews implements java.io.Serializable{  
  private int id;/*???????id*/  
  private String title;/*???????title*/  
  private int referType;/*???????referType*/  
  private String content;/*???????content*/  
  private String author;/*???????author*/  
  private Date dateTime;/*???????dateTime*/  
  private String pictureURL;/*???????pictureURL*/  
  private String addUser;/*???????addUser*/  
  private Date addTime;/*???????addTime*/  
  private String updateUser;/*???????updateUser*/  
  private Date updateTime;/*???????updateTime*/  
  private String time;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getReferType() {
	return referType;
}
public void setReferType(int referType) {
	this.referType = referType;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Date getDateTime() {
	return dateTime;
}
public void setDateTime(Date dateTime) {
	this.dateTime = dateTime;
}
public String getPictureURL() {
	return pictureURL;
}
public void setPictureURL(String pictureURL) {
	this.pictureURL = pictureURL;
}
public String getAddUser() {
	return addUser;
}
public void setAddUser(String addUser) {
	this.addUser = addUser;
}
public Date getAddTime() {
	return addTime;
}
public void setAddTime(Date addTime) {
	this.addTime = addTime;
}
public String getUpdateUser() {
	return updateUser;
}
public void setUpdateUser(String updateUser) {
	this.updateUser = updateUser;
}
public Date getUpdateTime() {
	return updateTime;
}
public void setUpdateTime(Date updateTime) {
	this.updateTime = updateTime;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
   
}