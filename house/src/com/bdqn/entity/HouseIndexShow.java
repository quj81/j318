/**  
 * house_index_show  
 * @author Doc.zhen
 *  
 */
package com.bdqn.entity;
import java.util.Date;
public class HouseIndexShow implements java.io.Serializable{  
  private int id;/*???????id*/  
  private int indextype;/*???????indextype*/  
  private int indexid;/*???????indexid*/  
  private Date adduser;/*???????adduser*/  
  private String addtime;/*???????addtime*/  
  private Date updateuser;/*???????updateuser*/  
  private String updatetime;/*???????updatetime*/  
  private int showtype;
  
  public int getShowtype() {
	return showtype;
}
public void setShowtype(int showtype) {
	this.showtype = showtype;
}
    public int getId(){    
      return id;    
    }    
    public void setId(int id){    
      this.id = id;    
    }    
    public int getIndextype(){    
      return indextype;    
    }    
    public void setIndextype(int indextype){    
      this.indextype = indextype;    
    }    
    public int getIndexid(){    
      return indexid;    
    }    
    public void setIndexid(int indexid){    
      this.indexid = indexid;    
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