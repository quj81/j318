/**  
 * house_message  
 * @author Doc.zhen
 *  
 */
package com.bdqn.entity;
import java.util.Date;
public class HouseMessage implements java.io.Serializable{  
  private int id;/*???????id*/  
  private int provinceId;/*???????provinceId*/  
  private int townId;/*???????townId*/  
  private int areaId;/*???????areaId*/  
  private String houseName;/*???????houseName*/  
  private double startPrice;/*???????startPrice*/  
  private double averagePrice;/*???????averagePrice*/  
  private int houseType;/*???????houseType*/  
  private double coveredArea;/*???????coveredArea*/  
  private int finishState;/*???????finishState*/  
  private double greenRate;/*???????greenRate*/  
  private double plotRatio;/*???????plotRatio*/  
  private Date checkTime;/*???????checkTime*/  
  private Date openTime;/*???????openTime*/  
  private String realCompany;/*???????realCompany*/  
  private double propertyFee;/*???????propertyFee*/  
  private String licence;/*???????licence*/  
  private String developers;/*???????developers*/  
  private String salesAddress;/*???????salesAddress*/  
  private String feature;/*???????feature*/  
  private String address;/*???????address*/  
  private int state;/*???????state*/  
  private String addUser;/*???????addUser*/  
  private Date addTime;/*???????addTime*/  
  private String updateUser;/*???????updateUser*/  
  private Date updateTime;/*???????updateTime*/  
  private String checkTime1;
  private String openTime1;
  private int property;
  private String province;
  private String town;
  private String area;
  private String pictureURL;
  private String townName;
  private String areaName;
  private double x;
  private double y;
  private String finishstatename;
  private String propertyType;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getProvinceId() {
	return provinceId;
}
public void setProvinceId(int provinceId) {
	this.provinceId = provinceId;
}
public int getTownId() {
	return townId;
}
public void setTownId(int townId) {
	this.townId = townId;
}
public int getAreaId() {
	return areaId;
}
public void setAreaId(int areaId) {
	this.areaId = areaId;
}
public String getHouseName() {
	return houseName;
}
public void setHouseName(String houseName) {
	this.houseName = houseName;
}
public double getStartPrice() {
	return startPrice;
}
public void setStartPrice(double startPrice) {
	this.startPrice = startPrice;
}
public double getAveragePrice() {
	return averagePrice;
}
public void setAveragePrice(double averagePrice) {
	this.averagePrice = averagePrice;
}
public int getHouseType() {
	return houseType;
}
public void setHouseType(int houseType) {
	this.houseType = houseType;
}
public double getCoveredArea() {
	return coveredArea;
}
public void setCoveredArea(double coveredArea) {
	this.coveredArea = coveredArea;
}
public int getFinishState() {
	return finishState;
}
public void setFinishState(int finishState) {
	this.finishState = finishState;
}
public double getGreenRate() {
	return greenRate;
}
public void setGreenRate(double greenRate) {
	this.greenRate = greenRate;
}
public double getPlotRatio() {
	return plotRatio;
}
public void setPlotRatio(double plotRatio) {
	this.plotRatio = plotRatio;
}
public Date getCheckTime() {
	return checkTime;
}
public void setCheckTime(Date checkTime) {
	this.checkTime = checkTime;
}
public Date getOpenTime() {
	return openTime;
}
public void setOpenTime(Date openTime) {
	this.openTime = openTime;
}
public String getRealCompany() {
	return realCompany;
}
public void setRealCompany(String realCompany) {
	this.realCompany = realCompany;
}
public double getPropertyFee() {
	return propertyFee;
}
public void setPropertyFee(double propertyFee) {
	this.propertyFee = propertyFee;
}
public String getLicence() {
	return licence;
}
public void setLicence(String licence) {
	this.licence = licence;
}
public String getDevelopers() {
	return developers;
}
public void setDevelopers(String developers) {
	this.developers = developers;
}
public String getSalesAddress() {
	return salesAddress;
}
public void setSalesAddress(String salesAddress) {
	this.salesAddress = salesAddress;
}
public String getFeature() {
	return feature;
}
public void setFeature(String feature) {
	this.feature = feature;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
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
public String getCheckTime1() {
	return checkTime1;
}
public void setCheckTime1(String checkTime1) {
	this.checkTime1 = checkTime1;
}
public String getOpenTime1() {
	return openTime1;
}
public void setOpenTime1(String openTime1) {
	this.openTime1 = openTime1;
}
public int getProperty() {
	return property;
}
public void setProperty(int property) {
	this.property = property;
}
public String getProvince() {
	return province;
}
public void setProvince(String province) {
	this.province = province;
}
public String getTown() {
	return town;
}
public void setTown(String town) {
	this.town = town;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getPictureURL() {
	return pictureURL;
}
public void setPictureURL(String pictureURL) {
	this.pictureURL = pictureURL;
}
public String getTownName() {
	return townName;
}
public void setTownName(String townName) {
	this.townName = townName;
}
public String getAreaName() {
	return areaName;
}
public void setAreaName(String areaName) {
	this.areaName = areaName;
}
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
public String getFinishstatename() {
	return finishstatename;
}
public void setFinishstatename(String finishstatename) {
	this.finishstatename = finishstatename;
}
public String getPropertyType() {
	return propertyType;
}
public void setPropertyType(String propertyType) {
	this.propertyType = propertyType;
}

}