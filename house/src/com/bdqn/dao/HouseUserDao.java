/**  
 * house_user  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseUser;
public interface HouseUserDao{  
	int addHouseUser(HouseUser HouseUser);
	int modifyHouseUser(HouseUser HouseUser);
	int delHouseUser(HouseUser HouseUser);
	List<HouseUser> getHouseUserList();
	HouseUser getHouseUserInfo(int id);   
}