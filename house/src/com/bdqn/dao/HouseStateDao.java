/**  
 * house_state  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseState;
public interface HouseStateDao{  
	int addHouseState(HouseState HouseState);
	int modifyHouseState(HouseState HouseState);
	int delHouseState(HouseState HouseState);
	List<HouseState> getHouseStateList();
	HouseState getHouseStateInfo(int id);   
}