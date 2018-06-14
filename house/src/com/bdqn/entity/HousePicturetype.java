/**  
 * house_picturetype  
 * @author Doc.zhen
 *  
 */
package com.bdqn.entity;
import java.util.Date;
public class HousePicturetype implements java.io.Serializable{  
  private int id;/*???????id*/  
  private String pictureType;/*???????pictureType*/  
  private String addUser;/*???????addUser*/  
  private Date addTime;/*???????addTime*/  
  private String updateUser;/*???????updateUser*/  
  private Date updateTime;/*???????updateTime*/  
    public int getId(){    
      return id;    
    }    
    public void setId(int id){    
      this.id = id;    
    }    
    public String getPictureType(){    
      return pictureType;    
    }    
    public void setPictureType(String pictureType){    
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