/**  
 * house_user  
 * @author Doc.zhen
 *  
 */
package com.bdqn.entity;
import java.util.Date;
public class HouseUser implements java.io.Serializable{  
  private int id;/*???????id*/  
  private String userName;/*???????userName*/  
  private String passWord;/*???????passWord*/  
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
    public String getUserName(){    
      return userName;    
    }    
    public void setUserName(String userName){    
      this.userName = userName;    
    }    
    public String getPassWord(){    
      return passWord;    
    }    
    public void setPassWord(String passWord){    
      this.passWord = passWord;    
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