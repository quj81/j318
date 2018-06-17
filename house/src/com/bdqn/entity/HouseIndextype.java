/**  
 * house_indextype  
 * @author Doc.zhen
 *  
 */
package com.bdqn.entity;

import java.util.Date;

public class HouseIndextype implements java.io.Serializable{  
  private int id;/*???????id*/  
  private String typeName;/*???????typeName*/  
  private Date adduser;/*???????adduser*/  
  private String addtime;/*???????addtime*/  
  private Date updateuser;/*???????updateuser*/  
  private String updatetime;/*???????updatetime*/  
    public int getId(){    
      return id;    
    }    
    public void setId(int id){    
      this.id = id;    
    }    
    public String getTypeName(){    
      return typeName;    
    }    
    public void setTypeName(String typeName){    
      this.typeName = typeName;    
    }    
    public Date getAdduser(){    
      return adduser;    
    }    
    public void setAdduser(Date adduser){    
      this.adduser = adduser;    
    }    
    public String getAddtime(){    
      return addtime;    
    }    
    public void setAddtime(String addtime){    
      this.addtime = addtime;    
    }    
    public Date getUpdateuser(){    
      return updateuser;    
    }    
    public void setUpdateuser(Date updateuser){    
      this.updateuser = updateuser;    
    }    
    public String getUpdatetime(){    
      return updatetime;    
    }    
    public void setUpdatetime(String updatetime){    
      this.updatetime = updatetime;    
    }    
}