/**  
 * house_user  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HouseUser;


public interface HouseUserService {
	int addHouseUser(HouseUser HouseUser);
	int modifyHouseUser(HouseUser HouseUser);
	int delHouseUser(HouseUser HouseUser);
	List<HouseUser> getHouseUserList();
	HouseUser getHouseUserInfo(int id);   
}