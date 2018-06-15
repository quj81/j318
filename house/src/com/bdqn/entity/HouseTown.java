/**  
 * house_town  
 * @author Doc.zhen
 *  
 */
package com.bdqn.entity;
import java.util.Date;
public class HouseTown implements java.io.Serializable{  
  private int id;/*???????id*/  
  private String townName;/*???????townName*/  
  private int provinceId;/*???????provinceId*/  
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
    public String getTownName(){    
      return townName;    
    }    
    public void setTownName(String townName){    
      this.townName = townName;    
    }    
    public int getProvinceId(){    
      return provinceId;    
    }    
    public void setProvinceId(int provinceId){    
      this.provinceId = provinceId;    
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