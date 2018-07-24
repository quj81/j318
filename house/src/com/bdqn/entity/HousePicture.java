/**  
 * house_picture  
 * @author Doc.zhen
 *  
 */
package com.bdqn.entity;
import java.util.Date;
public class HousePicture implements java.io.Serializable{  
  private int id;/*???????id*/  
  private String pictureURL;/*???????pictureURL*/  
  private int houseId;/*???????houseName*/  
  private int pictureType;/*???????pictureType*/  
  private String addUser;/*???????addUser*/  
  private Date addTime;/*???????addTime*/  
  private String updateUser;/*???????updateUser*/  
  private Date updateTime;/*???????updateTime*/  
  private int adminpic;
  
    public int getAdminpic() {
	return adminpic;
}
public void setAdminpic(int adminpic) {
	this.adminpic = adminpic;
}
	public int getId(){    
      return id;    
    }    
    public void setId(int id){    
      this.id = id;    
    }    
    public String getpictureURL(){    
      return pictureURL;    
    }    
    public void setpictureURL(String pictureURL){    
      this.pictureURL = pictureURL;    
    }    
    public int getHouseId(){    
      return houseId;    
    }    
    public void setHouseId(int houseId){    
      this.houseId = houseId;    
    }    
    public int getPictureType(){    
      return pictureType;    
    }    
    public void setPictureType(int pictureType){    
      this.pictureType = pictureType;    
    }    
    public String getAddUser(){    
      return addUser;    
    }    
    public void setAddUser(String addUser){    
      this.addUser = addUser;    
    }    
    public Date getAddTime(){    
      return addTime;    
    }    
    public void setAddTime(Date addTime){    
      this.addTime = addTime;    
    }    
    public String getUpdateUser(){    
      return updateUser;    
    }    
    public void setUpdateUser(String updateUser){    
      this.updateUser = updateUser;    
    }    
    public Date getUpdateTime(){    
      return updateTime;    
    }    
    public void setUpdateTime(Date updateTime){    
      this.updateTime = updateTime;    
    }    
}