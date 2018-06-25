/**  
 * house_message  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HouseMessage;


public interface HouseMessageService {
	int addHouseMessage(HouseMessage HouseMessage);
	int modifyHouseMessage(HouseMessage HouseMessage);
	int delHouseMessage(HouseMessage HouseMessage);
	List<HouseMessage> getHouseMessageList();
	HouseMessage getHouseMessageInfo(int id);   
	int checkName(String name);
	List<HouseMessage> getHouseMessageList(String sql);
	List<HouseMessage> getLikeHouseMessageList(String name);
	List<HouseMessage> getHouseIndexShow();
	HouseMessage getHouseMessageIndexShowA();
	List<HouseMessage> getIndex();
	List<HouseMessage> getNewIndex();
	List<HouseMessage> getNewIndexSql(String sql);
	HouseMessage getHouseMessageforcon(int id);
	List<HouseMessage> getHouseforsearch(String str);
}