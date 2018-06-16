/**  
 * house_message  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseMessage;
public interface HouseMessageDao{  
	int checkName(String name);
	int addHouseMessage(HouseMessage HouseMessage);
	int modifyHouseMessage(HouseMessage HouseMessage);
	int delHouseMessage(HouseMessage HouseMessage);
	List<HouseMessage> getHouseMessageList();
	HouseMessage getHouseMessageInfo(int id);   
}